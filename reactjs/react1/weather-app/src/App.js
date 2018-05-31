import React from 'react';
import Titles from "./components/Titles";
import Form from "./components/Form"
import Weather from "./components/Weather"

const  API_key="5ca2642624fba6cb2e73427f51ee9edc";

class App extends React.Component  {

  state={
    temerature:undefined,
    city:undefined,
    country:undefined,
    humidity:undefined,
    discription:undefined,
    error:undefined
  }

getWeather =async(e)=>{
  e.preventDefault();
   const city=e.target.elements.city.value;
   const country=e.target.elements.country.value;
 const api_call=await fetch('http://api.openweathermap.org/data/2.5/weather?q='+city+','+country+'&appid='+API_key+'&units=metric');
  const data =await api_call.json();

  if(city && country){

    this.setState({

      temperature:data.main.temp,
      city:data.name,
      country:data.sys.country,
      humidity:data.main.humidity,
      discription:data.weather[0].description,
      error:""
    });
  }else {
    {this.setState({temerature:undefined,
    city:undefined,
    country:undefined,
    humidity:undefined,
    discription:undefined,
    error:"Please Enter the value"})

    }
  }
}

  render(){
    return (

      <div>
        <div className="wrapper">
          <div className="main">
            <div className="container">
              <div className="row">
              <div className="col-xs-5 title-container">
                <Titles/>
              </div>
              <div className="col-xs-7 form-container">
              <Form getWeather={this.getWeather}/>
                                <Weather temperature={this.state.temperature}
                              city={this.state.city}
                              country={this.state.country}
                              humidity={this.state.humidity}
                              discription={this.state.discription}
                              error={this.state.error}/>
              </div>
              </div>
            </div>
          </div>
        </div>
      </div>

    );
  }
};

export default App;
