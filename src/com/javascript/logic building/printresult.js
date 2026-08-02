//print result

const students = [

  { name: "Ali", marks: 75 },

  { name: "Sara", marks: 90 },

  { name: "John", marks: 45 },

  { name: "Ayesha", marks: 82 },

  { name: "David", marks: 33 }

];
let highestMarks = o
for(let i =0 ; i < students.length ; i++){
   
    if(students[i].marks >= 50){
        console.log(students[i].name + "is passed")
    }else{
        console.log(students[i].name + "is failed");
    }

}
 console.log("totoal student "+students.length);
    