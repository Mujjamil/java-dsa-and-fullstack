//now as per fetchign data function it goes simultaneously one by but what if we want asyncFun1 should be give result first then it moves to the asyncFun 2
//then we use promise chain which we have to take another function in same p1 functio so it will print after that


function asyncFun1(){
    return new Promise((resovle , reject)=>{
        setTimeout(()=>{
            console.log("Returning data1");
            resovle("successfull")
        },4000)
    })
}

function asyncFun2(){
    return new Promise((resovle , reject)=>{
        setTimeout(()=>{
            console.log("Returning data2");
            resovle("successfull")
        },4000)
    })
}

// console.log("fecting data1.....");
// asyncFun1().then((res)=>{
//     console.log("fetching data2....")//this is how work promise chaning 
//     asyncFun2().then((res)=>{})
// })

// console.log("fecting data2.....");

// let p2 = asyncFun2();
// p2.then((res)=>{                     
//     console.log(res);
    
// })

function getData(dataId){
    return new Promise((resovle , reject)=>{
        setTimeout(()=>{
            console.log("data",dataId);
            resovle("success")
        },3000)
    })
}

//Promise chain
getData(1).then((res)=>{
    return getData(2)
}).then((res)=>{
    return getData(3)
}).then((res)=>{
    console.log(res);
})



