import React, { Component } from 'react';

class Child extends Component {

constructor(){
  super();
console.log("===========$$$$$==========>Child constructor");
}


componentWillMount(){
  console.log("==========$$$$$$$===========>Child componentWillMount");
}
componentWillReceiveProps(){
  console.log(" Child componentWillReceiveProps");
}
shouldComponentUpdate(nextprops,nextstate){
    console.log("child shouldComponentUpdate"+nextprops +" "+nextstate);
  return true;
}


componentWillUpdate(){

}
componentDidUpdate(){
    this.setState({name:"jill"});
}
  render() {
    console.log("=====$$$$$$========>Child render");

    return (
      <div className="App">
            <h1>Hello Child {this.props.name}</h1>
      </div>

    );
  }

  componentDidMount(){
    console.log("==========$$$$$$$$===========> Child componentDidMount");
  }

}

export default Child;
