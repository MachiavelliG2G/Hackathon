import React from 'react'
import PropTypes from 'prop-types'
import './Counter.scss'
import { Link } from 'react-router'

export const Counter = ({ counter, increment, doubleAsync }) => (
  <div style={{ margin: '0 auto' }} >
    <h2>Your HP: {counter}</h2>
    <h2>Boss HP: ? </h2>
    <button className='btnAttack'>On this Button you can perform your standard attack</button>
    <button className='btnAttack'>On this Button you can perform your special attack</button>
    <div style={{ margin: '0 auto' }}>
      <Link to='/'><button id='homebtn' height='30px' width='50px' className='btnround'>Leave Battle :P</button></Link> 
    </div>
   {/*<button className='btn btn-primary' onClick={increment}>
      Increment
    </button>
    {' '}
    <button className='btn btn-secondary' onClick={doubleAsync}>
      Double (Async)
</button> */}
  </div>
)
Counter.propTypes = {
  counter: PropTypes.number.isRequired,
  increment: PropTypes.func.isRequired,
  doubleAsync: PropTypes.func.isRequired,
}

export default Counter
