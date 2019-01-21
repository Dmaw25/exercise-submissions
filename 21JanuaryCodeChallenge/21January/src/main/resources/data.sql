INSERT INTO USER_ROLE VALUES (1, 'Customer');
INSERT INTO USER_ROLE VALUES (2, 'Employee');
INSERT INTO USER_ROLE VALUES (3, 'Manager');

Insert into USER (USER_ID,USER_NAME,PASSWORD,USER_ROLE_ID) values (1,'dmaw','qwerty',3);
Insert into USER (USER_ID,USER_NAME,PASSWORD,USER_ROLE_ID) values (2,'Titus','Andronicus',1);
Insert into USER (USER_ID,USER_NAME,PASSWORD,USER_ROLE_ID) values (3,'Atlas','Shruged',1);
Insert into USER (USER_ID,USER_NAME,PASSWORD,USER_ROLE_ID) values (4,'Edgar','Poe',2);
Insert into USER (USER_ID,USER_NAME,PASSWORD,USER_ROLE_ID) values (5,'Berry','Bear',1);
Insert into USER (USER_ID,USER_NAME,PASSWORD,USER_ROLE_ID) values (6,'Cu','Cullain',1);
Insert into USER (USER_ID,USER_NAME,PASSWORD,USER_ROLE_ID) values (7,'Holy','Grail',2);

COMMIT;