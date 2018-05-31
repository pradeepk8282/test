import React, { Component,PureComponent } from 'react';
import logo from './logo.svg';
import './App.css';

const Temp =(props)=>{
    console.log("temp");
  return (
    <div>{props.val}</div>
  );
}


class App extends PureComponent {
  state = {
    val:1
  }
  // shouldComponentUpdate(nextprops,nextstate){
  //   return (this.state.val===nextstate.val?false:true);
  // }
componentDidMount(){
  setInterval(()=>{
    this.setState(()=>{
      return {val:Math.random()}
    })
  },2000)
}
  render() {
console.log("render");
    return (

      <div className="App">
      <Temp val={this.state.val}/>
      </div>
    );
  }
}

export default App;
