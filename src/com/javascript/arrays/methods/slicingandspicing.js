const fruits = ["Banana", "Orange", "Apple", "Mango"];
let splice = fruits.splice(2,0,"Kiwi","Cherry");//methods adds method where 2 is where wants to add and 0 is how many want to removes the elements and kiwi and cherry is that thing we wants to add
let delsplice = fruits.splice(2,2,"Kiwi","Cherry");
const spliced = fruits.toSpliced(0, 1);
const slicee = fruits.slice(3)//slice method do slice the element from given index and make him as new array.
const pertSlice = fruits.slice(0,3)//slice the element from 0 element but not get last element means 3
console.log(pertSlice);
