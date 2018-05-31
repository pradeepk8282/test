import React, { Component } from 'react';
import Child from './parentToChild/child';
import './App.css';
import Parent from "./parentToChild/parent";

class App extends Component {
  state={
    title:'placeholder title'
  }
  changeTheWorld=(newTitle)=>{
    this.setState({title:newTitle});
  }
  render() {
    return (
      <div className="App">
    <Child dowhatever={this.changeTheWorld.bind(this,'newworld')} title={this.state.title}/>
        <Parent dowhatever={this.changeTheWorld.bind(this,'newworld')} title={this.state.title}/>
      </div>
    );
  }
}

export default App;
