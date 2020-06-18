import router from "@/router";
import axios from "axios";

const state ={
    context : "http://localhost:3000",
    searchWord : 'null',
    pageNumber: '0',
    list : [],
    pages : [],
    pager: {},
    item: {}

}
const actions ={
    async transferPage({commit},payload){
        axios.
        get(`${state.context}/${payload.cate}/${payload.searchWord}/${payload.pageNumber}`)
            .then(({data})=>{
                commit("TRANSFER",data)
            })
            .catch()

    },
    async retrieveOne({commit}, payload){
        axios.
        get(`${state.context}/${payload.cate}/${payload.searchWord}`)
            .then(({data})=>{
                commit("DETAIL",data)
                router.push('/floatingDetail')
            })
            .catch()
    }
}
const mutations ={
    DETAIL(state, data){
        state.item = data
    },
    TRANSFER(state, data){
        state.pager = data.pager
        state.list = data.list
    },

}




export default {
    name:"search",
    namespaced: true,
    state,
    actions,
    mutations
}