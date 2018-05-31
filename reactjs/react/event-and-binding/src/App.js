import React, { Component } from 'react';
import './App.css';

class App extends Component {

  state={
    name:'hello world'
  }
  changeName=()=>{
    this.setState(
      {
        name:'WelCome to neorays'
      }
    )
  }
  changeName1=(newname)=>{
    this.setState(
      {
        name:newname
      }
    )
  }
  changeNamefrominput=(event)=>{
    this.setState(
      {
        name:event.target.value
      }
    )
  }
  render() {
    return (
      <div className="App">
      <br/><br/>
    By Passing value  <button onClick={()=>this.changeName1('welcome to NewRays')}>change state</button><br/><br/>
    By HardCoded  <button onClick={this.changeName}>change state1</button><br/>
    Using Bind    <button onClick={this.changeName1.bind(this,"WELLCOME TO NEORAYS")}>change state3</button><br/>

      <br/><br/>
    data from users <input type="text" onChange={this.changeNamefrominput}/><br/>
    TwoWay Binding  <input type="text" onChange={this.changeNamefrominput} value ={this.state.name}/>
      <div>{this.state.name}</div>
      </div>
    );
  }
}

export default App;
