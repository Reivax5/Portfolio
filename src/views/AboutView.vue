<template>
  <div>
    <nav>
      <v-toolbar flat app color="grey lighten-1">
        <v-app-bar-nav-icon class="black--text" @click="drawer = !drawer"></v-app-bar-nav-icon>
        <v-toolbar-title class="text-uppercase">
          <span class="font-weight-light" color="black">Todo</span>
          <span class="font-weight-bold" color="black">Ninja</span>
        </v-toolbar-title>
        <v-spacer></v-spacer>
        <v-btn flat color="grey">
          <span>Sign out</span>
          <v-icon right>mdi-exit-to-app</v-icon>
        </v-btn>
      </v-toolbar>
      <v-navigation-drawer v-model="drawer" app class="indigo">
        <p>test</p>
      </v-navigation-drawer>
    </nav>
    <v-card max-width="500" class="mx-auto">
      <v-toolbar :color="selection.length ? 'grey darken-4' : 'deep-purple accent-4'" dark>
        <v-app-bar-nav-icon v-if="!selection.length"></v-app-bar-nav-icon>
        <v-btn v-else icon @click="selection = []">
          <v-icon>mdi-close</v-icon>
        </v-btn>
        <v-toolbar-title>
          {{ selection.length ? `${selection.length} selected` : 'Photos' }}
        </v-toolbar-title>
        <v-spacer></v-spacer>
        <v-scale-transition>
          <v-btn v-if="selection.length" key="export" icon>
            <v-icon>mdi-export-variant</v-icon>
          </v-btn>
        </v-scale-transition>
        <v-scale-transition>
          <v-btn v-if="selection.length" key="delete" icon>
            <v-icon>mdi-delete</v-icon>
          </v-btn>
        </v-scale-transition>
        <v-btn icon>
          <v-icon>mdi-dots-vertical</v-icon>
        </v-btn>
      </v-toolbar>
      <v-card-text>
        <v-select v-model="selection" :items="items" multiple label="Select an option"></v-select>
      </v-card-text>
    </v-card>
  </div>
</template>

<script>

  export default {
    data () {
      return {
        selection: [],
        items: ['Foo', 'Bar', 'Fizz', 'Buzz'],
        drawer: false,
      }
    },
  }

</script>