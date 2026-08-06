let user = {
    name : "Mujjamil",
    sizes : {
        height : 182,
        width : 60
    }
};

console.log("height = "+user.sizes.height);

let clone = Object.assign({},user);

console.log("widht = "+clone.sizes.width);

    