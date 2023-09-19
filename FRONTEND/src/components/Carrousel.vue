<script setup>
  import { ref } from "vue";
  import { MDBCarousel } from "mdb-vue-ui-kit";

  const items4 = [
    {
      src: "https://i.imgur.com/XOhiiWi.png",
      alt: "..."
    },
    {
      src: "https://i.imgur.com/IHvMonV.png",
      alt: "..."
    },
    {
      src: "https://i.imgur.com/E7e6SQ4.png",
      alt: "..."
    },
    {
      src: "https://i.imgur.com/Ox2qSgl.png",
      alt: "..."
    }
  ];
  const carousel4 = ref(0);

</script>



<template>

    <div class="container mt-5 extra">
        <MDBCarousel 
        v-model="carousel4"
        :items="items4"
        class="fixed-height-carousel"
        />
    </div>

</template>

<style scoped>
  .extra {
    padding-top: 100px;
  }

  
</style> 