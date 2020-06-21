import router from "@/router";
import axios from "axios";
import Vue from "vue";

Vue.use(router)

const state ={
    context : "http://localhost:3000",
    searchWord : 'null',
    road: {},
    list : [],
    pages : [],
    pager: {},
    item: {},
    item2: {},
    pageNumber : 0

}
const actions ={
    async transferPage({commit},payload){
        state.pageNumber = 0
        state.searchWord = payload.searchWord
        axios.
        get(`${state.context}/${payload.cate}/${payload.searchWord}/${payload.pageNumber}`)
            .then(({data})=>{
                commit("TRANSFER",data)
                router.push('/floatingList')
            }).catch(()=>{
        })
    },
    async retrieveOne({commit}, payload){
        axios.
        get(`${state.context}/${payload.cate}/${payload.seq}`)
            .then(({data})=>{
                commit("DETAIL",data)
            }).catch(()=>{
        })
    }
}
const mutations ={
    DETAIL(state, data){
        state.item2 = data
    },

    TRANSFER(state, data){
        state.list = [];
        state.pages = [];
        data.list.forEach(item => {
            state.list.push({
                floatingSeq: item.floatingSeq,
                roadName: item.roadName,
                startPoint: item.startPoint,
                endPoint: item.endPoint,
                km: item.km,
                required: item.required,
                updateDate: item.updateDate,
                provider: item.provider
            });
        })
            state.pager = data.pager
            let i = state.pager.startPage
            let arr = []
            for (; i <= state.pager.endPage; i++) {
                arr.push(i + 1)
            }
            state.pages = arr
            state.pageNumber = data.pager.pageNumber
        }
}


export default {
    name:"search",
    namespaced: true,
    state,
    actions,
    mutations
}