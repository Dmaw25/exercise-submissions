/*
    Basic FizzBuzz:
    Write a function which prints out the numbers 1-100, with the following substitutions:
    Each multiple of 3 replaced with 'fizz'
    Each multiple of 5 replaced with 'buzz'
    Each multiple of both 3 and 5 replaced with 'fizzbuzz'
*/
function fizzBuzz1(){
        for(i=1; i<101; i++)
        if( i % 3 == 0 && i % 5 == 0){
            console.log("fizzbuzz");
        }
        else if(i % 3 == 0){
            console.log("fizz");
        }
        else if(i % 5 == 0){
            console.log("buzz");
        }
        else {
            console.log(i);
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
    var number = m;
    var number = n;
    
    
    function fizzBuzz2(m,n){
        for(i = m; i <=n; i++)
        {
            console.log(i);
    
            for(i = m; i <=n; i++)
            if( i % 3 == 0 && i % 5 == 0){
                console.log("fizzbuzz");
            }
            else if(i % 3 == 0){
                console.log("fizz");
            }
            else if(i % 5 == 0){
                console.log("buzz");
             }
            else {
                console.log(i);
            }
        }
        if(m<=n){
            console.log("validated")
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
    function fizzBuzz4(m,n,fizzNum,buzzNum){
    
        for(i = m, n; i < 101; m++, n++)
        {
            console.log(i);
    
            for(i=1; i<101; i++)
            if( i % fizzNum == 0 && i % buzzNum == 0){
                console.log("fizzbuzz");
            }
            else if(i % fizzNum == 0){
                console.log("fizz");
            }
            else if(i % buzzNum == 0){
                console.log("buzz");
             }
            else {
                console.log(i);
            }
        }
        if(m<=n){
            console.log("validated")
        }
    }
    
    




