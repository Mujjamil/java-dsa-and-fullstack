//Function Declaration 
function myFunction(x,y){
    return x*y;
}

//Function Expression(Named)
const myFunction = function name(x,y){
    return x*y;
}

//Function Expression(Anonymous)
const myFunction = function(x,y){
    return x*y;
}

//arrow function
const myFunction = (x,y) => x*y;

//function Contructor
const myFunction = new myFunction("x","y","x*y");

//Object Method
const obj = {
    myFunction(x,y){
        return x*y
    },
}