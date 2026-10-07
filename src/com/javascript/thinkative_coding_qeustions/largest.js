function findlargest(arr){
    let largest = arr[0];
    for(i = 0 ; i < arr.length ; i++){
       if(arr[i] > largest){
        largest = arr[i]
       }
    }
    return largest;

}

arr = [1,2,3,4,5];
console.log("the largest number is : "+findlargest(arr));
