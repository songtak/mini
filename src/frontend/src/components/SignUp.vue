<template>
    <div class="container">

        <header>
            <h2>Sign Up Form (Coded)</h2>
            <p>Based on <a href="https://drc8llcc7rqy7.cloudfront.net/shots/2409898/24-sign-up-large" target="blank">Sign Up Design #39</a> by <a href="https://dribbble.com/deab" target="blank">Denis Abdullin</a>.</p>
        </header>

        <div id="app" class="signup">
            <transition name="fade" mode="out-in">
                <component :is="compname" @change_comp="swapcomp($event)"></component>
            </transition>
        </div>

        <template id="signup-form">
            <form>
                <div class="form-group">
                    <label id="email">Email</label>
                    <input type="text" v-model="email" />
                    <span v-if="email.length > 1">{{ email_msg }}</span>
                </div>
                <div class="form-group">
                    <label id="psw1">Password <span id="characters">(6 or more characters required)</span></label>
                    <input type="password" v-model="password1" />
                    <span v-show="msg1">{{ pwd1_msg }}</span>
                </div>
                <div class="form-group">
                    <label id="psw2">Repeat Password</label>
                    <input type="password" v-model="password2" />
                    <span v-show="msg2">{{ pwd2_msg }}</span>
                </div>
                <div class="form-group">
                    <button :class="{active: disable_btn}":disabled="disable_btn" @click.prevent="on_signup()">Sign Up</button>
                    <a href="#0" @click="show_terms()">terms & conditions</a>
                </div>
            </form>
        </template>

        <template id="results">
            <div class="results">
                <h4>FORM SUBMIT SUCCESSFUL</h4>
                <p>Form data gets saved and/or sent to server. There could also be a confirmation sent to email address</p>
                <p>Button would take you to some sort of after signup page.
                    In this case it just shows the form again</p>
                <button @click="back_to_signup()">Continue</button>
            </div>
        </template>

        <template id="terms">
            <div class="terms">
                <h4>TERMS & CONDITIONS</h4>
                <p>A list of terms, conditions, and policies.</p>
                <button @click="back_to_signup()">Back</button>
            </div>
        </template>

    </div>
</template>

<script>
    import SignupForm from './SignupForm';
    import Results from './Results';
    import Terms from './Terms';


    export default {
            // DATA
            data: {
                email: '',
                psw1: '',
                psw2: '',
                compname: 'signup-form'
            },
            components: {
                'signup-form': SignupForm,
                'results': Results,
                'terms': Terms
            },

            methods: {
                swapcomp: function (comp) {
                    this.compname = comp;
                }
            }

    }
</script>

<style scoped>
    @import url('https://fonts.googleapis.com/css?family=Roboto');
    * {
        box-sizing: border-box;
    }
    body {
        height: 100%;
        font-family: 'Roboto', sans-serif;
        background: linear-gradient(to left, #79CB0A , #B5D020);
    }
    .container {
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
    }
    header {
        margin: 30px 0;
        text-align: center;
    }
    h2 {
        text-transform: uppercase;
        margin: 0;
    }
    p {
        font-size: 1em;
    }
    a {
        text-decoration: none;
        border-bottom: 2px dotted #FF8700;
        color: inherit;
    }

    .signup {
        width: 700px;
        height: 460px;
        position: relative;
        overflow: hidden;
        box-shadow: 10px 10px 60px rgba(0, 0, 0, .4);
        display: flex;
        justify-content: flex-end;
        align-items: center;
        border-radius: 5px;
    }
    .signup:before {
        content: "";
        position: absolute;
        width: 100%;
        height: 100%;
        transform: scaleX(-1);
        z-index: -1;
        background: url(https://source.unsplash.com/Qmox1MkYDnY/900x500) no-repeat;
    }
    form {
        width: 50%;
        height: 80%;
        padding: 20px 50px 20px 20px;;
    }
    form .form-group {
        display: flex;
        flex-direction: column;
        margin: 0 0 20px 0;
        color: #8F949B;
        font-size: .9em;}
    label {
        margin: 0 0 16px 0;
    }
    span {
        font-size: .8em;
        color:#FF3400;
    }
    span#characters {
        font-size: .8em;
        color: #8F949B;
    }
    .form-group input[type="text"],
    .form-group input[type="password"] {
        border: none;
        outline: none;
        background: transparent;
        padding: 0 0 10px 0;
        font-size: 1em;
        border-bottom: 1px dotted #8F949B;
    }
    .form-group input[type="password"] {
        color: #FF3400;
    }
    form .form-group:last-child {
        flex-direction: row;
        justify-content: space-between;
        align-items: center;
        margin: 40px 0 0 0;}
    button {
        border: none;
        background: linear-gradient(to left, #FF8700 , #FFB100);
        padding: 10px 30px;
        border-radius: 20px;
        color: #FFFFFF;
        font-size: .8em;
        font-weight: bold;
        letter-spacing: 1px;
        cursor: pointer;
    }
    button.active {
        opacity: .5;
        cursor: default;
    }
    a {
        color: #8F949B;
        text-decoration: dotted;
        font-size: .8em;
    }
    .results, .terms {
        width: 50%;
        height: 80%;
        padding: 20px 50px 20px 20px;
    }
    .fade-enter-active, .fade-leave-active {
        transition: all .8s;
    }
    .fade-enter, .fade-leave-active {
        opacity: 0;
        transform: translateX(-40px);
    }
</style>