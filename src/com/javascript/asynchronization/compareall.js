//now testing on getData function
function getData(dataId){
    return new Promise((resovle , reject)=>{
        setTimeout(()=>{
            console.log("data",dataId);
            resovle("success")
        },3000)
    })
} 

//now we will compare all three codes which made them asynchronized


//callback hell
getData(1,()=>{
    console.log("getting data 2...");
    getData(2,()=>{
        console.log("getting data 3...");
        getData(3,()=>{
            console.log("getting data 4...."); 
            getData(4,()=>{
                console.log("getting data 5...");
            });
        });
    });
})


//Promise chain
getData(1).then((res)=>{
    return getData(2)
}).then((res)=>{
    return getData(3)
}).then((res)=>{
    console.log(res);
})

//async await
async function getAllData(){
    await getData(1);
    await getData(2)
    await getData(3)
}



//IIFE 

(async function(){
    await getData(1);
    await getData(2)
    await getData(3)
})();


//now you can compare how callback hell looks like then promise chain and async await and IIFE