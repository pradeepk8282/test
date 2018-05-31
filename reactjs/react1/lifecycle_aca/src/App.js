import React, { Component } from 'react';


class App extends Component {
  constructor(){
    super();
    console.log("constructor");
  }


  componentWillMount()
  {
    console.log("componentWillMount");
  }
  componentDidMount()
  {
    console.log("componentDidMount");
  }

  componentWillReceiveProps(nextProps)
  {
      console.log("componentWillRecieveProps");
  }

  shouldComponentUpdate(nextProps,nextState)
{
console.log("shouldComponentUpdate");
return  true;
}
componentWillUpdate(nextProps,nextState){
console.log("componentWillUpdate");
}
componentDidUpdate(prevProps,prevState){
  console.log("componentDidUpdate");
}
componentWillUnmount(){
  console.log("componentWillUnmount");
}
  render() {
    console.log("REnder");
    return (
      <div className="App">

      </div>
    );
  }
}

export default App;
