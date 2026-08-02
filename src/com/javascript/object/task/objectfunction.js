// Write the function isEmpty(obj) which returns true if the object has no properties, false otherwise.

// Should work like that:
// let schedule = {};

// alert( isEmpty(schedule) ); // true

// schedule["8:30"] = "get up";

// alert( isEmpty(schedule) ); // false

function isEmpty(obj){
    for(key in obj){
        return false
    };
    return true
};

let schedule = {}

console.log(isEmpty(schedule));
schedule["8:20"] = "get up"
console.log(isEmpty(schedule))
console.log(schedule);
