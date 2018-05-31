import React, { Component } from 'react';
import './App.css';


class Child extends Component {

  constructor(){
    super();
    console.log("child constructor");
    this.state={
      name:"petter"
    }
  }
  componentWillMount(){
    console.log("Child ComponentWillMount");
  }
  componentDidMount(){
    console.log("Child componentDidMount");
}
componentWillReceiveProps(){
  console.log("componentWillReceiveProps");
}
shouldComponentUpdate(nextprops,nextstate){
    console.log("child shouldComponentUpdate");
    return true;
}
  render() {
    console.log("Child Render");
    return (
      <div className="App">
      {this.props.name}
      </div>
    );
  }
}

export default Child;
