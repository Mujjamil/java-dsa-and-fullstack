//Remove duplicate array elements without Set.
function removeDuplicate(arr){
   let result = [];
    for(let i = 0 ; i < arr.length ; i++){
        if(!result.includes(arr[i])){
            result.push(arr[i])
        }
        
    }
    return result;
}

// console.log(removeduplicatesWithFilter([1,2,2,3,3,4,5,6]));


//using for loop 
function removeDuplicatewithLoppMethod(arr){
    let result = []
    for(let i = 0 ; i < arr.length ; i++){
        let exist = false;
        for(let j = 0 ; j < result.length ; j++){
            if(arr[i] === result[j]){
                exist = true;
                break;
            }
        }
        if(!exist){
            result.push(arr[i])
        }
    }
    return result;
}

//using filter method
function removeduplicatesWithFilter(arr){
    return arr.filter((num , index) => {
        return arr.indexOf(num)  === index
    })
   
}


console.log(removeduplicatesWithFilter([1,2,2,2,3,3,4,4,5,5]));

// function removeDuplicatesWithFilter(arr) {
//     return arr.filter((num, index) => {
//         return arr.indexOf(num) === index;
//     });
// }

// console.log(removeDuplicatesWithFilter([1, 2, 2, 2, 3, 3, 4, 4, 5, 5]));



function countFrequency(arr) {
    let visited = [];

    for (let i = 0; i < arr.length; i++) {
        if (visited[i]) {
            continue;
        }

        let count = 1;

        for (let j = i + 1; j < arr.length; j++) {
            if (arr[i] === arr[j]) {
                count++;
                visited[j] = true;
            }
        }

        console.log(arr[i] + " appears " + count + " times");
    }
}

countFrequency([1, 2, 2, 3, 1, 4, 2, 3]);