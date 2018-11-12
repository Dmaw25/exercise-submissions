/*
    Basic FizzBuzz:
    Write a function which prints out the numbers 1-100, with the following substitutions:
    Each multiple of 3 replaced with 'fizz'
    Each multiple of 5 replaced with 'buzz'
    Each multiple of both 3 and 5 replaced with 'fizzbuzz'
*/
function fizzBuzz1(){
    for(n=0; n<=100; n++){
        if (n % 3 == 0 && n % 5 == 0){
            console.log("fizzbuzz")
        } else if (n % 3 == 0){
            console.log("fizz")
        } else if (n % 5 == 0) {
            console.log("buzz")
        } else {
            console.log(n)
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
    while (m <= n){
        if (m % 3 == 0 && m % 5 == 0){
            console.log("fizzbuzz");
            m++;
        } else if (m % 3 == 0){
            console.log("fizz");
            m++;
        } else if (m % 5 == 0){
            console.log("buzz");
            m++;
        } else {
            console.log(m)
            m++;
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
    while (m <= n){
        if (m % fizzNum == 0 && m % buzzNum == 0){
            console.log("fizzbuzz");
            m++;
        } else if (m % fizzNum == 0) {
            console.log("fizz");
            m++;
        } else if (m % buzzNum == 0) {
            console.log("buzz");
            m++;
        } else {
            console.log(m);
            m++;
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
    while (m <= n){
        //As far as this part goes, I know that I should make some kind of a loop to take care of the values for the other
        //variables as well as determining the number of other variables that there should be, but I'm not sure how to do 
        //that as of yet...
        //Therefore, this function will work iff the user enters a number and terms array of 3 numbers and 3 terms respectively.
        let a = 2;
        let b = 1;
        let c = 0;
        if (m % numbers[a] == 0){
            console.log(terms[a]);
            m++;
        } else if (m % numbers[b] == 0){
            console.log(terms[b]);
            m++;
        } else if (m % numbers[c] == 0){
            console.log(terms[c]);
            m++;
        } else {
            console.log(m);
            m++;
        }
    }
}


