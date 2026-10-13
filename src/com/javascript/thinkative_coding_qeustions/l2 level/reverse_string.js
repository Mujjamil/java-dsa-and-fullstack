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
// console.log(reverseeee("Mujjamil"));


function twoPointerApproachReverseByAryan(str){
    let i = 0;
    let j = str.length - 1;
    let newStr=new Array();
    while(i<=j){
      newStr[i]=str[i];
      i++;
    }
    i=0;
    while(i<=j){
        let temp=newStr[i];
        newStr[i]=newStr[j];
        newStr[j]=temp;
        i++;
        j--;
    }
    let str1="";
    i=0;
    while(i<=str.length-1){
        str1+=newStr[i];
        i++;
    }
    return str1;
}
//console.log(twoPointerApproachReverse("Hello"));


function reverseUsingWhile(str){
    let reversed = ""
    let i = str.length - 1;
    while(i >= 0){
        reversed += str[i]
        i--
    }
    return reversed
}
// console.log(reverseUsingWhile("Mujjamil"));


function reverseStringWithTwoPointerApproach(str){//converts string into array then gives the result
    let chars = str.split("");
    let left = 0;
    let right = chars.length - 1;
    while(left < right){
        let temp = chars[left]
        chars[left] = chars[right]
        chars[right] = temp
        left++;
        right--
    }
    return chars.join("")
}

function reverseStringWithoutArray(str){
    let left = 0;
    let right = str.length - 1;
    let reversed = ""

    while(left <= right){
        reversed += str[right]
        right--
    }
    return reversed
}
console.log(reverseStringWithoutArray("Mujjamil"));
