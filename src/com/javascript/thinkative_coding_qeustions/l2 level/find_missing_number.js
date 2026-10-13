function findMissing(arr){
    let n = arr.length + 1;
    let expectedValue = n * (n+1) / 2;
    let sumofVal = 0
    for(let i = 0 ; i < arr.length ; i++){
        sumofVal += arr[i]
    }
    return expectedValue - sumofVal
}

console.log(findMissing([1,2,3,4,6]));
