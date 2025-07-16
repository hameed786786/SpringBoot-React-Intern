import { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
const Signup = () => {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [userName, setUserName] = useState("");
  const [roles, setRoles] = useState("");
  const [error, setError] = useState("");
  const [success, setSuccess] = useState("");
  const navigate = useNavigate();

  async function addNewEmployee(e) {
    e.preventDefault();
    setError("");
    setSuccess("");
    const roleArray = roles.split(",").map((role) => role.trim());
    try {
      const req = await axios.post("https://springboot-react-intern.onrender.com/api/auth/register", {
        name,
        email,
        password,
        userName,
        roles: roleArray,
      });
      if (req.data) {
        setSuccess("Registration successful! Redirecting to login...");
        setTimeout(() => navigate("/login"), 1500);
      } else {
        setError("Registration failed. Please try again.");
      }
    } catch (err) {
      setError(err.response?.data?.message || "Registration failed. Please try again.");
    }
  }

  return (
    <section>
      <h2>SignUp</h2>
      <div>
        <form onSubmit={addNewEmployee}>
          <label htmlFor="name">Employee Name: </label>
          <input
            type="text"
            id="name"
            name="name"
            onChange={(e) => setName(e.target.value)}
          />
          <br />
          <br />
          <label htmlFor="email">Employee Email: </label>
          <input
            type="email"
            id="email"
            name="email"
            onChange={(e) => setEmail(e.target.value)}
          />
          <br />
          <br />
          <label htmlFor="password">Employee Password: </label>
          <input
            type="password"
            id="password"
            name="password"
            onChange={(e) => setPassword(e.target.value)}
          />
          <br />
          <br />
          <label htmlFor="userName">Employee userName: </label>
          <input
            type="text"
            id="userName"
            name="userName"
            onChange={(e) => setUserName(e.target.value)}
          />
          <br />
          <br />
          <label htmlFor="roles">Employee roles: </label>
          <input
            type="text"
            id="roles"
            name="roles"
            onChange={(e) => setRoles(e.target.value)}
          />
          <br />
          <br />
          <button type="submit">Submit</button>
          <br />
          <br />
          {error && <div style={{ color: "red" }}>{error}</div>}
          {success && <div style={{ color: "green" }}>{success}</div>}
        </form>
      </div>
    </section>
  );
};
export default Signup;
