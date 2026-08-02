let numbers = [45, 12, 89, 3, 76];
let lrg = numbers[0] //45
for(let i = 1 ; i < numbers.length; i++){ // 12 , 89 , 3 , 76;
    if(numbers[i] > lrg){ // 12 > 45
       lrg = numbers[i] // 45
    }
    
}
console.log(lrg);
