const cars = ["BMW" , "Mercedes" , "Volkswagon"];
console.log(cars.length);//gives the length of array
console.log(cars.sort());//sort the array
console.log(cars[cars.length-1]);//gives the last elements of array
let newCar = cars.push("Suzuki");//Adding new element in array by push method
console.log(cars);

console.log(typeof(cars));//it will show the type of object becauese array are also object 
//to solve this problem you can use
console.log(Array.isArray(cars));//array.isarray method






