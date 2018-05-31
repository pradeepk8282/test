import React, { Component } from 'react';
import './App.css';
import Child from './child'

class App extends Component {

  constructor(){
    super();
    console.log("constructor");
    this.state={
      name:"petter"
    }
  }
  componentWillMount(){
    console.log("ComponentWillMount");
  }
  componentDidMount(){


    console.log("componentDidMount");
}
componentWillReceiveProps(){
  console.log("componentWillReceiveProps");
}
shouldComponentUpdate(nextprops,nextstate){
    console.log("shouldComponentUpdate");
    return true;
}
componentWillUpdate(){
  console.log("componentWillUpdate");
}
componentDidUpdate(){
  console.log("componentDidUpdate");
}



changeName(){
  this.setState({name:"AOc"})
}
  render() {
    console.log("Render");
    return (
      <div className="App">

        <Child name={this.props.name}/>
        <button onClick={this.changeName.bind(this)}>Button</button>
        </div>
    );
  }
}

export default App;
