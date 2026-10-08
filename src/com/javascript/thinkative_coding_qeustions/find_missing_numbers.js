function missingValue(arr , n){
    let expectedValue = n * (n+1) / 2;
    let actualSum = 0;
    for(num of arr){
        actualSum += num;
    }
    return expectedValue - actualSum;
}

console.log(missingValue([1,2,3,5],5));
//i calculate the expeted value by adding number of elements and divid and multiply then sum of all array element and take difference value from substraciton of expetedvalue and actual value