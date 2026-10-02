const text = '{"name":"Mujjamil","age":"23","City":"Kolhapur"}'
console.log(text);
const person = JSON.parse(text)//Converting json format to string format.
console.log(person);


const person1 =
{
    name : "Mujjamil",
    age : 23,
    city : "kolhapur"
}
console.log(person1);

const text1 = JSON.stringify(person1)//converts into json format

console.log(text1);
