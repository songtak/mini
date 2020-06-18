<template>
<div class="back">
<div id="header" >
            <router-link to="/"><img
               id="mainimg"
               src="https://i.pinimg.com/originals/7f/22/96/7f22963d97da87d2714d3029c79a0341.gif"
               title="mainimg"
            /></router-link>
</div>

<div id="topnav">
  <router-link to="/join"><span id="join">SIGN UP</span></router-link>
</div>

        <div class="container">
            <label style="font-size:23px; color:#ffffff">ID</label>
            <input type="id"  @keyup.enter="moveToPasswd"  v-model="id" placeholder="ENTER ID" required>

            <label style="font-size:23px; color:#ffffff">PASSWORD</label>
            <input  type="password" @keyup.enter="login"   v-model="passwd" placeholder="ENTER PASSWORD" id="passwd" required>

           <label style="font-size:23px; color:#ffffff">NAME</label>
            <input type="name"  @keyup.enter="moveToPasswd"  v-model="name" placeholder="ENTER NAME" required>

           <label style="font-size:23px; color:#ffffff">PHONENUMBER</label>
            <input  type="phonenumber"  @keyup.enter="moveToPasswd"  v-model="phoneNumber" placeholder="ENTER PHONENUMBER" required>

           <label style="font-size:23px; color:#ffffff;">SEX</label>
            <td></td>
           <label style="font-size:18px; color:#ffffff">FEMALE</label>
           <input type="checkbox" style="margin:0px 18px 0px 0px" name="female">
           <label style="font-size:18px; color:#ffffff; margin:0px 4px 0px 0px">MALE</label>
           <input type="checkbox" name="male">


            <button @click="login" style="font-size:27px; margin:40px 0px 0px 0px" type="submit">SIGN UP</button>

        </div>
        <div class="container" style="background-color:black" >
            <router-link to="/"><button type="button" class="cancelbtn">CANCEL</button></router-link>
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

body {
  font-family: Arial;
  padding: 10px;
  background: #000000;
}
 .back{
    height: 1500px;
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
    input[type=id], input[type=password],
    input[type=name], input[type=phonenumber] {
        width: 100%;
        padding: 12px 20px;
        margin: 0px 0px 19px 0px;
        display: inline-block;
        border: 1px solid #00ff00;
        box-sizing: border-box;
    }


    #topnav {
      font-size: 44px;
      color: black;
      overflow: hidden;
      background-color: #00ff00;
    }

    #topnav span {
      display: block;
      color: black;
      text-align: center;
      padding: 14px 16px;
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
        margin: 24px 0 12px;
    }
    img.avatar {
        width: 40%;
        border-radius: 50%;
    }
    .container {
        width: 50%;
        background-color: black;
        padding: 50px;
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