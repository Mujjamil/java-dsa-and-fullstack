//Stores the data
const myObje = {name:"Mujjamil",age:23,city:"Kolhapur"}
const myJson = JSON.stringify(myObje);
localStorage.setItem("testJSON",myJson);

//Retrive the data 
let text = localStorage.getItem("testJSON");
let obj = JSON.parse(text);
console.log(obj);

