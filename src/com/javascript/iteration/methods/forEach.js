const myIterator = Iterator.from([1,2,3,4,5,6])
text = " "
const forEachmethod = myIterator.forEach(x => text += x)
console.log(text);
