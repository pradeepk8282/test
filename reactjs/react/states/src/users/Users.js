import  React,{Component} from 'react';
import User from './User';


class Users extends Component
 {

   state ={

        Users:[
          {name:"John",age:"20"},
          {name:"Jill",age:"30"},
          {name:"Peter",age:"40"},
        ],
        title:"Users List"
   };
   makemeYounger = ()=>{

const newState=this.state.Users.map((User)=>{
  const tempUser=User;
  tempUser.age-=10;        // {tempUser.age+10};
  return tempUser;
});
this.setState({
  newState
});




     // console.log("clicked");

     // this.setState({
     //   Users:[
     //     {name:"John",age:"10"},
     //     {name:"Jill",age:"20"},
     //     {name:"Peter",age:"30"},
     //   ]
     //
     // })
     // console.log(this.state.Users);

   }
  render(){
    return (<div>
      <br/>
      <button onClick={this.makemeYounger}>Make us 10 years Younger</button>
      <br/>
      <h1>{this.state.title}</h1>
      {
        this.state.Users.map((user)=>{
          return <User age={user.age}>{user.name}</User>;
        })
      }

      </div>
    );
  }
}
export default Users;
