<template>
<div>
<head>
  <meta charset="UTF-8">
  <link href="https://cdn.jsdelivr.net/npm/font-awesome@4.x/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
  <main>
    <section class="glass">
      <div class="dashboard">
        <div>
          <a href="/">
            <img src="../assets/profile.jpg" alt="" style="border-radius:1000px; margin-top:10px; width:50%; height: 70%; border: 3px solid white;">
            <h3>Aymeric FISSELIER</h3>
            <p>Web & Software Development</p>
          </a>
        </div>
        <div class="links">
          <div class="spacer" style="height:70px"></div>
          <a href="education.html">
            <div class="link">
              <img src="../assets/education.png" width="40px" alt="">
              <h2>Education</h2>
            </div>
          </a>
          <a href="skills.html">
            <div class="link">
              <img src="../assets/skills.png" width="40px" alt="">
              <h2>Skills</h2>
            </div>
          </a>
          <a href="experience.html">
            <div class="link">
              <img src="../assets/experience.png" width="40px" alt="">
              <h2>Experience</h2>
            </div>
          </a>
          <a href="projects.html">
            <div class="link">
              <img src="../assets/projects.png" width="40px" alt="">
              <h2>Projects</h2>
            </div>
          </a>
        </div>
        <div class="social">
          <a href="https://www.instagram.com/aymbcn/">
            <i class="fa fa-instagram" aria-hidden="true"></i>
          </a>
          <a href="https://github.com/Reivax5">
            <i class="fa fa-github" aria-hidden="true"></i>
          </a>
          <a href="https://www.linkedin.com/in/aymeric-fisselier/">
            <i class="fa fa-linkedin" aria-hidden="true"></i>
          </a>
        </div>
      </div>
      <div class="carditems">
        <h1 class="hello">&lt;Hello World &#128075;&gt;</h1>
        <div class="spacer" style="height:50px">
        </div>
        <br>
        <p>I'm <strong>Aymeric Fisselier</strong>, a Software Development & IT Student from EPITECH <em>(Barcelona, Spain)</em>, currently in 1st-year <em>(2021-2026)</em>.</p>
        <br>
        <p>I’m a highly motivated 1st-year Epitech student from Barcelona with a growing interest in
        computer science, and new technologies. I am curious, engaged, dynamic, and eager to learn.
        I have worked on many projects since the beginning of my cursus, including web development, algorithms,
        graphical programming such as video games. I also have participated to volunteering activities like a Barcelona
        Hackathon. I'm always ready to learn new skills and start new adventures.</p>
        <p style="margin-top:50px" class="gradient-par">With my knowledge in programming, I'm looking for a 4-6 months internship in an IT department to start my career as a software engineer.</p>
        <br>
        <a href="https://www.canva.com/design/DAE46EOKdEM/view" target="_blank">
          <div class="glassbutton"> 
            <p>View my CV</p>
          </div>
        </a>
      </div>
    </section>
  </main>
</body>
</div>
</template>

<script>
  function rain() {
    let amount = 5;
    let body = document.querySelector("body");
    let i = 0;

    while (i < amount) {
      let drop = document.createElement("i");
      let size = Math.floor(Math.random() * (210 - 190 + 1) ) + 190;
      let posX = Math.floor(Math.random() * window.innerWidth);
      let delay =  Math.random() * -200;
      let duration = Math.floor(Math.random() * (30 - 29 + 1) ) + 29;

      drop.className = "rain";
      drop.style.width = 0.2 + size+'px';
      drop.style.left = posX+'px';
      drop.style.animationDelay = delay+'s';
      drop.style.animationDuration = 1 + duration+'s';
      body.appendChild(drop);
      i++
      let bodyRect = drop.getBoundingClientRect();
      console.log(bodyRect);
    }
  }

  rain();
</script>

<style scoped>

