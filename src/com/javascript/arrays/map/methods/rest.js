const arr1 = [1,2,3,4,5,6,7,8];
let a , rest;
[a,...rest] = arr1;//allows us to destruct the array and collect the leftovers.
console.log(rest);
