//Count the frequency of each element.

function frequencyCount(arr){
   let count = {}
    for(let i = 0 ; i < arr.length ; i ++){
        if(count[arr[i]]){
            count[arr[i]]++
        }else{
        count[arr[i]] = 1
        }
}
return count
}

console.log(frequencyCount([11,2,2,3,4,5]))


//count for string
function frequencyForString(str){
    let frequency = {};
    for(let i = 0 ; i < str.length ; i++){
        if(frequency[str[i]]){
            frequency[str[i]]++
        }else{
            frequency[str[i]] = 1
        }

    }
    return frequency
}

console.log(frequencyForString("mujjamil"));
