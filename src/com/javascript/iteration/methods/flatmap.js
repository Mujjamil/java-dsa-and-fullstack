const myIterator = Iterator.from([1,2,3,4,5,6])
const mappedIterator = myIterator.flatMap(x => [x,x*2])
for(i of mappedIterator){
    console.log(i);
}
// console.log(...mappedIterator);
