import React from 'react'
import DuckImage from '../assets/Duck.jpg'
import { Link } from 'react-router'
import './HomeView.scss'

export const HomeView = () => (
  <div className='niceGuy'>
    <h4>Look at all these fantastic Buttons you can click!</h4>
    <h4>We're looking forward to your donation!</h4>
    <h4>If you're lucky you even get some random useless Duck Cash currency</h4>
    <div>
      <img alt='This is a duck, because Redux!' className='duck' src={DuckImage} />
      <h4>You have 0 Ducks</h4>
    </div>
    <Link to='/counter'><button id='battlebtn' height='30px' width='50px' className='btnround'>Ready For Battle</button></Link>
    <Link to='/character'><button id='battlebtn' height='30px' width='50px' className='btnround'>Create Character</button></Link>
  </div>
)

export default HomeView
