<template>
    <div>
        <v-btn class="email" @click="contact" depressed center>
            <v-icon center>mdi-email</v-icon>
            <span>email me</span>
        </v-btn>
        <v-btn
            id="save"
            type="submit"
            v-bind:class="{ 'btn-danger': clicked, 'btn-primary': !clicked }"
            class="btn my-2"
            v-on:click="added" 
        >
        {{ clicked ? "Added" : "Add to Email List" }}
        </v-btn>
    </div>
</template>

<script>
  export default {
    data: () => ({
      clicked: false
    }),
    methods: {
      contact () {
        if (this.clicked == false)
          this.clicked = true;
        else
          this.clicked = false;
        window.open("https://www.gmail.com");
      },
      added() {
        if (this.clicked == false)
          this.clicked = true;
        else
          this.clicked = false;
      }
    },
  };
</script>
