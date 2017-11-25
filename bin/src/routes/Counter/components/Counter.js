import React from 'react'
import PropTypes from 'prop-types'
import './Counter.scss'
import { Link } from 'react-router'

export default class Counter extends React.Component {
  static propTypes = {
    counter: PropTypes.object.isRequired,
    increment: PropTypes.func.isRequired,
    doubleAsync: PropTypes.func.isRequired,
  }
  render () {
    this.participants = this.props.counter.participants.map((details, i) => {
      return(
        <div></div>
      );
    })
    return(
      <div style={{ margin: '0 auto' }} >
      <h2>Boss HP: {this.props.counter.boss.hp}/{this.props.counter.boss.maxhp} </h2>
      <button className='btnAttack'>On this Button you can perform your standard attack</button>
      <button className='btnAttack'>On this Button you can perform your special attack</button>
      <div style={{ margin: '0 auto' }}>
        <Link to='/'><button id='homebtn' height='30px' width='50px' className='btnround'>Leave Battle :P</button></Link> 
      </div>
    </div>
    );
  }
}
