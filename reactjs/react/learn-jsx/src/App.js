import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

function Sayhello() {
  return <h1>Nice name</h1>
}
class App extends Component {
  render() {
    return (
      <div>
      <Sayhello></Sayhello>
      </div>
    );


    /*React.createElement(
  "div",
  null,
  React.createElement(
    "h1",
    null,
    "Hello"
  )
);*/
    // (
    //
    //  <div className="ad">Hello</div>
    // );

  }
}

export default App;
