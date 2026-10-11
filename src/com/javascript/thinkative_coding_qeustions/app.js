function checkPrime(n){
if(n < 2){
    return false
}
for(let i = 2 ; i < n ; i ++){
    if(n % i == 0){
        return false
    }
}
return true

}


function countfrequencyy(arr){
    let count = {}
    for(let i = 0 ; i < arr.length ; i++){
        if(count[arr[i]]){
            count[arr[i]]++
        }else{
            count[arr[i]] = 1
        }
    }
    return count
}

function factorialll(n){
    let result = 1
    for(let i = 1 ; i <= n ; i++){
        result *= i
    }
    return result;
}

function facotrialwithRecurssion(n){
    if(n == 1){
        return 1
    }

    return n * facotrialwithRecurssion(n-1)
}


function findDuplicateFromArray(arr){
    let seen = new Set();
    let duplicate = new Set();
    for(let num of arr){
        if(seen.has(num)){
            duplicate.add(num)
        }else{
        seen.add(num)
        }
    }
    return [...duplicate]
    
}
console.log(findDuplicateFromArray([1,2,3,4,4,5,5,6,6,7,7,8,8]));

function findMissingNumberrr(arr , n){
    let expectedValue = n * (n+1) / 2;
    let actualSumOfAll = 0 

    for(let num of arr){
        actualSumOfAll += num
    }
    return expectedValue - actualSumOfAll
}

console.log(findMissingNumberrr([1,2,3,5],5));

