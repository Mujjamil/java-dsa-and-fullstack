let user = {
    name : "Mujjamil"
}

let permission1 = {canView : true};
let permission2 = {canEdit : true};

Object.assign(user,permission1,permission2);

console.log(user.name);
console.log(user.canView);
console.log(user.canEdit);

