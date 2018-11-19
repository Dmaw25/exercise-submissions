
/*
    Basic FizzBuzz:
    Write a function which prints out the numbers 1-100, with the following substitutions:
    Each multiple of 3 replaced with 'fizz'
    Each multiple of 5 replaced with 'buzz'
    Each multiple of both 3 and 5 replaced with 'fizzbuzz'
*/
function fizzBuzz1(){

    let num = 1; 


    for (i=0;i<100;i++)
    {

        if (((num%3)==0)&&((num%5)==0))
        {
            console.log('fizzbuzz');
        }

        else if ((num%3)==0)
        {

            console.log('fizz');

        }

        else if ((num%5)==0)
        {

            console.log('buzz');

        }

        else{
            console.log(num);
        }



       
        num++;
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

    let num = m; 

    if (m<=n){

            for (i=m;i<=n;i++)
            {

                if (((num%3)==0)&&((num%5)==0))
                {
                    console.log('fizzbuzz');
                }

                else if ((num%3)==0)
                {

                    console.log('fizz');

                }

                else if ((num%5)==0)
                {

                    console.log('buzz');

                }

                else{
                    console.log(num);
                }
            
                num++;
            }

     }

     else {
        console.log('Error: m must be less than n');
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


    let num = m; 

    if (m<=n){

            for (i=m;i<=n;i++)
            {

                if (((num%fizzNum)==0)&&((num%buzzNum)==0))
                {
                    console.log('fizzbuzz');
                }

                else if ((num%fizzNum)==0)
                {

                    
                    console.log('fizz');

                }

                else if ((num%buzzNum)==0)
                {

                    console.log('buzz');

                }

                else{
                    console.log(num);
                }
            
                num++;
            }

     }

     else {
        console.log('Error: m must be less than n');
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

    var word;
   
    if (m<=n && numbers.length==terms.length){
            for (;m<=n;m++)
            {
                word = " "; 
                for (k=0;k<(numbers.length);k++) {
                     if (((m%numbers[k])===0)){ 
                             word+=terms[k];
                     } 
                 }

                 if (word ==" ")
                 {
                     console.log(m);
                 }

                 else{ console.log(word);}
                
            }
     }

     else {
        console.log('Woah woah woah, wrong input');
     }


}
