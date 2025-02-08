import React from 'react';
import ReactDOM from 'react-dom';

const App = () => {
  return (
    <div>
      <header>
        <h1>Welcome to My Website</h1>
      </header>
      <main>
        <p>This is a simple website built with React.</p>
      </main>
      <footer>
        <p>&copy; 2023 My Website</p>
      </footer>
    </div>
  );
};

ReactDOM.render(<App />, document.getElementById('root'));
