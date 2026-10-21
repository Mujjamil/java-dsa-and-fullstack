function printnummm(num){
    if(num > 10){
        return 
    }
    console.log(num);
    return printnummm(num+1)
}

console.log(printnummm(1));
