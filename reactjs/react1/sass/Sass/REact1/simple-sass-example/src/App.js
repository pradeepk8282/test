import React, { Component } from 'react';
import logo from './logo.svg';
import Child from './Child';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
            <h2>Blue colour</h2>
        </header>
        <p className="App-intro">

        </p>
        <Child/>
      </div>
    );
  }
}

export default App;
