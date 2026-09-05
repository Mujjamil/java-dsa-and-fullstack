const a = new Set("a","b","c","d");
const b = new Set("e","f","g","h");
let c = a.union(b);

let intersection = a.intersection(b)
console.log(intersection);