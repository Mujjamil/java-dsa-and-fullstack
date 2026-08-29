const arr = [["Mujjamil","Saurabh"],["Gaurav","Juber"]];
const arr1 = ["Prithvi","Tushar"];
const arr2 = ["Rana","Krish"];
const numberss = [2,3,5,6,6,7];
const myFriends = arr1.concat(arr2);//merge the array 
let copy = arr.copyWithin(2,0)//copy the element from 0 to 2 index and gives the result
let flat = arr.flat();//merge the mutiple  subarray into one array
const newArr = numberss.flatMap(x => [x, x * 10]);//first maps the all element then creates new and gives it as it want

console.log(newArr);
