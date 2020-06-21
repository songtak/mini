import Vue from 'vue'
import Vuex from 'vuex'
import search from "./search"
import sign from "./sign"

Vue.use(Vuex)
export const store = new Vuex.Store({
    modules : {
        search, sign}
})