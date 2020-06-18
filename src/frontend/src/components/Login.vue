<template>
<div id="back">
<div id="header" >
            <router-link to="/"><img
               id="mainimg"
               src="https://i.pinimg.com/originals/7f/22/96/7f22963d97da87d2714d3029c79a0341.gif"
               title="mainimg"
            /></router-link>
</div>

        <div class="container">
            <label >ID</label>
            <input type="text"  @keyup.enter="moveToPasswd"  v-model="userid" placeholder="Enter Username" required>

            <label>PASSWORD</label>
            <input type="password" @keyup.enter="login"   v-model="passwd" placeholder="Enter Password" id="passwd" required>

            <button @click="login"  type="submit">Login</button>

        </div>
        <div class="container" style="background-color:black" >
            <button type="button" class="cancelbtn">Cancel</button>
        </div>

</div>
</template>

<script>
    export default {
        methods: {
        }
};

</script>
<style scoped>
  box-sizing: border-box;

body {
  font-family: Arial;
  padding: 10px;
  background: #000000;
}
 #back{
    background-color: black;}

 #header {
  padding: 20px;
  text-align: left;
  background: black;
}

#mainimg{
   height: 100px;
  }
   form {border: 3px solid #f1f1f1;}
    input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #00ff00;
        box-sizing: border-box;
    }
    button {
        background-color: #00ff00;
        color: black;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
    }
    button:hover {
        opacity: 0.8;
        background-color: #009933;
    }
    .cancelbtn {
        color: black;
        width: auto;
        padding: 10px 18px;
        background-color: #00ff00;
    }
    .imgcontainer {
        text-align: center;
        margin: 24px 0 12px 0;
    }
    img.avatar {
        width: 40%;
        border-radius: 50%;
    }
    .container {
        background-color: black;
        padding: 16px;
    }
    span.psw {
        float: right;
        padding-top: 16px;
    }
    /* Change styles for span and cancel button on extra small screens */
    @media screen and (max-width: 300px) {
        span.psw {
            display: block;
            float: none;
        }
        .cancelbtn {
            width: 100%;
        }
    }




</style>