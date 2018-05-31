import React, { Component } from 'react';

import './App.css';
import Child from './comp/Child';
import ChildA from './comp/ChildA';


class App extends Component {
  render() {
    return (
      <div className="App">
        <ChildA/>
        <h2>Blue Background</h2>
        <Child/>

      </div>
    );
  }
}

export default App;
