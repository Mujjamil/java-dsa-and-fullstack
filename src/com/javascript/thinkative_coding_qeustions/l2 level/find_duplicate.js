function findDuplicate(arr){
    let seen = new Set()
    let duplicate = new Set()

    for(let i = 0 ; i < arr.length ; i++){
        if(seen.has(arr[i])){
            duplicate.add(arr[i])
        }else{
            seen.add(arr[i])
        }
    }
    return [...duplicate]
}
console.log(findDuplicate([1,1,2,3,4,5,6,6]));
