import React from 'react'
import PropTypes from 'prop-types'
import './Counter.scss'
import { Link } from 'react-router'

export default class Counter extends React.Component {
  static propTypes = {
    counter: PropTypes.object.isRequired,
  }
  componentWillMount() {
    this.props.socket.on('battlestate', (data) => {
      this.props.updateCombatState(data);
    })
  }
  attack() {
    this.props.socket.emit('attack');
  }
  specialattack() {
    this.props.socket.emit('specialattack');
  }
  render () {
    this.participants = this.props.counter.participants.map((details, i) => {
      return(
        <div key={i} style={{'textAlign': 'left', 'borderLeft': '6px solid #2196F3 !important', 'backgroundColor': '#ddffff', 'marginBottom': '4px'}}>
          <h3>Name: {details.name}</h3>
          <p>HP: {details.hp}/{details.maxhp}</p>
          <i style={{width: '100%', 'textAlign': 'right'}}>State: {details.status}</i>
        </div>
      );
    });
    this.logs = this.props.counter.logs.map((details, i) => {
      return(
        <p>{details}</p>
      )
    });
    return(
      <div style={{ margin: '0 auto' }} >
      <h2>Boss HP: {this.props.counter.boss.hp}/{this.props.counter.boss.maxhp} </h2>
      <button onClick={this.attack.bind(this)} className='btnAttack'>On this Button you can perform your standard attack</button>
      <button onClick={this.specialattack.bind(this)} className='btnAttack'>On this Button you can perform your special attack</button>
      <div style={{ margin: '0 auto' }}>
        <Link to='/'><button id='homebtn' height='30px' width='50px' className='btnround'>Leave Battle :P</button></Link> 
      </div>
      {this.participants}
      <div style={{'textAlign': 'left', 'borderLeft': '6px solid #2196F3 !important', 'backgroundColor': '#ddffff', 'marginBottom': '4px'}}>
      <h2>Logs</h2>
      {this.logs}
      </div>
    </div>
    );
  }
}
