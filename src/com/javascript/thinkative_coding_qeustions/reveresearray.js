function reverseArray(arr){
    let reverse = [];
    for(let i = arr.length-1 ; i >=0 ; i--){
        reverse.push(arr[i])
    }
    return reverse;
}

console.log(reverseArrayWithTwoPointer([1,2,3,4,5]));
//normal approach


function reverseArrayWithTwoPointer(arr){
    let left = 0 
    let right = arr.length - 1;

    while(left < right){
        let temp = arr[left];
        arr[left] = arr[right]
        arr[right] = temp

        left++
        right--
    }
    return arr
}