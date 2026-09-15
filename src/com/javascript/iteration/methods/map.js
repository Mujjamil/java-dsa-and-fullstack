const myIterator = Iterator.from([1,2,3,4,5])
const IteratorMap = myIterator.map(x => x*2)
// console.log(...IteratorMap);
for(i of IteratorMap){
    console.log(i); 
}