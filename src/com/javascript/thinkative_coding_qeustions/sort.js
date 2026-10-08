let number = [4,5,6,7,9,1];
number.sort((a,b)=> a-b)
console.log(bubbleSort([1,4,7,8,9,2]));

//using built in method sort 

function bubbleSort(arr){
    for(let i = 0 ; i < arr.length ; i++){//0
        for(let j = 0 ; j < arr.length - i - 1 ; j++){ // 
            if(arr[j] > arr[j+1]){
                let temp = arr[j];
                arr[j] = arr[j+1]
                arr[j+1] = temp
            }
        }
    }
    return arr;
}

console.log(bubbleSort([1,4,5,3,2]));
//solved using bubble sort algorithm with taking two loops for comparing the value