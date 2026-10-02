const text = '{"name":"Mujjamil","age":"23","City":"Kolhapur"}'
const person = JSON.parse(text);//converting to array formaat~
console.log(person.name);

const arr = '["FORD","BMW","MERCEDES"]'
const person2 = JSON.parse(arr);//converting to array 
console.log(person2[2]);

