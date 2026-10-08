function factorial(n){
    let result = 1;
    for(let i = 1 ; i <= n ; i++){
        result *= i;
    }
    return result;
}

// console.log(factorial(5));

//normal approach

function factorialrecursion(n){//approach done using recurssion
    if(n == 0 || n == 1){
        return 1
    }
    return n * factorialrecursion(n-1);
}
console.log(factorialrecursion(5));

