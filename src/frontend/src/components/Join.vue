<template>
<div class="back">

        <div class="container">
            <label style="font-size:23px; color:#ffffff">ID</label>
            <input type="id"  @keyup.enter="id"  v-model="id" placeholder="ENTER ID" required>

            <label style="font-size:23px; color:#ffffff">PASSWORD</label>
            <input  type="password" @keyup.enter="password"   v-model="password" placeholder="ENTER PASSWORD" required>

           <label style="font-size:23px; color:#ffffff">NAME</label>
            <input type="name"  @keyup.enter="name"  v-model="name" placeholder="ENTER NAME" required>


            <label style="font-size:23px; color:#ffffff">PHONENUMBER</label>
            <input  type="phonenumber"  @keyup.enter="phonenumber"  v-model="phoneNumber" placeholder="ENTER PHONENUMBER" required>

            <label style="font-size:23px; color:#ffffff">BIRTH</label>
            <input  type="birth" @keyup.enter="birth"   v-model="birth" placeholder="ENTER BIRTH" required>


            <label style="font-size:23px; color:#ffffff;">SEX</label>
            <input  type="sex" @keyup.enter="sex"   v-model="sex" placeholder="ENTER SEX" required>


            <button @click="join" style="font-size:27px; margin:40px 0px 0px 0px" type="submit">SIGN UP</button>

        </div>
        <div class="container" style="background-color:black" >
            <router-link to="/"><button type="button" class="cancelbtn">CANCEL</button></router-link>
        </div>

</div>
</template>

<script>
    export default {
        data(){
        return{
            id: '',
            password: '',
            name: '',
            phoneNumber: '',
            birth: '',
            sex: ''
        }
        },
        methods: {
            join() {
                this.$store.dispatch('sign/join',
                    {id:this.id, password:this.password, name:this.name,
                    phoneNumber:this.phoneNumber, birth:this.birth,
                    sex:this.sex})
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
 .back{
    height: 1500px;
    background-color: black;}


   form {border: 3px solid #f1f1f1;}
    input[type=id], input[type=password],
    input[type=name], input[type=phonenumber],
    input[type=birth], input[type=sex]{
        width: 100%;
        padding: 12px 20px;
        margin: 0px 0px 19px 0px;
        display: inline-block;
        border: 1px solid #00ff00;
        box-sizing: border-box;
    }




    #topnav span {
      display: block;
      color: black;
      text-align: center;
      padding: 14px 16px;
    }

    input{
        font-size:19px;
        color:#ffffff;
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