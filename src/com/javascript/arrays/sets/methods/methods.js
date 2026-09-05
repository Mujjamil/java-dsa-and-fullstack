const letters = new Set(["a","b","c"]);
let text = " ";
for(const x of letters){//you can access the element by using for of loop in set 
    text += x;
}

let answers = letters.has("b");
console.log(answers);

