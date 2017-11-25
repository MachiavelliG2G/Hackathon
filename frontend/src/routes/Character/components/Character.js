import React from 'react'
import PropTypes from 'prop-types'
import './Character.scss'
import io from 'socket.io-client';

export default class Character extends React.Component {
  connectToSocket() {
    const socket = io('http://192.168.42.16:5050');
    socket.emit('login', this.refs.name.value, (cb) => {
      this.props.updateSocket(socket);
    })
  }
  render() {
    return(
      <div style={{ margin: '0 auto' }} >
      <h2>Enter Playername:</h2>
      <input ref="name"  type="text"></input>
      <button className='btnSubmit' onClick={this.connectToSocket.bind(this)}>Submit</button>
    </div>
    );
  }
}