function StudentTable({ students }) {

  return (
    <section className="table-section">
      <h2>Student Records</h2>

      {students.length === 0 ? (
        <p>No students registered yet.</p>
      ) : (
        <div className="table-wrapper">
          <table>
            <thead>
              <tr>
                <th>Sr No</th>
                <th>Name</th>
                <th>Email</th>
                <th>Mobile</th>
                <th>DOB</th>
                <th>Gender</th>
                <th>Course</th>
                <th>Skills</th>
                <th>Address</th>
              </tr>
            </thead>

            <tbody>
              {students.map((student, index) => (
                <tr key={student.id}>
                  <td>{index + 1}</td>
                  <td>{student.name}</td>
                  <td>{student.email}</td>
                  <td>{student.mobile}</td>
                  <td>{student.dob}</td>
                  <td>{student.gender}</td>
                  <td>{student.course}</td>
                  <td>{student.skills.join(", ")}</td>
                  <td>{student.address}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      )}
    </section>
  );
}

export default StudentTable;


