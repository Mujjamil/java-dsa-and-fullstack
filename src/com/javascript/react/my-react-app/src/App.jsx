import { useState } from "react";

function App(){
  const [count , setCount] = useState(0)
  const increment = ()=>{
    setCount(count + 1)
  }  

const decrement = () =>{
    setCount(count -1)
}

return(
  <>
  <div>
    <h2 >Counting = {count}</h2>
    <button onClick={increment}>increment</button>
    <button onClick={decrement}>decrement</button>
  </div>
  </>
)

}

export default App;