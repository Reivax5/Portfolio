<template>
<div>
<head>
  <link href="https://cdn.jsdelivr.net/npm/font-awesome@4.x/css/font-awesome.min.css" rel="stylesheet">
</head>
  <body>
    <ul>
  <li>
    <a href="https://www.linkedin.com/in/aymeric-fisselier/">
      <i class="fa fa-linkedin"></i>
      <span> Linkedin</span>
    </a>
  </li>
  <li>
    <a href="https://github.com/Reivax5">
      <i class="fa fa-github" aria-hidden="true"></i>
      <span> Github</span>
    </a>
  </li>
  <li>
    <a href="https://www.instagram.com/aymbcn/">
      <i class="fa fa-instagram" aria-hidden="true"></i>
      <span> Instagram</span>
    </a>
  </li>   
  </ul>
    <v-row>
      <v-col cols="12">
        <h1 id="title">My Projects</h1>
      </v-col>
    <v-col cols="12">
    <div class="container">
      <div v-tilt="{scale: 1.2}" class="card">
        <div class="content">
          <h2>01</h2>
          <h3>BSQ</h3>
          <p>Your algorithm must find the largest possible square on a board as quickly as possible while avoiding obstacles.</p>
          <a href="#">Learn More</a>
        </div>
      </div>
      <div v-tilt="{scale: 1.2}" class="card">
        <div class="content">
          <h2>02</h2>
          <h3>EpyTodo</h3>
          <p>The project idea is to build a Todo List. It is mainly focused on the backend part, which was developed using Node.JS</p>
          <a href="#">Learn More</a>
        </div>
      </div>
      <div v-tilt="{scale: 1.2}" class="card">
        <div class="content">
          <h2>03</h2>
          <h3>My RPG</h3>
          <p></p>
          <a href="#">Learn More</a>
        </div>
      </div>
    </div>
    </v-col>
    </v-row>
    <div class="blob">
      <svg xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 310 350">
        <path d="M156.4,339.5c31.8-2.5,59.4-26.8,80.2-48.5c28.3-29.5,40.5-47,56.1-85.1c14-34.3,20.7-75.6,2.3-111  c-18.1-34.8-55.7-58-90.4-72.3c-11.7-4.8-24.1-8.8-36.8-11.5l-0.9-0.9l-0.6,0.6c-27.7-5.8-56.6-6-82.4,3c-38.8,13.6-64,48.8-66.8,90.3c-3,43.9,17.8,88.3,33.7,128.8c5.3,13.5,10.4,27.1,14.9,40.9C77.5,309.9,111,343,156.4,339.5z"/>
      </svg>
    </div>
  </body>
  </div>
</template>

<script>

