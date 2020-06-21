<template>
    <div id="topnav">
        <router-link to="/floatingList"><span id="a"> FIND </span></router-link>
        <router-link to="/floatingMap"><span id="b"> LET'S GO FLOATING </span></router-link>
        <router-link to="/login"><span id="login">SIGN IN</span></router-link>
        <router-link to="/join"><span id="join">SIGN UP</span></router-link>
    </div>
</template>

<script>
    export default {
        name: "Topnav"
    }
</script>

<style scoped>
    #topnav {
        font-size: 24px;
        color: black;
        overflow: hidden;
        background-color: #00ff00;
    }

    #topnav span {
        display: block;
        color: black;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
    }
    #topnav span:hover {
        background-color: #009900;
        color: white;
    }
    #a{float:left}
    #b{float:left}
    #join{
        float:right
    }

    #login{
        float:right}

</style>