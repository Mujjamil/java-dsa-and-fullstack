let user = {
    name : "Mujjamil"
}

let clone = {}
for(key in user){
    clone[key] = user[key]
}

clone.name = "Pete";
console.log(user.name);
console.log(clone.name);

