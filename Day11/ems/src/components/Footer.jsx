import React from 'react';

const Footer = () => {
  const styles = {
          footer: {
      backgroundColor: '#e31616ff',
      color: '#f2e9e4',
      textAlign: 'center',
      padding: '2rem 0',
      fontSize: '1.1rem',
      letterSpacing: '1px',
      borderTop: '2px solid #4a4e69',
      boxShadow: '0 -2px 8px rgba(74, 78, 105, 0.10)',
      fontFamily: 'Segoe UI, Arial, sans-serif',
      marginTop: '2rem',
      display:'flex',
      alignItems:'',

    }
  };

  return (
    <footer style={styles.footer}>
      <p>© 2025 EMS. All rights reserved.</p>
    </footer>
  );
};

export default Footer;
