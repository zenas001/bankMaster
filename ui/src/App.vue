<template>
  <div id="app">

    <img class="logo" src="./assets/logo.png">
    <p>
      Welcome to your Vue.js app! <span
      style="color:#020202" v-text="userInfo.name"></span>
    </p>
    <p>Your ID:<span v-text="userInfo.id">
    </span></p>
    <header-a :resp="userInfo"></header-a><!---->
  </div>
</template>
<script>
  import HeaderA from './components/Header'

  export default {
    created () {
      this.$http.get('/userServices/').then((resp) => {
        this.$set('userInfo', resp.body)
        console.log(resp.body)
      })
    },
    components: {
      'header-a': HeaderA
    }
  }
</script>

<style>
  html {
    height: 100%;
  }

  body {
    display: flex;
    align-items: center;
    justify-content: center;
    height: 100%;
  }

  #app {
    color: #2c3e50;
    margin-top: -100px;
    max-width: 600px;
    font-family: Source Sans Pro, Helvetica, sans-serif;
    text-align: center;
  }

  #app a {
    color: #42b983;
    text-decoration: none;
  }

  .logo {
    width: 100px;
    height: 100px
  }


</style>
