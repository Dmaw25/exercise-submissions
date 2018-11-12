/*
    Basic FizzBuzz:
    Write a function which prints out the numbers 1-100, with the following substitutions:
    Each multiple of 3 replaced with 'fizz'
    Each multiple of 5 replaced with 'buzz'
    Each multiple of both 3 and 5 replaced with 'fizzbuzz'
*/
function fizzBuzz1(){

    for(i=1; i <100;i++){
        if (i % 3 === 0 && i % 5 === 0){
            console.log(" fizz ");
        }else if (i % 5 ===0 ){
            console.log(" buzz ");
        }else if (i % 3 ===0){
            console.log(" fizzbuzz ");
        }else{console.log(i)}
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

    for (i=1; i<100; i++){
        if ( m>n){
            console.log(m +" is larger than "+ n+" error");
        }else if  (i >= m && i<=n){
            if (i % 3 === 0 && i % 5 === 0){
                console.log(" fizz ");
            }else if (i % 5 ===0 ){
                console.log(" buzz ");
            }else if (i % 3 ===0){
                console.log(" fizzbuzz ");
            }else{console.log(i)}
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
function fizzBuzz4(m,n,fizzNum,buzzNum){

    for (i=1; i<100; i++){
        if ( m>n){
            console.log(m +" is larger than "+ n+" error");
        }else if  (i >= m && i<=n){
            if (i % fizzNum === 0 && i % buzzNum === 0){
                console.log(" fizz ");
            }else if (buzzNum % 5 ===0 ){
                console.log(" buzz ");
            }else if (fizzNum % 3 ===0){
                console.log(" fizzbuzz ");
            }else{console.log(i)}
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
function fizzBuzz3(m,n,numbers,terms){

    for (i=1; i<100; i++){
        if ( m>n){
            console.log(m +" is larger than "+ n+" error");
        }else if  (i >= m && i<=n){
            if (numbers.length === terms.length){
                for (j = 0; numbers.length; j++){
                    if (i % numbers[j] === 0){

                        console.log(terms[j]);
                    }else{console.log(i);}
                }
            }else{console.log("arrays two different lengths cannot compute!!!");}
        }
    }

}


