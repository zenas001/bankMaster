<template>
  <div>
    <div>this is template User component</div>
    <p>{{msg}}</p>
  </div>
</template>
<style>
  body {
    background-color: #f3e6ff;
  }
</style>
<script>
  export default {
    name: 'User',
    data () {
      // 函數後面注意空格，注釋後面 // 要有空格
      return {
        msg: 'Welcome to Vue world User'
      }
    }
  }
</script>
