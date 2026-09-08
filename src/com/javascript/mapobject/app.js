const fruits = new Map();//set map 
fruits.set("Mango",500);
fruits.set("Banana",200);
fruits.set("Apple",300);
fruits.set("Berry",400);

fruits.set("Mango",400);//changing the value
let getMethodd = fruits.get("Apple");//get value by get method
let typpe = typeof(fruits)//giving the type of fruits as object
console.log(typeof(fruits));


const fruits2 = new Map([ //passing an array
    ["apples", 500],
  ["bananas", 300],
  ["oranges", 200]
])

