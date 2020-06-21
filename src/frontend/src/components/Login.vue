<template>
<div id="back">

        <div class="container">
            <label style="font-size:23px; color:#ffffff">ID</label>
            <input style="font-size:18px; color:#ffffff" type="text"  @keyup.enter="id"  v-model="id" placeholder="Enter Username" required>

            <label style="font-size:23px; color:#ffffff">PASSWORD</label>
            <input style="font-size:18px; color:#ffffff" type="text" @keyup.enter="password"   v-model="password" placeholder="Enter Password" required>

            <button @click="login"  type="submit">Login</button>

        </div>

</div>
</template>

<script>
    export default {
        name: "login",
        data(){
            return{
                id:'',
                password:''
            }
        },
        methods: {
            login(){
                if(this.id!=''&&this.password!=''){
                    this.$store.dispatch('sign/login',{id:this.id, password:this.password})
                }else alert('아이디 및 비밀번호를 입력해주세요.')
            }
        }
}

</script>
<style scoped>

body {
  font-family: Arial;
  padding: 10px;
  background: #000000;
}
 #back{
    background-color: black;}

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