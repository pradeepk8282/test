import React, { Component } from 'react';

import './Child.scss'
class Child extends Component {
  render() {
    return (
      <div className="InnerChild">
        <h2>Green Background</h2>
      </div>
    );
  }
}

export default Child;
