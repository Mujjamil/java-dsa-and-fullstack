function isDuplicate(arr){
    return [...new Set(arr)];
}//Using set method because set contain only unique values

let arr = [1,2,3,4,4,5,5];
console.log(isDuplicate(arr));


function isDuplicate1(arr){
    let result = [];
    for(let i = 0 ; i < arr.length ; i++){
        if(!result.includes(arr[i])){
            result.push(arr[i])
        }
    }
    return result
}

console.log(isDuplicate1(arr));
//used for loop and used includes and push for adding in array