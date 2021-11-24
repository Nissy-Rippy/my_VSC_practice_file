import React from "react";

class App extends React.Component{
  render(){

    returen(
      <p></p>
    );
  }
}
export default App ;

import React from 'react';

class App extends React.Component {
  render() {
    return (
      <h1>Hello World</h1>
    );
  }
}

export default App;

import React from "react";
class App extends React.Component {
  render() {
    return(
      <h1>hello good morning</h1>
    );
  }
}

export default App;

import React from 'react';

class App extends React.Component {
  render() {
    return (
      <div>
        <h1>Hello World</h1>
        
        <p>一緒にReactを学びましょう！</p>
        
      </div>
    );
  }
}

export default App;

import React from 'react';

class App extends React.Component {
  render() {
    return (
      <div>
        <h1>Hello World</h1>
        <p>一緒にReactを学びましょう！</p>
        <img src="https://s3-ap-northeast-1.amazonaws.com/progate/shared/images/lesson/react/ninjawanko.png"/>
        
      </div>
    );
  }
}

export default App;

import React from "react";

class App extends React.Component{
  render() {
    return (
      <h1>Hello React</h1>
    );
  }
}
export default App;

import React from 'react';

class App extends React.Component {
  render() {
    const name = "にんじゃわんこ";
    
    const imgUrl = "https://s3-ap-northeast-1.amazonaws.com/progate/shared/images/lesson/react/ninjawanko.png"
    
    return (
      <div>
        
        <h1>{name}</h1>
        
        <img src={imgUrl}/>
        
      </div>
    );
      }
}

export default App;

import React from 'react';

class App extends React.Component {
  render() {
    const name = "私はパセリ";
    
    const imgUrl = "https://s3-ap-northeast-1.amazonaws.com/progate/shared/images/lesson/react/ninjawanko.png"
    
    return (
      <div>
        
        <h1>{name}{name}</h1>
        
        <img src={imgUrl}/>
        
      </div>
    );
  }
}

export default App;