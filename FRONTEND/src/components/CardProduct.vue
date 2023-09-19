<script setup>
    import { MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardLink, MDBCardImg, MDBCardGroup } from "mdb-vue-ui-kit";   

    defineProps({
      image: String,
      title: String,
      text: {
        type: String,
        default: "Sin descripción",
      } 
      });

</script>

<template>

    <!-- <div class="prueba"> -->
      <!-- <div class=""> -->
        <MDBCard style="width: 100%">
          <MDBCardImg top :src="image" alt="..."/>
          <!-- <MDBCardBody>         
            <MDBCardLink href="#">Añadir al carrito</MDBCardLink>
          </MDBCardBody> -->
        </MDBCard>
      <!-- </div> -->
  
    <!-- </div> -->
 
 


</template>


<style scoped>


</style>