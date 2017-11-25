export default (store) => ({
    path : 'map1',
    /*  Async getComponent is only invoked when route matches   */
    getComponent (nextState, cb) {
      /*  Webpack - use 'require.ensure' to create a split point
          and embed an async module loader (jsonp) when bundling   */
      require.ensure([], (require) => {
        /*  Webpack - use require callback to define
            dependencies for bundling   */
        const Map1 = require('./containers/Map1Container').default
        const reducer = require('./modules/map1').default
  
        /*  Add the reducer to the store on key 'counter'  */
        injectReducer(store, { key: 'map1', reducer })
  
        /*  Return getComponent   */
        cb(null, Map1)
  
      /* Webpack named bundle   */
      }, 'map1')
    }
  })