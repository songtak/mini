<template>
<div id="back">
<div id="header" >
            <img
               id="mainimg"
               src="https://i.pinimg.com/originals/7f/22/96/7f22963d97da87d2714d3029c79a0341.gif"
               title="mainimg"
            />
</div>

<div id="topnav">
  <router-link to="/floatingList"><span id="a"> FIND FLOAT</span></router-link>
  <router-link to="/floatingMap"><span id="b"> LET'S GO FLOATING </span></router-link>
  <router-link to="/login"><span id="login">SIGN IN</span></router-link>
  <router-link to="/join"><span id="join">SIGN UP</span></router-link>
</div>

<div id="row">
  <div id="leftcolumn">
    <div id="card">
      <h1>MONTHLY HOT FLOATING</h1>
      <h3>GOYANG, 2020. 6. 1 </h3>
      <div> <img id="fakeimg" src="https://lh3.googleusercontent.com/proxy/dXyOFK2UHt6LFk2YdxZd8UT3nKKd53-ejP3C_J1DMUAdBqT6xE1zTi7BWrKr02x3aanjeenq0wvzx6ZnFAGn47ObjtDV2kKsCYbIObu4pAnPMISaAXlrwOSvmXH8LCgFO5Vu7pBl5VV_XXYuaA"></div>
      <p style="font-size:20px"> 송강 누리길</p>
      <p>풍광이 아름다운 하천변 메타세콰이어 길.</p>
    </div>
  </div>
  <div id="rightcolumn">
    <div id="card">
      <h2>About Us</h2>
      <div id="fakeimg">Image</div>
      <p>Some text about me in culpa qui officia deserunt mollit anim..</p>
    </div>
    <div id="card">
      <h3>Popular Post</h3>
    </div>
    <div id="card">
      <h3>Follow Me</h3>
      <p>Some text..</p>
    </div>
  </div>
</div>

<div id="footer">
  <h2>사업</h2>
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
  text-align: center;
  background: black;
}

#mainimg{
        height: 280px;
  }

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

#leftcolumn {
position: centered;
  width: 75%;
}
#rightcolumn {
position: centered;
  width: 75%;
}


#row{
    background-color: black;
    }

#fakeimg {
  width: 100%;
  padding: 20px;
  height:337px;
}

#card {
  position: centered;
  color: white;
  background-color: black;
  padding: 20px;
  margin-top: 20px;
}

#row:after {
position: centered;
  content: "";
  display: table;
  clear: both;
}


#footer {
  padding: 20px;
  text-align: center;
  background: #00ff00;
  margin-top: 20px;
}




</style>