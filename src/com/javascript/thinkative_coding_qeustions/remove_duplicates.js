function isDuplicate(arr){
    return [...new Set(arr)];
}//Using set method because set contain only unique values

let arr = [1,2,3,4,4,5,5];
// console.log(isDuplicate(arr));





console.log(isDuplicate([1,2,3,4,5]));
//used for loop and used includes and push for adding in array


function isDuplicate(arr){
    result = [];
    for(num of arr){
        if(!result.includes[num]){
            result.push[num]
        }
    }
    return result
}

//shallow copy means create new outer object. but nested object remains shared.
//deep copy creates outer objcet. and also create nested object whichh should be different \


//this keyword which refers to object which associated with its current function . and its depend on how the function is called.