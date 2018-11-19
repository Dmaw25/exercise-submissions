/*
    Basic FizzBuzz:
    Write a function which prints out the numbers 1-100, with the following substitutions:
    Each multiple of 3 replaced with 'fizz'
    Each multiple of 5 replaced with 'buzz'
    Each multiple of both 3 and 5 replaced with 'fizzbuzz'
*/
function fizzBuzz1(){
    let arr = []; 
    arr.length = 100;
    let n = 1;
    for(let i=0; i<99; i++){
        let count = i;
        arr[i] = count;
        if(arr[i] % 15 == 0){
            arr[i] = "fizzbuzz";
        }
        else if(arr[i] % 5 == 0){
            arr[i] = "buzz";
        }
        else if(arr[i] % 3 == 0){
            arr[i] = "fizz"
        }
        else{
            arr[i] = n;
        }
        n++;
    console.log(arr[i]);
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
    let arr = []; 
    arr.length = 100;
    let y = 1;
    for(let i=m; i <= n; i++){
        let count = i;
        arr[i] = count;
        if(arr[i] % 15 == 0){
            count = "fizzbuzz";
        }
        else if(arr[i] % 5 == 0){
            count = "buzz";
        }
        else if(arr[i] % 3 == 0){
            count = "fizz"
        }
        else{
            arr[i] = y;
        }
        y++;
    if(m <= n){
        console.log(count);
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
    let arr = []; 
    arr.length = n;
    let y = 1;
    for(let i=m; i <= n; i++){
        let count = i;
        arr[i] = count;
        if(arr[i] % (fizzNum*buzzNum) == 0){
            count = "fizzbuzz";
        }
        else if(arr[i] % buzzNum == 0){
            count = "buzz";
        }
        else if(arr[i] % fizzNum == 0){
            count = "fizz"
        }
        else{
            arr[i] = y;
        }
        y++;
    if(m <= n){
        console.log(count);
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
    if(isNaN(Number(m)) || isNaN(Number(n)) || m > n){
        console.log("Invalid Input");
        return;
    }
    let output = "";
    for( i = m; i <= n; ++i){
        for( let j in numbers){
            if(i % numbers[j] === 0){
                output += terms[j];
            }
        }
        if(output){
            console.log(output);
        }
        else{
            console.log(i);
        }
    output = "";
    }
}


