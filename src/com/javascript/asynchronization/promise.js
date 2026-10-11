//promise is an object . which respresent eventual completion of task. and it solution for callback hell
//promise have three state (pending) , (fullfilled) , (reject)
//so while we create promise so we have to create with handler 
//(resolve , reject)


const getPromise = ()=>{
  return new Promise((resolve , reject)=>{
    console.log("I am promise");
    // resolve("successfully done")
    reject("error")
    
  })
}

let promise = getPromise();
promise.then((res)=>{          // used for cathing successfull result // we have added resolve method that why we can catch .then and print successfull result
    console.log("promise fullfilled",res);//res is showed fullfilled and then show print message
    
});
promise.catch((err)=>{         // used for cathing the errors while promise processing we have give 
                            //reject in promise function thats why its fetching catch method and showing error    
    console.log("error coming",err);//err show reject and then print log message
})




// function getData(dataId , getNextData){
//     return new Promise((resolve , reject)=>{
//         setTimeout(()=>{
//             console.log("data",dataId);
//             resolve("success")
//             if(getNextData){
//                 getNextData();
//             }
            
//         },5000);
//     })
// }