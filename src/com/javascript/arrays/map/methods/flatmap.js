const myArr = [1,2,3,4,5];
const newArr = myArr.flatMap(x => [x , x * 10]);//this flat method first map all the elements of arary then creating new array by flattering the array.
console.log(newArr);
