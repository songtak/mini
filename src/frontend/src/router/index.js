import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../components/Home";
import Join from "../components/Join";
import Login from "../components/Login";
import FloatingList from "../components/FloatingList";
import FloatingDetail from "../components/FloatingDetail";


Vue.use(VueRouter);
export default new VueRouter({
    mode: "history",
    base: process.env.BASE_URL,
    routes: [
        {path: '/', component: Home},
        {path: '/join', component: Join},
        {path: '/login', component: Login},
        {path: '/floatingList', component: FloatingList},
        {path: '/floatingDetail', component: FloatingDetail}

    ]
});