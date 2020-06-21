
<template>
  <v-app>
    <v-content>
      <Header/>
      <Topnav><router-view/></Topnav>
      <router-view/>
      <Footer/>
    </v-content>
  </v-app>
</template>

<script>
  import Header from "./components/layout/Header";
  import Topnav from "./components/layout/Topnav";
  import Footer from "./components/layout/Footer";

  export default {
    name: 'App',
    components: {Header, Topnav, Footer}
  };
</script>