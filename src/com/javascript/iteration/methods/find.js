const myIteratory  = Iterator.from("12345678")
const findd = myIteratory.find(x => x > 3)

const filter = myIteratory.filter(x => x > 3)
// console.log(...filter);//shortcut method to iterate and give result
for(x in filter){
    console.log(filter);
    
}