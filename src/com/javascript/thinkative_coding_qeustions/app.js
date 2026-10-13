//1 Reverse the string without using reverse

let str = "Mujjamil"
let reversed = str.split("").reverse().join("")
// console.log(reversed);
//with reverse method


function reverseeee(str){
    let result = "";
    for(let i = str.length -1 ; i >= 0 ; i--){
        result += str[i]
    }
    return result;
}
console.log(reverseeee("Mujjamil"));


