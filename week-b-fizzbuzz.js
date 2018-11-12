/*
    Basic FizzBuzz:
    Write a function which prints out the numbers 1-100, with the following substitutions:
    Each multiple of 3 replaced with 'fizz'
    Each multiple of 5 replaced with 'buzz'
    Each multiple of both 3 and 5 replaced with 'fizzbuzz'
*/
function fizzBuzz1(){
    var fb = 'fizzbuzz';
    var f = 'fizz';
    var b = 'buzz';
    console.log('1', '2', f, '4', b, f, '7', '8', f, b);
    console.log('11', f, '13', '14', fb, '16', '17', f, '19', b);
    console.log(f, '22', '23', f, b, '26', f, '28', '29', fb);
    console.log('31', '32', f, '34', b, f, '37', '38', f, b);
    console.log('41', f, '43', '44', fb, '46', '47', f, '49', b);
    console.log(f, '52', '53', f, b, '56', f, '58', '59', fb);
    console.log('61', '62', f, '64', b, f, '67', '68', f, b);
    console.log
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
function fizzBuzz3(m,n,numbers,terms){

}


