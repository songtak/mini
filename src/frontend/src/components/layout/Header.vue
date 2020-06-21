<template>
    <div id="back">
        <div id="header" >
            <router-link to="/">
                <img
                        id="mainimg" style="padding: 20px; text-align: center; background: black;"
                        src="https://i.pinimg.com/originals/7f/22/96/7f22963d97da87d2714d3029c79a0341.gif"
                        title="mainimg"
                />
            </router-link>
        </div>
    </div>
</template>

<script>
    export default {
        name: "Header"
    }
</script>

<style scoped>

    #header {
        text-align: center;
        background: black;
    }
    #mainimg{
        height: 280px;
    }
</style>