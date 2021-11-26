import React from "react";

class App extends React.Component{
  render(){

    return(
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


import React from 'react';

class App extends React.Component {
  render() {
    return (
    	<div>
    	  <h1>こんにちは、にんじゃわんこさん！</h1>
    	  
    	  <button>"ひつじ仙人"</button>
    	  <button>"にんじゃわんこ"</button>
    	  
    	  
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
    	  <h1>こんにちは、にんじゃわんこさん！</h1>
        <button onClick={()=>{console.log('ひつじ仙人')}}>ひつじ仙人</button>
        <button onClick={()=>{console.log('にんじゃわんこ')}}>にんじゃわんこ</button>
      </div>
    );
  }
}

export default App;

import React from 'react';

class App extends React.Component {
constructor(props) {
    super(props);
    this.state = {name: 'にんじゃわんこ'}
  }
  render() {
    return (
    	<div>
    	  <h1>こんにちは、にんじゃわんこさん！</h1>
        <button onClick={() => {console.log('ひつじ仙人')}}>ひつじ仙人</button>
        <button onClick={() => {console.log('にんじゃわんこ')}}>にんじゃわんこ</button>
      </div>
    );
  }
}

export default App;

import React from 'react';

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {name: 'にんじゃわんこ'};
  }
  
  render() {
    return (
    	<div>
    	  <h1>こんにちは、{this.state.name}さん!</h1>
    	  
        <button onClick={() => {console.log('ひつじ仙人')}}>ひつじ仙人</button>
        <button onClick={() => {console.log('にんじゃわんこ')}}>にんじゃわんこ</button>
      </div>
    );
  }
}

export default App;

import React from 'react';

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {name:'西島隆弘'};
  }
  
  render() {
    return (
    	<div>
\    	  <h1>こんにちはAAAの、{this.state.name}さん!今日はLiveですね＾＾</h1>
    	  
        <button onClick={() => {console.log('ひつじ仙人')}}>ひつじ仙人</button>
        <button onClick={() => {console.log('にんじゃわんこ')}}>にんじゃわんこ</button>
      </div>
    );
  }
}

export default App;



import React from 'react';
class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {name: 'にんじゃわんこ'};
  }
  render() {
    return (
    	<div>
    	  <h1>こんにちは、{this.state.name}さん！</h1>
        <button onClick={() => {this.setState({name: 'ひつじ仙人'})}}>ひつじ仙人</button>
        
        <button onClick={() => {this.setState({name: 'にんじゃわんこ'})}}>にんじゃわんこ</button>
        
      </div>
    );
  }
}
export default App;

import React from 'react';

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {age: 'おじいちゃん(´∀｀*)ｳﾌﾌ'};
  }
  
  handleClick(age){
    this.setState({age: age})
  }
  
  render() {
    return (
    	<div>
    	  <h1>こんにちは、私の年齢は{this.state.age}です！</h1>
        <button onClick={() => {this.handleClick(14)}}>ひつじ仙人</button>
        
        <button onClick={() => {this.handleClick(145)}}>にんじゃわんこ</button>
        
      </div>
    );
  }
}

export default App;
