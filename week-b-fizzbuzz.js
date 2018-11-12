/*
    Basic FizzBuzz:
    Write a function which prints out the numbers 1-100, with the following substitutions:
    Each multiple of 3 replaced with 'fizz'
    Each multiple of 5 replaced with 'buzz'
    Each multiple of both 3 and 5 replaced with 'fizzbuzz'
*/


let arr=[];
function fizzBuzz1(){
    for ( i = 1; arr.length <100; i++) {
        if (i % 5 === 0 && i % 3 ===0){
            arr.push('fizzbuzz');
        }
        else if (i % 3 === 0){
            arr.push('fizz');
        }
        else if (i % 5 === 0){
            arr.push('buzz');
        }
        
        else {
            arr.push(i);
        }
       
        console.log(arr);

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
    var m=2;
    var n=90;
    for ( i = 2; arr.length <90; i++) {
        if (i % 5 === 0 && i % 3 ===0){
            arr.push('fizzbuzz');
        }
        else if (i % 3 === 0){
            arr.push('fizz');
        }
        else if (i % 5 === 0){
            arr.push('buzz');
        }
        
        else {
            arr.push(i);
        }
       
        console.log(arr);
    


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
function fizzBuzz4(fizzNum,buzzNum){
var fizzNum = 3;
var buzzNum = 5;
for ( i = 4; arr.length <80; i++) {
    if (i % buzzNum === 0 && i%fizzNum ===0){
        arr.push('fizzbuzz');
    }
    else if (i%fizzNum ===0){
        arr.push('fizz');
    }
    else if (i % buzzNum === 0){
        arr.push('buzz');
    }
    
    else {
        arr.push(i);
    }
   
    console.log(arr);
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
function fizzBuzz3(m,n,numbers,terms){
    var m=5;
    var n=70;
    for ( i = 5; arr.length <100; i++) {
        if (i % 2 === 0 && i % 4 ===0){
            arr.push('fizzbuzz');
        }
        else if (i % 3 === 0){
            arr.push('fizz');
        }
        else if (i % 5 === 0){
            arr.push('buzz');
        }
        
        else {
            arr.push(i);
        }
       
        console.log(arr);

}

}


