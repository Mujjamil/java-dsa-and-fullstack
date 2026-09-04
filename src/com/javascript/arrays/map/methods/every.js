const numbers = [45, 4, 9, 16, 25];
let over18 = numbers.every(myFunction);//every method check every array element checking the argument which is given below in funcion 
let over18some = numbers.some(myFunction)// some method checks that some of the element or values are passing the test.

function myFunction(value , index , array){
    return value > 18;
}

console.log(over18some);
