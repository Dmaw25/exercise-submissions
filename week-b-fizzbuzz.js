/*
    Basic FizzBuzz:
    Write a function which prints out the numbers 1-100, with the following substitutions:
    Each multiple of 3 replaced with 'fizz'
    Each multiple of 5 replaced with 'buzz'
    Each multiple of both 3 and 5 replaced with 'fizzbuzz'


    var a= 'fizz';
    var b= 'buzz';
    var ab= 'fizzbuzz';

    for(var i=1;i<=100;i++){
		if(i%5 === 0 && i%3 === 0){
			print('FizzBuzz');
		} else if(i%3 === 0){
			print('Fizz');
		} else if(i%5 === 0){
			print('Buzz');
		} else {
            print(i);
    }
    




*/
function fizzBuzz1(){ 
    var a= 'fizz';
    var b= 'buzz';
    var ab= 'fizzbuzz';

    console.log(1,2,a=fizz,4,b=buzz,a=fizz,7,8,a=fizz,b=buzz,11,a=fizz,13,14,ab=fizzbuzz,16,17,a=fizz,19,b=buzz)
    console.log(a=fizz,22,23,a=fizz,b=buzz,26,a=fizz,28,29,ab=fizzbuzz,31,32,33,34,b=buzz,fizz,37,38,a=fizz,b=buzz)
    console.log(41,a=fizz,43,44,b=buzz,46,47,a=fizz,49,b=buzz,a=fizz,52,53,a=fizz,b=buzz,56,a=fizz,58,59,ab=fizzbuzz)
    console.log(61,62,a=fizz,64,buzz,a=fizz,67,68,a=fizz,buzz,71,a=fizz,73,74,ab=fizzbuzz,76,77,a=fizz,79,b=buzz)
    console.log(a=fizz,82,83,a=fizz,85,86,a=fizz,88,89,ab=fizzbuzz,91,92,a=fizz,94,b=buzz,a=fizz,97,98,a=fizz,b=buzz)
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
