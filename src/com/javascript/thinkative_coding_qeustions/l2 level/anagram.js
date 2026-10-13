// Check whether two strings are anagrams.
function areAnagrams(str1, str2) {
    let s1 = str1.toLowerCase().split("").sort().join("");
    let s2 = str2.toLowerCase().split("").sort().join("");

    return s1 === s2;
}

console.log(areAnagrams("listen", "silent")); // true
console.log(areAnagrams("hello", "world"));   // false
console.log(areAnagrams("rat", "car"));       // false