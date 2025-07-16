import { useState, useContext } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import { AuthContext } from "../App";

const Login = () => {
  const [userName, setUserName] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");
  const { setAuth } = useContext(AuthContext);
  const navigate = useNavigate();

  async function handleLogin(event) {
    event.preventDefault();
    setError("");
    try {
      const res = await axios.post("https://springboot-react-intern.onrender.com/api/auth/login", { userName, password });
      if (res.data && res.data.token) {
        setAuth({ token: res.data.token, user: res.data.user });
        alert("Login Successful");
        navigate("/");
      } else {
        setError("Invalid response from server");
      }
    } catch (e) {
      setError("Invalid credentials or server error");
    }
  }

  return (
    <div>
      <h2>Login</h2>
      <div>
        <form onSubmit={handleLogin}>
          <label htmlFor="userName">User Name</label>
          <input
            id="userName"
            name="userName"
            value={userName}
            type="text"
            onChange={(e) => setUserName(e.target.value)}
          />
          <br /> <br />
          <label htmlFor="password">Password</label>
          <input
            id="password"
            name="password"
            value={password}
            type="password"
            onChange={(e) => setPassword(e.target.value)}
          />
          <br />
          <br />
          <button type="submit">Login</button>
          <br /><br />
          {error && <div style={{ color: "red" }}>{error}</div>}
        </form>
      </div>
    </div>
  );
};
export default Login;