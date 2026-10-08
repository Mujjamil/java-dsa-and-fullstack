
// normal approach
function isPrime(num){
    if(num < 2){
        return false;
    }

    for(let i = 2 ; i < num ; i++){
        if(num % i == 0){
            return false
        }
    }
    return true;
}
// console.log(isPrimeWithSqrt(7));

//by using square root
function isPrimeWithSqrt(num){
    if(num < 2){
        return false;
    }
    for(let i = 2 ; i <= Math.sqrt(num);i++){
        if(num % i == 0){
            return false;
        }
    }
    return true;
}


