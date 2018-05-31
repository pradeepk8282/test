import React, { Component } from 'react';
import Child from './Child'
class App extends Component {

constructor(){
  super();
  this.state={
    name:"pradeep"
  }

console.log("=====================>constructor");
}


componentWillMount(){
  console.log("=====================>componentWillMount");
}
shouldComponentUpdate(nextprops,nextstate)
{
  console.log("shouldComponentUpdate"+nextprops +" "+nextstate);
  return  true;
}

        changeState(){
          this.setState({name:"asdasdasd"});
        }
        componentWillReceiveProps(){
          console.log("componentWillReceiveProps");
        }

  render() {
    console.log("=====================>render");

    return (
      <div className="App">
{this.state.name}
<Child name ={this.state.name}/>
<button onClick={this.changeState.bind(this)}>Change State</button>
      </div>

    );
  }

  componentDidMount(){
    console.log("=====================>componentDidMount");
  }
  componentWillUpdate(nextprops,nextstate){

  }

}

export default App;
