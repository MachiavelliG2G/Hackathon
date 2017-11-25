// ------------------------------------
// Constants
// ------------------------------------
export const UPDATE_COMBAT = 'UPDATE_COMBAT'

// ------------------------------------
// Actions
// ------------------------------------
export function updateCombatState (state) {
  return {
    type    : UPDATE_COMBAT,
    payload : state
  }
}

export const actions = {
  updateCombatState
}

// ------------------------------------
// Action Handlers
// ------------------------------------
const ACTION_HANDLERS = {
  [UPDATE_COMBAT]    : (state, action) => action.payload,
}

// ------------------------------------
// Reducer
// ------------------------------------
const initialState = {
  boss: {
    name: 'Ogre',
    hp: 500,
    maxhp: 600
  },
  participants: [
    {
      name: 'Mathew',
      hp: 9999,
      maxhp: 9999
    },
    {
      name: 'Simi',
      hp: 1, 
      maxhp: 2
    }
  ],
  logs: []
}
export default function counterReducer (state = initialState, action) {
  const handler = ACTION_HANDLERS[action.type]

  return handler ? handler(state, action) : state
}
