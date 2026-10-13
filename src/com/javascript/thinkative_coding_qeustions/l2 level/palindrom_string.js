function isPalindrome(str){
    let reversed = ""
    for(let i = str.length -1 ; i >= 0 ; i--){
        reversed += str[i]
    }
    return reversed == str
}

// console.log(isPalindrome(""));
// first done reverse to the string and commpared with string and get palindrom is true or not

function twoPointerPalindrome(str){
    let left = 0;
    let right = str.length - 1;
    while(left < right){
        if(str[left] !== str[right]){
            return false;
        }
        left++;
        right--;
    }
    return true;
    
}

console.log(twoPointerPalindrome("level"));
