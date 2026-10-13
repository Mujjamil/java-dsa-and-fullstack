// Find the largest and second-largest distinct numbers.

function largest_and_secondLargest(arr){//by using normal approach
    let largest = arr[0];
    let secondLargest = arr[0]
    for(let i = 0 ; i < arr.length ; i++){
        if(arr[i] > largest ){
            secondLargest = largest;
            largest = arr[i]
        }else if( arr[i] > secondLargest && secondLargest != largest){
            secondLargest = arr[i];
        }
    }
    console.log("the largest element is : ",largest);
    console.log("the second largest element is : ",secondLargest);
    
    
}

// largest_and_secondLargest([1,2,3,4,5,5,6])

//by using sort approach
function usingSortApproach(arr){
    let sorted = [...new Set(arr)].sort((a , b) => b - a);
    console.log("largest : ",sorted[0]);
    console.log("secondLargest :",sorted[1]);
}

usingSortApproach([1,2,3,4,5,6,6,7])

//used set to remove duplicates and then apply sort method in decreasing and take largest arr[0] means first element and taks secondlargest as arr[1] 