function fizzBuzz1 (){
    for(int i=1;i<=100;i++){
        if((i%3 == 0) && (i%5==0))
            output<<"FizzBuzz\n";
        else if(i%3 == 0)
            output<<"Fizz\n";
        else if(i%5 == 0)
            output<<"Buzz\n";
        else
            output<<i<<"\n";
     }
    return 0;
}

for(x)in range(1,101):print("Fizz"*(x%3==0)+(x%5==0)*"Buzz"or x)

function fizzBuzz2(m,n){
    for(i=10;i<=80;i++){
        if((i%3 == 0) && (i%5==0))
            output<<"fizzbuzz\n";
        else if(i%3 == 0)
            output<<"Fizz\n";
        else if(i%5 ==0)
            output<<"Buzz\n";
    }
    return 0;

}

function fizzBuzz4(m,n,fizzNum,buzzNum){
    for(i=10;i<=80;i++){
        if((i%fizzNum == 0) && (i%buzzNum))
            output<<"fizzbuzz\n";
        else if(i%fizzNum == 0)
            output<<"fizz";
        else if(i%buzzNum ==0)
            output<<"buzz\n";
    }

}

function fizzBuzz3(1,100,[3,5],['fizz','buzz']){


}