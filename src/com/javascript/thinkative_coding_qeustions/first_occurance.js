function firstNonRepeating(str){
    for(let i = 0 ; i < str.length ; i++){
        let count = 0;
        for(let j = 0 ; j < str.length ; i++){
            if(str[i] == str[j]){
                count ++;

            }
        }    
        if(count == 1){
            return str[i];
        }
    }
    return null
}

console.log(firstNonRepeating("aabcc"));
