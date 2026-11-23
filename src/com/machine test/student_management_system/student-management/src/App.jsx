import { useState } from "react";
import StudentForm from "./components/StudentForm";
import StudentTable from "./components/StudentTable"
import "./App.css"

function App(){
  const [students , setStudents] = useState(()=>{
    try{
      return JSON.parse(localStorage.getItem("students")) || []
    }catch{
      return []
    }
  });

  const addStudent = (student) =>{

    const newStudent = {
      ...student,
      id:crypto.randomUUID()
    }

     const updatedStudents = [...students, newStudent];

    setStudents(updatedStudents);

    localStorage.setItem(
      "students",
      JSON.stringify(updatedStudents)
    );
  }
  return (
    <main className="container">
      <h1>Student Management System</h1>
      <StudentForm addStudent = {addStudent}/>
      <StudentTable students = {students}/>
    </main>
  );
}

export default App