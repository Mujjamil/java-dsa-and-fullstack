async function hello(){
    console.log("Helllo"); //automatically returns promise because we assigned async to the function
}

 


//creating function which returns promies 
function api(){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            console.log("Wether api");
            resolve(200)
        },2000)
    })
}

// now while we calling that function we will asign with async function instead of .then() and .catch()
async function getWetherApi(){
    await api();//1st call
    await api();//2nd call
}

//now it will give result one by one after 2 sec because we have added await 



 

//async await
async function getAllData(){
    await getData(1);
    await getData(2)
    await getData(3)
}

//so this async await can do you can see how readable and simple method to call promise function 



//when we use async await we have to declare function and then call that function unnecessaraly because await cant be fetch without function 
//now we can prevent that with IIFE immediately invoked functio expression 

//IIFE is a function that is called immidiately as soon as it defined.

//IIFE 

(async function(){
    await getData(1);
    await getData(2)
    await getData(3)
})();

//so now you can see we have removed function name and added async function in () brackets and after function done () so this 
//called IIFE function which called at the spot without any function call 
//if we want to reuse we cant because then we have to rewrite this  