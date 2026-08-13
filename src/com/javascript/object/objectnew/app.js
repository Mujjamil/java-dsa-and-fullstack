function User(name){
    if(!new.target){
        return new User(name);
    }
    this.name = name;
}

let john = User("John");
console.log(john.name);//John
