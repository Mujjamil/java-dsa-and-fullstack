const myIterator = Iterator.from([1,2,3,4,5,6]);


console.log([...myIterator]);//for printing the iterators we have to convert in array so this is method1

for(value of myIterator){
    console.log(value);
    
}//this is the method 2 by for of method 

//we cannot print directly iterators because it iteratre over every element

const firstFive = myIterator.drop(5)//drop the element till 5th element