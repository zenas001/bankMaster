<template>
  <div>
    <div class="header"><h1 v-text="msg"></h1></div>
    <span style="float:left;background-color: brown;font-size: 40px" v-bind="resp.id"></span>
    <span style="background-color: brown;font-size: 40px" v-bind="resp.name"></span>
  </div>
  <app-a ></app-a>
  <hello-a></hello-a>
</template>
<script>
  import HelloA from './Hello'
  import UserA from './User'

  export default {
    name: 'Header',
    props: {resp: {type: Object}},
    components: {
      'hello-a': HelloA,
      'user-a': UserA,
      'app-a' : AppA
    },
    data () {
      // props d
      // 組件注冊引用命名規則，如有“-”在編譯時會忽略，并且將傳入的參數命名全部小寫
      // note: changing this line won't causes changes
      // with hot-reload because the reloaded component
      // preserves its current state and we are modifying
      // its initial state.
      return {
        msg: 'This  Header'
      }
    }
  }
</script>
<style scoped>
  h1 {
    color: #42b983;
  }
</style>


