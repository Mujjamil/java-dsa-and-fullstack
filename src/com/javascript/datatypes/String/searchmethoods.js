let text = "please locate where 'locate' occurs"
let index = text.indexOf("locate")//returns the index
let lastindex = text.lastIndexOf("locate")//return the last index of specified text 
let search = text.search(/locate/);//search the string and return the position of the match.
let match = text.match(/cate/)//returns array containing the result 
const matchall = text.matchAll("locate")//check all matchable results in array
let includes = text.includes("locate")//check and return true of false which string contains specified value
let includess = text.includes("where",1)//check and return true of false which string contains specified value and that string is on that position or not 
let startwith = text.startsWith("please")//check and return true or false if word start with 
let endwith = text.endsWith("occurs")//check and return true or false if word end with 

console.log(startwith);
