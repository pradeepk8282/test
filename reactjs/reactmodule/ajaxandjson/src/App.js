import React, { Component } from 'react';
import './App.css';
import $ from 'jquery';

class App extends Component {

  constructor(props){
    super(props);
    this.state={
      users:[]
    }
  }


  componentDidMount(){
    console.log("componentsdid mount");
    $.ajax({
      url:"http://localhost:8090/Spring4MVCFileUploadCommonsExample/json",
      headers:{'Access-Control-Allow-Origin':'*'},
      crossDomain:true,
      success:(data)=>{
        this.setState({
          users:data
        })

      }


    })
  }
  render() {
    const {users}=this.state;
    console.log(users);
    return (

      <div className="App">
            <ul>
            {
              <
            }

          </ul>
      </div>
    );
  }
}

export default App;
