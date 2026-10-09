function findEvenNumber(num){
    if(num % 2 == 0){
        return "even"
    }else{
        return "its odd"
    }
}

console.log(findEvenNumberInArray([1,2,3,4,5,6,7,8,9,0]));
// for single value


function findEvenNumberInArray(arr){
    let result = []
    // for(let i = 0 ; i < arr.length ; i++){
    //     if(arr[i] % 2 == 0){
    //         result.push(arr[i])
    //     }

    // }
    for(let num of arr){
        if(num % 2 == 0){
            result.push(num)
        }
    }
    return result;
}

//for using arrayy