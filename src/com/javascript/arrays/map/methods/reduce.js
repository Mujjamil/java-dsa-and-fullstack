const numbers = [45, 4, 9, 16, 25];
let sum = numbers.reduce(myFunction);//reduce method run by function and perform action on every element and give one output
let sum2 = numbers.reduceRight(myFunction);//reduce right method run by function and perform action on every element from the righ side and give one output

function myFunction(total , value , index , array){
    return total + value;
}

console.log(sum);
