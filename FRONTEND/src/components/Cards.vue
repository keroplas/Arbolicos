<script setup>
    import { MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardLink, MDBCardImg, MDBCardGroup } from "mdb-vue-ui-kit";   

    defineProps({
      image: String,
      title: String,
      linkUrl: String,
      text: {
        type: String,
        default: "Sin descripción",
      } 
      });

</script>

<template>

    <!-- <div class="prueba"> -->
      <!-- <div class=""> -->
        <MDBCard style="width: 100%" class="border border-2 border-dark">
          <MDBCardImg top :src="image" alt="..."/>
          <MDBCardBody>
            <MDBCardTitle>{{ title }}</MDBCardTitle>
            <MDBCardText> {{ text }} </MDBCardText>
          </MDBCardBody>
          <MDBCardBody>
            <MDBCardLink :href="linkUrl">Entrar pagina</MDBCardLink>
            <MDBCardLink href="#">Añadir carrito</MDBCardLink>
          </MDBCardBody>
        </MDBCard>
      <!-- </div> -->
  
    <!-- </div> -->
 
 


</template>


<style scoped>
.flesi{
  display:flex;
  align-items: center;
  justify-content: space-around;
  flex-wrap: nowrap;
}

.carta {
  display:flex;
  align-items: center;
  justify-content: space-around;
}

.textProp{
  font-family: 'Irish Grover', cursive;
}
</style>