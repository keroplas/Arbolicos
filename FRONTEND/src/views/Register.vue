<script setup lang="ts">
import {
  MDBInput,
  MDBTextarea,
  MDBBtn,
  MDBCol,
  MDBRow
} from "mdb-vue-ui-kit";

import { ref } from "vue";
import NavBar from "../components/NavBar.vue";
import ApiConnection from "../services/ApiConnection"

const username = ref("");
const direction = ref("");
const population = ref("");
const province = ref("");
const cp = ref("");
const email = ref("");
const phone = ref("");
const info = ref("");

async function addUser() {
  try {
    const userData = {
      username: username.value,
      direction: direction.value,
      population: population.value,
      province: province.value,
      cp: cp.value,
      email: email.value,
      phone: phone.value,
      info: info.value
    };

    const response = await ApiConnection.addUser(userData); 
      console.log(userData);
  } catch (error) {
      console.error("Error al agregar usuario:", error);
  }
}

</script>



<template>

    <NavBar />

 <div class="container ptExtra col-md-6">
    <form @submit="addUser">
     <MDBInput
          type="text"
          label="Nombre y apellidos"
          id="username"
          v-model="username"
          wrapperClass="mb-4"
        />
      <MDBInput
          type="text"
          label="Dirección de envío"
          id="direction"
          v-model="direction"
          wrapperClass="mb-4"
        />

    <MDBRow>
      <MDBCol>
        <MDBInput
          type="text"
          label="Población"
          id="population"
          v-model="population"
          wrapperClass="mb-4"
        />
      </MDBCol>
      <MDBCol>
        <MDBInput
          type="text"
          label="Provincia"
          id="province"
          v-model="province"
          wrapperClass="mb-4"
        />
      </MDBCol>
    </MDBRow>


    <MDBRow>
      <MDBCol>
        <MDBInput
        type="text"
      label="Código Postal"
      id="cp"
      v-model="cp"
      wrapperClass="mb-4"
        />
      </MDBCol>
      <MDBCol>
        <MDBInput
        type="email"
      label="Email"
      id="email"
      v-model="email"
      wrapperClass="mb-4"
        />
      </MDBCol>
    </MDBRow>
    

    <!-- Number input -->
    <MDBInput class="phone"
      type="tel"
      label="Teléfono"
      id="phone"
      v-model="phone"
      wrapperClass="mb-4"
    />

    <!-- Message input -->
    <MDBTextarea
      label="Información adicional"
      id="info"
      v-model="info"
      wrapperClass="mb-4"
    />


    <!-- Submit button -->
    <MDBBtn type="submit"  color="success" block class="mb-4">
      Enviar formulario
    </MDBBtn>
  </form>
 </div>
 

</template>

<style scoped>
.ptExtra{
    padding-top: 180px;
}

</style>