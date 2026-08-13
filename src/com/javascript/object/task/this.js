function makeUser(){
    return {
        name : "Mujjamil",
        ref : this
    };
}

let user = makeUser();
console.log(user.ref.name);//output will be undefined
