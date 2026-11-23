import { useState } from "react";

const initialForm = {
  name: "",
  email: "",
  mobile: "",
  dob: "",
  gender: "",
  course: "",
  skills: [],
  address: ""
};

function StudentForm({ addStudent }) {

  const [formData, setFormData] = useState(initialForm);

  const handleChange = (e) => {
    const { name, value } = e.target;

    setFormData({
      ...formData,
      [name]: value
    });
  };

  const handleSkillChange = (e) => {
    const { value, checked } = e.target;

    setFormData({
      ...formData,
      skills: checked
        ? [...formData.skills, value]
        : formData.skills.filter(skill => skill !== value)
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (formData.skills.length === 0) {
      alert("Please select at least one skill");
      return;
    }

    addStudent(formData);

    setFormData({
      ...initialForm,
      skills: []
    });
  };

  const today = new Date().toLocaleDateString("en-CA");

  return (
    <section className="form-section">
      <h2>Student Registration</h2>

      <form onSubmit={handleSubmit}>

        <label htmlFor="name">Student Name</label>
        <input
          id="name"
          type="text"
          name="name"
          value={formData.name}
          onChange={handleChange}
          required
          minLength="3"
          maxLength="50"
          pattern="[A-Za-z ]+"
          title="Only letters and spaces are allowed"
        />

        <label htmlFor="email">Email</label>
        <input
          id="email"
          type="email"
          name="email"
          value={formData.email}
          onChange={handleChange}
          required
        />

        <label htmlFor="mobile">Mobile Number</label>
        <input
          id="mobile"
          type="tel"
          name="mobile"
          value={formData.mobile}
          onChange={handleChange}
          pattern="[6-9][0-9]{9}"
          minLength="10"
          maxLength="10"
          title="Enter a valid 10-digit Indian mobile number"
          required
        />

        <label htmlFor="dob">Date of Birth</label>
        <input
          id="dob"
          type="date"
          name="dob"
          value={formData.dob}
          onChange={handleChange}
          max={today}
          required
        />

        <fieldset>
          <legend>Gender</legend>

          {["Male", "Female", "Other"].map(gender => (
            <label key={gender}>
              <input
                type="radio"
                name="gender"
                value={gender}
                checked={formData.gender === gender}
                onChange={handleChange}
                required
              />
              {gender}
            </label>
          ))}
        </fieldset>

        <label htmlFor="course">Course</label>
        <select
          id="course"
          name="course"
          value={formData.course}
          onChange={handleChange}
          required
        >
          <option value="">Select Course</option>
          <option value="BCA">BCA</option>
          <option value="BSc">BSc</option>
          <option value="BTech">BTech</option>
          <option value="MCA">MCA</option>
          <option value="MTech">MTech</option>
        </select>

        <fieldset>
          <legend>Skills</legend>

          {["HTML", "CSS", "JavaScript", "React"].map(skill => (
            <label key={skill}>
              <input
                type="checkbox"
                name="skills"
                value={skill}
                checked={formData.skills.includes(skill)}
                onChange={handleSkillChange}
              />
              {skill}
            </label>
          ))}
        </fieldset>

        <label htmlFor="address">Address</label>
        <textarea
          id="address"
          name="address"
          value={formData.address}
          onChange={handleChange}
          minLength="10"
          maxLength="200"
          required
        />

        <button type="submit">Add Student</button>
      </form>
    </section>
  );
}

export default StudentForm;