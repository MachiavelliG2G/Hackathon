import React from 'react'
import PropTypes from 'prop-types'

export const Map1 = ({ map1, increment, doubleAsync }) => (
  <div style={{ margin: '0 auto' }} >
    <h2>Counter: {counter}</h2>
    <button className='btn btn-primary' onClick={increment}>
      Increment
    </button>
    {' '}
    <button className='btn btn-secondary' onClick={doubleAsync}>
      Double (Async)
    </button>
  </div>
)
Map1.propTypes = {
  counter: PropTypes.number.isRequired,
  increment: PropTypes.func.isRequired,
  doubleAsync: PropTypes.func.isRequired,
}

export default Map1