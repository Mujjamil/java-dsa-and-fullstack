function secondLargest(arr){
    let largest = arr[0];
    let secondLargest = arr[1];
    for(let i = 0 ; i < arr.length ; i++){
        if(arr[i] > largest ){
            secondLargest = largest
            largest = arr[i];
        }else if(arr[i] > secondLargest && arr[i] !== largest){
            secondLargest = arr[i];
        }
    }
    return secondLargest;
}

let arr = [1,2,3,4,6]
console.log(secondLargest(arr));
