
--Hw Begins Here--
--Section 2--
--2.1--
Select * FROM Employee;
Select * From Employee Where LastName = 'King';
Select * From Employee Where FirstName = 'Andrew' And REPORTSTO = NULL;
/
--2.2--
Select * From Album Order By Title DESC;
Select * From Customer Where FirstName Order by City Asc;
/--2.3--
Insert Into Genre (GenreId, Name) Values(26, 'Bachata');
Insert Into Genre (GenreId, Name) Values(27, 'Marenge');
/
Insert Into Employee(EmployeeId, LastName, FirstName, Title, ReportsTo, BirthDate, HireDate, Adress, City, State, Country, PostalCode, Phone, Fax,Email,SupportRepId)
Values(101, 'Micheal','Micha','Programmer',4,To_Date('1995-26-05 00:00:00','yyyy-mm-dd hh24:mi:ss'), To_Date('2014-06-05 00:00:00','yyyy-mm-dd hh24:mi:ss'),'65 BlackWoodDrive','New York','New York', 'USA', '10801','1-914-679-6378','1-914-679-6378','PokeFreak@gmail.com');
/
Insert Into Employee(EmployeeId, LastName, FirstName, Title, ReportsTo, BirthDate, HireDate, Adress, City, State, Country, PostalCode, Phone, Fax,Email)
Values(102, 'Juliane','Bail','Artist','Luke Valentine',To_Date('1995-26-05 00:00:00','yyyy-mm-dd hh24:mi:ss'), To_Date('2014-06-05 00:00:00','yyyy-mm-dd hh24:mi:ss'),'26 BlackWoodDrive','New York','New York', 'USA', '10801','1-914-309-6008','1-914-396-4311','Android29@gmail.com');
/
Insert Into Customer (CustomerID,FirstName, LastName, Company, Address,City, State, Country, PostalCode, Phone, Fax, Email, SupportRepId) 
Values(102, 'Patty','Patterson','Verision','18 Statesman Street','New York', 'New York', 'USA', '10801', '1-212-873-4923','1-212-584-6911', 'PatPat@gmail.com', 102);
/
Insert Into Customer (CustomerID,FirstName, LastName, Company, Address,City, State, Country, PostalCode, Phone, Fax, Email, SupportRepId) 
Values(101, 'Don','Dommers','AT&T','12 Statesman Street','New York', 'New York', 'USA', '10801', '1-212-823-6157','1-212-183-8325', 'DonDon@gmail.com', 101);
/
--2.4--
Update Customer
Set FirstName := 'Robert Walter'
Where FirstName = 'Aaron Mitchell';
/
Update Customer
Set FirstName := 'CCR'
Where FirstName = 'Creedence Clearwater Revival';
/
--2.5--
Select * 
From Invoice
Where BillingAdress Like 'T%';
/
--2.6--
Select * 
From Invoice
Where Total Between 15 And 50;
/
Select * 
From Employee
Where HiredDate Between To_Date('2010-06-05 00:00:00','yyyy-mm-dd hh24:mi:ss') And To_Date('2015-06-05 00:00:00','yyyy-mm-dd hh24:mi:ss');
/
--2.7--
Delete Customer 
Where FirstName = 'Robert' 
And LastName = 'Walter';
/
--Section 3--
Create or Replace Function getSysdate
Return Date 
Is
  l_sysdate Date;
Begin
  Select Sysdate
    Into l_sysdate
    From dual;
  Return l_sysdate;
End;
/
Select getSysdate() 
From dual;
/
--Count Function
Select Count(Name) from  MEDIATYPE;
/
--Average Function
Select AVG(Total) From Invoice;
/
--Max Function
Select * 
From Track
Where UNITPRICE = (Select Max(UNITPRICE)From Track);
/
--Make an average function from invoice line and invoiceline
Select Round(Avg(UNITPRICE),2) 
From InvoiceLine;
/
--Create a function tht returns all employees after 1968
Select * From Employee Where BirthDate > To_Date('1968-1-01 00:00:00','yyyy-mm-dd hh24:mi:ss');
/
--Create a stored dprocedure for first and last name
Create Procedure Names
As
Select Firstname, Lastname From Customer
Go;
Exec Names;
/
--Procedure thhat update employee imfo
/
Create Procedure UpdateInfo
As
Update Fax From Employee
Go;
Exec UpdateInfo := '212-343-2611';
--Procedure that returns manager of employees
/
Create Procedure Managers
As 
Select ReportTo From Employee
Go;
Exec Managers;
--Create stored procedure that returns the name and companies of customers
/
Create Procedure CutomerInfo
As
Select Firstname, Company From Customer
Go;
Exec CustomerInfo;
/
--Section 5--
Create or replace Procedure TestTransaction(ID In Number)
As
Begin
Delete 
From Invoice
Where InvoiceId = ID
End;
TestTransaction(32);
/
--Section 6--
Create or replace Trigger Fire
On Name From Employee
AFTER Insert
as  RaisError('Sorry, we are letting you go',16,10);
/
Create or replace Trigger Fire
On Name From Employee
AFTER Update
as  RaisError('Sorry, we are letting you go',16,10);
/
Create or replace Trigger Fire
On Name From Employee
AFTER Delete
as  RaisError('Sorry, we are letting you go',16,10);
/
--Section 7--
--7.1--
Select Name, InvoiceID
From Customer
Inner Join Invoice
On Customer.CutomerId, Invoice.CustomerId;
/
Select InvoiceID, FirstName, LastName, CustomerId
From Customer
Outer Join Invoice
On Customer.CutomerId, Invoice.CustomerId;
/
Select Name, Title
From Artist
Right Join Album
On Artist.ArtistId, Albumn.ArtistId;
/
Select *
From Artist
Cross Join Albumn
On Artist.ArtistId, Albumn.ArtistId Order by ASC;
/
Select Customer.Name, Invoice.InvoiceId
From Customer
Self Join Invoice
On Customer.CutomerId, Invoice.CustomerId;
/