export default {
  components: {
  },

  data() {
    return {
      options: {

scale: 1, // 2 = 200%, 1.5 = 150%, etc..
}
    }
  }
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

body
{
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  background-color: #C2DED1;
  width: 100vw;
  height: 100vh;
  overflow: hidden;
  position: relative;
}

ul {
  position:absolute;
  top:7%;
  left:87%;
  transform:translate(-50%, -50%);
  display:flex;
  margin:0;
  z-index: 3;
  padding:0;
}

ul li {
  list-style:none;
  margin:0 5px;
}

ul li a .fa {
  position: absolute;
  left: 10px;
  bottom: 5px;
  font-size: 10px;
  color: #262626;
  transition: .5s;
  padding-right: 14px;
}

ul li a span {
  padding:0;
  margin:0;
  position:absolute;
  font-size: 9px;
  top: 4px;
  left: 28px;
  color: #262626;
  letter-spacing: 1px;
  transition: .5s;
}

ul li a {
  text-decoration: none;
  display: absolute;
  display: block;
  width:90px;
  height:20px;
  background: #fff;
  text-align:left;
  padding-left: 20px;
  transform: rotate(-30deg) skew(25deg) translate(0,0);
  transition:.5s;
  box-shadow: -20px 20px 10px rgba(0,0,0,.5);
}
ul li a:before {
  content: '';
  position: absolute;
  top:10px;
  left:-20px;
  height:100%;
  width:20px;
  background: #b1b1b1;
  transform: .5s;
  transform: rotate(0deg) skewY(-45deg);
}

ul li a:after {
  content: '';
  position: absolute;
  bottom:-20px;
  left:-10px;
  height:20px;
  width:100%;
  background: #b1b1b1;
  transform: .5s;
  transform: rotate(0deg) skewX(-45deg);
}

ul li a:hover {
  transform: rotate(-30deg) skew(25deg) translate(20px,-15px);
  box-shadow: -50px 50px 50px rgba(0,0,0,.5);
}

ul li:hover .fa {
  color:#fff;
}

ul li:hover span {
  color:#fff;
}

ul li:hover:nth-child(1) a{
  background: #3b5998;
}
ul li:hover:nth-child(1) a:before{
  background: #365492;
}
ul li:hover:nth-child(1) a:after{
  background: #4a69ad;
}

ul li:hover:nth-child(2) a{
  background: #00aced;
}
ul li:hover:nth-child(2) a:before{
  background: #097aa5;
}
ul li:hover:nth-child(2) a:after{
  background: #53b9e0;
}

ul li:hover:nth-child(3) a{
  background: #dd4b39;
}
ul li:hover:nth-child(3) a:before{
  background: #b33a2b;
}
ul li:hover:nth-child(3) a:after{
  background: #e66a5a;
}

ul li:hover:nth-child(4) a{
  background: #e4405f;
}
ul li:hover:nth-child(4) a:before{
  background: #d81c3f;
}
ul li:hover:nth-child(4) a:after{
  background: #e46880;
}

.container
{
  position: relative;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-wrap: wrap;
  max-width: 1200px;
  z-index: 1;
}

.container .card
{
  position: relative;
  width: 280px;
  height: 400px;
  margin: 30px;
  box-shadow: 20px 20px 50px rgba(0, 0, 0, 0.5);
  border-radius: 15px;
  background: rgba(255, 255, 255, 0.1);
  overflow: hidden;
  display: flex;
  justify-content: center;
  align-items: center;
  border-top: 1px solid rgba(255, 255, 255, 0.1);
}

.container .card:hover
{
  box-shadow: 0 0 .2rem #fff,
          0 0 .2rem #fff,
          0 0 1rem #ECE5C7,
          0 0 0.8rem #ECE5C7,
          0 0 2.8rem #ECE5C7,
          inset 0 0 1.3rem #ECE5C7; 
}

.blob {
  position: absolute;
  top: 0;
  left: 0;
  fill: #ECE5C7;
  width: 50vmax;
  animation: move 30s ease-in-out infinite;
  transform-origin: 50% 50%;
}

#title
{
  position: relative;
  font-size: 100px;
  z-index: 1;
}

@keyframes move {
  0%   { transform: scale(1)   translate(10px, -30px); }
  38%  { transform: scale(0.8, 1) translate(80vw, 30vh) rotate(160deg); }
  40%  { transform: scale(0.8, 1) translate(80vw, 30vh) rotate(160deg); }
  78%  { transform: scale(1.3) translate(0vw, 50vh) rotate(-20deg); }
  80%  { transform: scale(1.3) translate(0vw, 50vh) rotate(-20deg); }
  100% { transform: scale(1)   translate(10px, -30px); }
}

.container .card .content p
{
  position: relative;
  top: -30px;
  width: 220px;
}

.container .card .content h3
{
  margin-bottom: 50px;
}

.container .card .content a
{
  position: absolute;
  bottom: 50px;
  left: 75px;
  display: inline-block;
  color: #354259;
  border: 3px solid white;
  border-radius: 30px;
  margin-top: 15px;
  padding: 8px 20px;
  background-color: white;
  -webkit-box-reflect: below 1px linear-gradient(transparent, rgba(0, 0, 0, 0.2));
  transition: .5s;
}


.container .card .content a:hover
{
  transition: .5s;
  border: 3px solid #9A86A4;
  background-color: #9A86A4;
}

.container .card .content h2
{
  position: absolute;
  top: -20px;
  right: 10px;
  font-size: 6em;
  opacity: 0.5;
}

</style>