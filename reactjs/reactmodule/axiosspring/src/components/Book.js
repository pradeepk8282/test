import React, { Component } from 'react';
import axios from 'axios';
  class Book extends Component
  {
    constructor(){
      super();

      this.state={
        books:[]
      }
    }

    componentWillMount(){
this.getbooks();
    }

getbooks(){
  axios.get('http://localhost:8090/Spring4MVCFileUploadCommonsExample/json').then(response=>{
    this.setState({books:response.data},()=>{
      console.log(this.state);
    })
  })

}


      render() {
        var bookitem=this.state.books.map((book,i)=>{
          return (<li key ={book.id}>{book.name}</li>);
        })
          return (<div><h1>Books</h1>
              <ul>
              {bookitem}
              </ul>

            </div>);
        }

  }

export default Book ;
