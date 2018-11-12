/*
    Basic FizzBuzz:
    Write a function which prints out the numbers 1-100, with the following substitutions:
    Each multiple of 3 replaced with 'fizz'
    Each multiple of 5 replaced with 'buzz'
    Each multiple of both 3 and 5 replaced with 'fizzbuzz'
*/
function fizzBuzz1(){
    let num = 1;
    let num3 = "fizz";
    let num5 = "buzz";
    let num35 = "fizzbuzz";
    for (let i = 1; i <= 100; i++){
        num = i;
        if (i % 3 === 0 && i % 5 === 0) {
            num = num35;
        } else if (i % 3 === 0) {
            num = num3;
        } else if (i % 5 === 0) {
            num = num5;
        }
        console.log(num)
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
    let num = 1;
    let num3 = "fizz";
    let num5 = "buzz";
    let num35 = "fizzbuzz";
    for (let i = m; i <= n; i++){
        num = i;
        if (i % 3 === 0 && i % 5 === 0) {
            num = num35;
        } else if (i % 3 === 0) {
            num = num3;
        } else if (i % 5 === 0) {
            num = num5;
        }
        console.log(num)
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
    let num = 1;
    for (let i = m; i <= n; i++){
        num = i;
        if (i % fizzNum === 0 && i % buzzNum === 0) {
            num = 'fizzbuzz';
        } else if (i % fizzNum === 0) {
            num = 'fizz';
        } else if (i % buzzNum === 0) {
            num = 'buzz';
        }
        console.log(num)
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
    let num = 1;
    /*let numbers = [x,y];
    let terms = ["a","b","c"];*/
    for (let i = m; i <= n; i++){
        num = i;
        if (i % numbers[0] === 0 && i % numbers[1] === 0) {
            num = terms[2];
        } else if (i % numbers[0] === 0) {
            num = terms[0];
        } else if (i % numbers[1] === 0) {
            num = terms[1];
        }
        console.log(num)
    }
}


