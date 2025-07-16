import { useState } from 'react'
import Login from './components/Login'
import Signup from './components/Signup'
import { BrowserRouter ,Routes,Route } from 'react-router-dom'
import Navbar from './components/Navbar'
import Footer from './components/Footer'
import { createContext, useEffect } from 'react';

export const AuthContext = createContext();

function App() {
  const [auth, setAuth] = useState({ token: localStorage.getItem('token') || null });

  useEffect(() => {
    if (auth.token) {
      localStorage.setItem('token', auth.token);
    } else {
      localStorage.removeItem('token');
    }
  }, [auth.token]);

  return (
    <AuthContext.Provider value={{ auth, setAuth }}>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Signup />} />
        </Routes>
      </BrowserRouter>
      <Footer/>
    </AuthContext.Provider>
  )
}

export default App
