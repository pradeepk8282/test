import React, { Component } from 'react';

import './ChildA.sass'
class ChildA extends Component {
  render() {
    return (
      <div className="InnerChildA">
        <h2>RED Background</h2>
      </div>
    );
  }
}

export default ChildA;
