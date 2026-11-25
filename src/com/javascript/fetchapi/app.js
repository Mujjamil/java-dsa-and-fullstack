const URL = "https://catfact.ninja/facts"
const factsPara = document.querySelector("#facts")
const btn = document.querySelector("#button")

const getFacts = async()=>{
    console.log("getting data....");
    
    let response = await fetch(URL) //return first promise 
    console.log(response);//JSON format

    let data = await response.json();
    console.log(data.data[8].fact);

    factsPara.innerText = data.data[8].fact;
   
}//with asynce await

function getFactss(){
    fetch(URL)
    .then((response)=>{
        return response.json();
    })
    .then((data)=>{
        console.log(data);
        factsPara.innerText = data.data[7].fact;
    })
}//with promise chaining

 btn.addEventListener("click",getFactss)




