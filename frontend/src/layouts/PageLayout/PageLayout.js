import React from 'react'
import { IndexLink, Link } from 'react-router'
import PropTypes from 'prop-types'
import './PageLayout.scss'

export const PageLayout = ({ children }) => (
  <div className='container text-center'>
    <h1 size='13px'>Super Mega Multiplayer Game Release 2017</h1>
    <IndexLink to='/' activeClassName='page-layout__nav-item--active'>Map</IndexLink>
    {' · '}
    <Link to='/counter' activeClassName='page-layout__nav-item--active'>Battle</Link>
    {' · '}
    <Link to='/character' activeClassName='page-layout__nav-item--active'>Create Character</Link>
    <div className='page-layout__viewport'>
      {children}
    </div>
  </div>
)
PageLayout.propTypes = {
  children: PropTypes.node,
}

export default PageLayout