* {
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

h1 {
  color: #426696;
  font-weight: 600;
  font-size: 2.5rem;
  opacity: 0.8;
}
h2,
p {
  display: inline;
  vertical-align: middle;
  color: #658ec6;
  font-weight: 500;
  opacity: 0.8;
}

h3 {
  color: #426696;
  font-weight: 600;
  font-size: 20px;
  opacity: 0.8;
}
a {
  flex: 0;
  outline: 0;
  text-decoration: none;
}
main {
  font-family: "Poppins", sans-serif;
  min-height: 100vh;
  background-color: #C2DED1;
  display: flex;
  align-items: center;
  justify-content: center;
}
.glassbutton {
  display: flex;
  justify-content: flex-end;
  margin-top: 50px;
}
.glassbutton p {
  color: #1db69a;
  font-weight: 600;
  display: inline-block;
  clear: both;
  background: linear-gradient(
    to left bottom,
    rgba(255, 255, 255, 0.8),
    rgba(255, 255, 255, 0.3)
  );
  border-radius: 1rem;
  padding: 1rem;
}
.link:hover
{
  background-color: white;
  border-radius: 20px;
  transition: .5s;
}
.glass {
  background: white;
  margin: 51px;
  width: 75%;
  background: linear-gradient(
    to right bottom,
    rgba(255, 255, 255, 0.1),
    rgba(255, 255, 255, 0.2)
  );
  box-shadow: 10px 10px 30px rgba(0, 0, 0, 0.5);
  border-radius: 2rem;
  z-index: 2;
  backdrop-filter: blur(2rem);
  display: flex;
}

.dashboard {
  flex: 0;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: space-evenly;
  text-align: center;
  background: linear-gradient (
    to right bottom,
    rgba(255, 255, 255, 0.1),
    rgba(0, 0, 0, 0.1)
  );
  box-shadow: 10px 10px 30px rgba(0, 0, 0, 0.5);
  border-radius: 2rem;
}
.link {
  display: flex;
  margin: 1rem 0rem;
  padding: 1rem 3rem;
  align-items: center;
}
.link h2 {
  padding: 0rem 2rem;
}
.social {
  display: flex;
  align-items: center;
  justify-content: center;
  margin-top: auto;
  position: relative;
  left: 15px;
  padding: 20px;
  font-size: 20px;
  text-align: center;
  text-decoration: none;
}

.social i
{
  color: #1db69a;
  margin-right: 30px;
  font-size: 1.5em;
}

.carditems {
  flex: 2;
}

/* CARD Items */
.carditems {
  margin: 5rem;
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
}

.card {
  display: flex;
  background: linear-gradient(
    to right bottom,
    rgba(255, 255, 255, 0.8),
    rgba(15, 15, 15, 0.5)
  );
  border: 3px solid rgba(255, 132, 101, 0.3);
  border-radius: 1rem;
  margin: 2rem 0rem;
  padding: 1.2rem;
  box-shadow: 6px 6px 20px rgba(122, 122, 122, 0.212);
  justify-content: space-between;
}
.card img {
  top: 0;
  bottom: 0;
  margin: auto;
  width: 110px;
}
.card-info {
  margin-left: 20px;
  margin-right: 20px;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}
.percentage {
  font-weight: bold;
  font-size: 18px;
  background: linear-gradient(to right top, #65dfc9, #6cdbeb);
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
}
.gradient-par {
  font-weight: bold;
  background: linear-gradient(to right, #216bcc, #1db69a);
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
}

.hello
{
  font-size: 50px;
  color: #fff;
  text-shadow:
    0 0 7px #216bcc,
    0 0 82px #6cdbeb,
    0 0 92px #6cdbeb,
    0 0 102px #6cdbeb,
    0 0 151px #6cdbeb;
}

i .rain
{
  position: absolute;
  height: 200px;
  border-radius: 50%;
  animation: animate 10s linear infinite;
  z-index: 5;
}

i .rain:nth-child(3n+1)
{
  background: red;
  opacity: 0.4;
}

i .rain:nth-child(3n+2)
{
  background: green;
  opacity: 0.4;
}

i .rain:nth-child(3n+3)
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