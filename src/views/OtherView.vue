<template>
  <v-app>
  <body>
    <div class="container">
      <a href="purchase">
        <span>Purchase</span>
      </a>
      <a href="about">
        <span class="about">About</span>
      </a>
    </div>
  </body>
  </v-app>
</template>

<script>
  export default {
  }
</script>

<style>
@import url('https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800,900&display=swap');

*
{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Poppins', sans-serif;
}

.home
{
  display: flex;
  vertical-align: center;
  justify-content: center;
  align-items: center;
  flex-wrap: wrap;
}

.container
{
  display: flex;
  justify-content: center;
  vertical-align: center;
  align-items: center;
  flex-wrap: wrap;
  min-height: 200px;
  padding-top: 400px;
}

.container a
{
  position: relative;
  display: inline-block;
  width: 200px;
  margin: 40px;
  padding: 15px 30px;
  border: 2px solid #0f0;
  text-transform: uppercase;
  font-weight: 600;
  text-decoration: none;
  letter-spacing: 2px;
  color: #fff;
  -webkit-box-reflect: below 10px linear-gradient(transparent, #0002);
  transition: .5s;
  transition-delay: 0s;
}

.container a:hover
{
  transition-delay: 1.5s;
  color: black;
  box-shadow: 0 0 10px #0f0,
              0 0 20px #0f0,
              0 0 40px #0f0,
              0 0 80px #0f0,
              0 0 160px #0f0;
}

.container a:nth-child(2)
{
  filter: hue-rotate(90deg);
}

.container a span
{
  background-color: transparent;
  position: relative;
  z-index: 100;
}

.container a::before
{
  content: "";
  position: absolute;
  left: -20px;
  top: 50%;
  transform: translateY(-50%);
  width: 20px;
  height: 2px;
  background: #0f0;
  box-shadow: 5px -8px 0 #0f0,
              5px 8px 0 #0f0;
  transition: width 0.5s, left 0.5s, height 0.5s,
  box-shadow 0.5s;
  transition-delay: 1s, .5s, 0s, 0s;
}

.container a:hover::before
{
  width: 60%;
  height: 100%;
  left: -2px;
  text-shadow: none;
  box-shadow: 5px 0 0 #0f0,
              5px 0 0 #0f0;
  transition-delay: 0s, .5s, 1s, 1s;
}

.container a::after
{
  content: "";
  position: absolute;
  right: -20px;
  top: 50%;
  transform: translateY(-50%);
  width: 20px;
  height: 2px;
  background: #0f0;
  box-shadow: -5px -8px 0 #0f0,
              -5px 8px 0 #0f0;
  transition: width 0.5s, right 0.5s, height 0.5s,
  box-shadow 0.5s;
  transition-delay: 1s, .5s, 0s, 0s;
}

.container a:hover::after
{
  width: 60%;
  height: 100%;
  right: -2px;
  text-shadow: none;
  box-shadow: -5px 0 0 #0f0,
              -5px 0 0 #0f0;
  transition-delay: 0s, .5s, 1s, 1s;
}

.title
{
  font-size: 150%;
  font-weight: bold;
  text-transform: uppercase;
  color: white;
}

</style>
