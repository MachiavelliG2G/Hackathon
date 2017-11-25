// ------------------------------------
// Constants
// ------------------------------------
export const UPDATE_SOCKET_CONNECTION = 'UPDATE_SOCKET_CONNECTION'

// ------------------------------------
// Actions
// ------------------------------------
export function updateSocket (socket) {
  return {
    type    : UPDATE_SOCKET_CONNECTION,
    payload : socket
  }
}

// ------------------------------------
// Action Handlers
// ------------------------------------
const ACTION_HANDLERS = {
    [UPDATE_SOCKET_CONNECTION]    : (state, action) => action.payload,
  }
  

// ------------------------------------
// Reducer
// ------------------------------------
const initialState = {};
export default function socketReducer (state = initialState, action) {
    const handler = ACTION_HANDLERS[action.type]
    return handler ? handler(state, action) : state
  }
  