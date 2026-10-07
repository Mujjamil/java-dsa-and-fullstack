function reverse(str){
    let reversed = "";
    for(let i = str.length-1 ; i >= 0 ; i--){
        reversed += str[i];
    }
    return reversed
}

console.log(reversed1("Mujjamil"));
//used last element and went till first 

function reversed1(str){
    return str.split("").reverse().join();
}