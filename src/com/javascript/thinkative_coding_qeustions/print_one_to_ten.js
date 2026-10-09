function printNumber(n){
    if(n > 10){
        return;
    }

    console.log(n);
    printNumber(n+1)
    
}

console.log(printNumber(1));
