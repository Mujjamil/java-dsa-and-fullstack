const cars = [
    { type: "Volvo", year: 2016 },
    { type: "BMW", year: 2001 },
    { type: "Mercedes", year: 2004 }
]

let objectSort = cars.sort(function(a,b){return a.year - b.year});//sorting the object
console.log(objectSort);
