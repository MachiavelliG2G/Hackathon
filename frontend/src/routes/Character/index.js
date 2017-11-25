import { injectReducer } from '../../store/reducers'

export default (store) => ({
  path : 'character',
  /*  Async getComponent is only invoked when route matches   */
  getComponent (nextState, cb) {
    /*  Webpack - use 'require.ensure' to create a split point
        and embed an async module loader (jsonp) when bundling   */
    require.ensure([], (require) => {
      /*  Webpack - use require callback to define
          dependencies for bundling   */
      const Character = require('./containers/CharacterContainer').default
      const reducer = require('./modules/character').default

      /*  Add the reducer to the store on key 'counter'  */
      injectReducer(store, { key: 'counter', reducer })

      /*  Return getComponent   */
      cb(null, Character)

    /* Webpack named bundle   */
    }, 'character')
  }
})
