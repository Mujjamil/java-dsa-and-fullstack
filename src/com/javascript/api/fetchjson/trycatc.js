async function myJsonLoad(file){
    try{
        const respone = await fetch(file);
        if(!respone.ok){
            throw new Error("HTTP Error"+respone.status);
        }
        const customer = await respone.json();
        console.log(customer.name);
        
    }catch(err){
        console.log(err.message);
        
    }
}

console.log(myJsonLoad("customer.json"));
