import React , {Component} from 'react';
import User from './User';
class Users extends Component {

 render(){

   // return <div> test </div>
   return (
     <div>
     <h1>{this.props.title}</h1>
<User></User>
     <User>Facebook</User>
     <User age="20">Amazon</User>
     <User age="30">petter</User>
     </div>
     // <User>Facebook</User>
     // <User>Amazon/User>
     // <User>petter england</User>

   )
 }


}
export default Users;
