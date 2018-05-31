import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to pradeep</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium aliquam amet animi beatae commodi dicta dignissimos doloremque, ducimus, eligendi facilis fugit ipsam minus modi officia qui quia suscipit tempora voluptatem.</p>
        </header>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>
      </div>
    );
  }
}

export default App;
