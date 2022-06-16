<template>
  <body>
    <h1>hello</h1>
  </body>
</template>

<script>
function rain() {
    let amount = 15;
    let body = document.querySelector("body");
    let i = 0;

    while (i < amount) {
      let drop = document.createElement("i");
      let size = Math.floor(Math.random() * (210 - 190 + 1) ) + 190;
      let posX = Math.floor(Math.random() * window.innerWidth);
      let delay =  Math.random() * -200;
      let duration = Math.floor(Math.random() * (30 - 29 + 1) ) + 29;

      drop.style.width = 0.2 + size+'px';
      drop.style.left = posX+'px';
      drop.style.animationDelay = delay+'s';
      drop.style.animationDuration = 1 + duration+'s';
      body.appendChild(drop);
      i++
    }
  }

  rain();
</script>

<style>
*
{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body
{
  background: #C2DED1;
  overflow: hidden;
  height: 100vh;
}

i
{
  position: absolute;
  height: 200px;
  border-radius: 50%;
  animation: animate 10s linear infinite;
}

i:nth-child(3n+1)
{
  background: red;
  opacity: 0.4;
}

i:nth-child(3n+2)
{
  background: green;
  opacity: 0.4;
}

i:nth-child(3n+3)
{
  background: blue;
  opacity: 0.4;
}

@keyframes animate
{
  0% { transform: translateY(-400px);}
  100% { transform: translateY(1000px);}
}

</style>