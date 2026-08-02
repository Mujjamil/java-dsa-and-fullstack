   //check the properties is exist in object or not 
    let user ={
        rollno: 30,
    }
    let key = "age";
   console.log(key in user);
   user.name = "Mujjamil"
   user.name = "Avdhut"
   user[key] = 40
   console.log(user);

   
   student = [1,2,3,4,5,6];
   for (const key in student) {
        console.log(student[key]);
        if(key == 3) break;
   }