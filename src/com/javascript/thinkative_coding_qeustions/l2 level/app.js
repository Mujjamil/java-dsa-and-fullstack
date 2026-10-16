function rev(str){
    return str.split("").reverse().join("")
}   


function reve(str){
    let reversed = "";
    for(let i = str.length - 1 ; i >=0 ; i--){
        reversed+=str[i]
    }
    return reversed
}



function revarr(arr){
    return arr.reverse()
}

function reverarrr(arr){
     let reversed = []
    for(let i = arr.length - 1 ; i >=0 ; i--){
        reversed += arr[i]
    }
    return reversed
}




function twosummm(arr,target){
    let map = new Map();
    for(let i = 0 ; i < arr.length ; i++){
        let complement = target - arr[i]
        if(map.has(complement)){
            return [map.get(complement),i]
        }
         map.set(arr[i],i)
    }
    return []
}


function removeDuplicate(arr){
   let result = [];
    for(let i = 0 ; i < arr.length ; i++){
        if(!result.includes(arr[i])){
            result.push(arr[i])
        }
        
    }
    return result;
}

function isDuplicateee(arr){
    return [...new Set(arr)];
}


console.log(isDuplicateee[1,2,2,3,3,4]);
