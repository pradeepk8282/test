import React from 'react';


const Form=props=>(

  <form onSubmit={props.getWeather}>
      <input type="text" name="city" placeholder="City..."/>
        <input type="text" name="country" placeholder="country.."/>
        <button>getWeather</button>
  </form>
);
export default Form;