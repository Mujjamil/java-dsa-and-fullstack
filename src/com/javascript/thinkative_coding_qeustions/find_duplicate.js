function findDupliicate(arr){
    let duplicate = new Set();
    let seen = new Set();
    for(let num of arr){
        if(seen.has(num)){
            duplicate.add(num)
        }else{
            seen.add(num);
        }
    }
    return [...duplicate]
}

let arr = [1,1,2,2,3,4,5,6,6,7,7]

console.log("the duplicate numbers from : "+arr+" : "+findDupliicate(arr));
