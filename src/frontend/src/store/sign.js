import axios from 'axios'
import router from '../router'


const state = {
    context : 'http://localhost:3000/signs',
    id:'',
    join:{},
    loginstate:false,
}

const actions={
    async join({commit},payload){
        axios.post(`${state.context}/signup`,
            payload,
            {authorization:'JWT fefege..',
                Accept : 'application/json',
                'Content-Type' : 'application/json'})
            .then(({data})=>{
                switch (data) {
                    case 'SUCCESS': alert('회원가입 완료');commit('JOIN');break;
                    case 'FAIL': alert('다시 입력해주세요');break;
                }

            })
            .catch((err)=>{
                alert(`통신에러 ${err}`)})
    },
    async login({commit},payload) {
        axios.post(`${state.context}/signin/${payload.id}`,
            payload,
            {
                authorization: 'JWT fefege..',
                Accept: 'application/json',
                'Content-Type': 'application/json'
            })
            .then(({data}) => {
                console.log(data)
                switch (data) {
                    case 'SUCCESS':
                        alert('로그인 되었습니다.');
                        commit('LOGIN');
                        state.id = payload.id;
                        sessionStorage.setItem('loginstate', state.id)
                        break;
                    case 'FAIL':
                        alert('아이디를 다시 입력해주세요.');
                        break;
                }
            })
            .catch((err) => {
                alert(`로그인 통신에러 ${err}`)
            })
    }

}
const mutations = {
    JOIN(){
        router.push('login')
    },
    LOGIN(){
        state.loginstate=true;
        router.push('/')
    }
}
const getters={}
export default {
    namespaced : true,
    state,
    actions,
    mutations,
    getters
}