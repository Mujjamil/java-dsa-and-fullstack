// Find all even numbers using filter().
// Double every number using map().
// Calculate an array sum using reduce().
// Flatten a nested array one level.
// Group objects by a property, such as department.
// Sort numbers without using sort().

function evenUsingFilter(arr){
    return arr.filter((num) => num % 2 == 0)
}

function doubleMap(arr){
    return arr.map((num) => num * 2);
}

function calculateArray(arr){
    return arr.reduce((num , accumulator) => {
        return num + accumulator
    },0)
}

let arr = [1, [2, 3], [4, [5, 6]],[[33,[[44]]]]];
let result = arr.flat(4)
console.log(result);


let obj = [
    {name:"Mujjamil",departement:"IT"},
    {name:"AFtab",departement:"IT"},
    {name:"Saurabh",departement:"IT"},
    {name:"Ubed",departement:"IT"},
    {name:"Jaid",departement:"IT"}
];


let arr1 = [1,4,,2,5,6,9,8]

function sort(arr){
    for(let i = 0 ; i < arr.length ; i++){
        for(let j = 0 ; j < arr.length - i - 1 ; j++){
            if(arr[j] > arr[j+1]){
                let temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
            }
        }
    }
}

