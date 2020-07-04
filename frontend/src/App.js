import React, { Component } from "react";
import AddEmployee from "./components/AddEmployee";
import { Route, BrowserRouter as Router } from "react-router-dom";
// import Table from "./components/Table";
import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <Router>
      <Route exact path="/" component={AddEmployee} />
      {/* <Route exact path="/employees" component={\Table} /> */}
    </Router>
  );
}

export default App;
