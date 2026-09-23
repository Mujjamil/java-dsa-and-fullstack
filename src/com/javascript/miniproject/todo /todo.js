let tasks = [];

function displayTask(){
    let html = "";
    for(let i = 0 ; i < tasks.length ; i ++){
        html += "<li>" + tasks[i] + 
        "<button onClick = 'removeTask(" + i +")'> x </button></li>";
    }
    document.getElementById("list").innerHTML = html;

}
//function to add task 
function addTasks (){
    let textInput = document.getElementById("task");
    let text = textInput.value;
    if(text == ""){
        return;
    }
    tasks.push(text);
    textInput.value = "";
    saveTasks();
    displayTask();

}
//Function to remove the task
function removeTask(i){
    tasks.splice(i,1);
    saveTasks();
    displayTask();
}

//Function to clear all task 
function clearAll(){
    tasks = [];
    saveTasks();
    displayTask();
}

//Function to Save the Tasks
function saveTasks(){
    localStorage.setItem("tasks",JSON.stringify(tasks));
}

//Function to laod the task 
function loadTasks(){
    let saved = localStorage.getItem("tasks");
    if(saved != null){
        tasks = JSON.parse(saved)
    }

}

loadTasks();
displayTask();