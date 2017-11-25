import React from 'react'
import PropTypes from 'prop-types'
import './Character.scss'

export const Character = () => (
  <div style={{ margin: '0 auto' }} >
    <h2>Enter Playername:</h2>
    <input type="text"></input>
    <button className='btnSubmit'>Submit</button>
  </div>
)
Character.propTypes = {
}

export default Character
