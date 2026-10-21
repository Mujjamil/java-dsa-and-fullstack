let text = document.querySelector("h2")
let div1 = 

text.innerText = text.innerText + " From Mujjamil Jamadar"
console.dir(text)


let divs = document.querySelectorAll(".mj")

let indx = 1
for(div of divs){ // by accessing element and writing in loop
    div.innerHTML = `new unique value is${indx}`;
    indx++;
}


// divs[0].innerHTML = "new unique value 1" // using  by index 
// divs[1].innerHTML = "new unique value 2"
// divs[2].innerHTML = "new unique value 3"
