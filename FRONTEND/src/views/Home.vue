<script setup lang="ts">
import HelloWorld from "../components/HelloWorld.vue";
import NavBar from "../components/NavBar.vue";
import Cards from "../components/Cards.vue";
import Carrousel from "../components/Carrousel.vue";
import Footer from "../components/Footer.vue"
import SocialLinks from "../components/SocialLinks.vue";

import { ref } from 'vue';

const dataCards = ref([
  {id: 1,image: "https://i.imgur.com/TJNPRtZ.jpg", title: "Ginkgo biloba", linkUrl: "#/ginko", text: ""},
  {id: 2,image: "https://i.imgur.com/srAxZW9.jpg", title: "Monstera deliciosa", text: ""},
  {id: 3,image: "https://i.imgur.com/yeWLwo7.jpg", title: "Carballo", linkUrl: "#/roble", text: ""},
  {id: 4,image: "https://i.imgur.com/r1mxNpd.jpg", title: "Haya", text: ""},
  {id: 5,image: "https://i.imgur.com/dHHcypU.jpg", title: "Arce", text: ""},
  {id: 6,image: "https://i.imgur.com/WGVX7C7.jpg", title: "Castaño", text: ""},
  {id: 7,image: "https://i.imgur.com/VPfSeqd.jpg", title: "Hiedra", text: ""},
  {id: 8,image: "https://i.imgur.com/recykB1.jpg", title: "Tilo", text: ""},
  {id: 9,image: "https://i.imgur.com/Jar6gku.jpg?1", title: "Roble y bellota", text: ""}
])


</script>


<template>
  <div class="background-image">
      <NavBar />
  <Carrousel />
  
  <div class="container text-center letter">
    <div class="row "> 
      <div v-for="card in dataCards" class="col-sm-12 col-md-6 col-lg-4 mt-5 text-dark">
        <Cards 
          
          :key="card.id"
          :image="card.image"
          :title="card.title"
          :text="card.text"  
          :linkUrl="card.linkUrl"
        />
      </div>
    </div>
  </div>
  
  
  <Footer></Footer>
  <SocialLinks />
  </div>

  

 
</template>

<style scope>

  .background-image {
      height: 100%;
    background-image: url('../assets/images/fondo_17.png'); /* Cambia esto a la ruta real de tu imagen */
    background-size:auto; /* Ajustar el tamaño de la imagen al contenedor */
    background-position: center; /* Centrar la imagen */
   background-repeat: repeat;
  }

  .opacidad{
    opacity: 0.3;
  }

.letter{
  font-family: 'Irish Grover', cursive;
/* font-family: 'Tilt Prism', cursive; */
}




</style>


