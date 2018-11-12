/*
    Basic FizzBuzz:
    Write a function which prints out the numbers 1-100, with the following substitutions:
    Each multiple of 3 replaced with 'fizz'
    Each multiple of 5 replaced with 'buzz'
    Each multiple of both 3 and 5 replaced with 'fizzbuzz'
*/
function fizzBuzz1(){
    for(i=1;i<=100;i++)
    {
        if (i%3 == 0 && i%5 ==0)
        {
            ans='fizzbuzz';
            console.log(ans);
        }
        else if (i%3 == 0)
        {
            ans='fizz';
            console.log(ans);
        }

        else if (i%5 == 0)
        {
            ans='buzz';
            console.log(ans);
        }
        
        else 
        {
            console.log(i);
        }
    }
}

/*
    Variable-length FizzBuzz:
    Write a function which prints out the numbers m-n, with the following substitutions:
    Each multiple of 3 replaced with 'fizz'
    Each multiple of 5 replaced with 'buzz'
    Each multiple of both 3 and 5 replaced with 'fizzbuzz'
    Validation that m <= n is a plus. 
*/
function fizzBuzz2(m,n){
    for(m;m<=n;m++)
    {
        if (m%3 == 0 && m%5 ==0)
        {
            ans='fizzbuzz';
            console.log(ans);
        }
        else if (m%3 == 0)
        {
            ans='fizz';
            console.log(ans);
        }

        else if (m%5 == 0)
        {
            ans='buzz';
            console.log(ans);
        }
        
        else 
        {
            console.log(m);
        }
    }
}

/*
    Variable-length, varying-fizz/buzz number FizzBuzz:
    Write a function which prints out the numbers m-n, with the following substitutions:
    Each multiple of fizzNum replaced with 'fizz'
    Each multiple of buzzNum replaced with 'buzz'
    Each multiple of both fizzNum and BuzzNum replaced with 'fizzbuzz'
    Validation that m <= n is a plus. 
*/
function fizzBuzz3(m,n,fizzNum,buzzNum){
    for(m;m<=n;m++)
    {
        if (m%fizzNum == 0 && m%buzzNum ==0)
        {
            ans='fizzbuzz';
            console.log(ans);
        }
        else if (m%fizzNum == 0)
        {
            ans='fizz';
            console.log(ans);
        }

        else if (m%buzzNum == 0)
        {
            ans='buzz';
            console.log(ans);
        }
        
        else 
        {
            console.log(m);
        }
    }
}

/*
    Variable-length FizzBuzz with arrays:
    Write a function which prints out the numbers m-n with substitutions of: 
    each element of the numbers array replaced by the element at the same index of the terms array.
    e.g., to mimic the behavior of fizzBuzz1, you would call the function like so:
    fizzBuzz4(1,100,[3,5],['fizz','buzz'])
    Validation the m <= n is a plus. 
    The arrays may have any length, but validation that their length is the SAME is a plus. 
*/
function fizzBuzz4(m,n,numbers,terms){
    for(m;m<=n;m++)
    {
        if (m%numbers[0] == 0 && m%numbers[1] == 0)
        {
            ans = terms[0]+terms[1];
            console.log(ans);
        }
        
        else if (m%numbers[0] == 0)
        {
            ans = terms[0];
            console.log(ans);
        }
        else if (m%numbers[1] == 0)
        {
            ans = terms[1];
            console.log(ans);
        }
        else 
        {
            console.log(m);
        }
    }

}


