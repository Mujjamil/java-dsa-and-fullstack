function countFrequency(arr){
    let count = {};
    for(i=0 ; i < arr.length ; i++){
        if(count[arr[i]]){
            count[arr[i]]++
        }else{
        count[arr[i]] = 1
        }
    }
    return count;
}
//using normal for loop 
console.log(countFrequency1([1,2,3,4,5,6,6,7,7,8,8,8]));


function countFrequency1(arr){
    let count = {};
    for(let num of arr){
        if(count[num]){
            count[num]++
        }else{
        count[num] = 1;
        }
    }
    return count;
}

//using advanced for loop 