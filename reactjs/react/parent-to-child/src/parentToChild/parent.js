import React from 'react';
import Child from './child';

const parent =(props)=>{
  return (
    <div>
    <Child {...props}/>
    </div>
  )
}
export default parent;
