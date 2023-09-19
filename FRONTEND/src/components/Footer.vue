<script setup lang="ts">
  import {
    MDBFooter,
    MDBContainer,
    MDBRow,
    MDBCol,
    MDBIcon
  } from 'mdb-vue-ui-kit';
</script>

<template>

    <div class="container-fluid mt-5">
  <!-- Footer -->
    <MDBFooter :text="['center', 'lg-start', 'muted']">
 
      <!-- Section: Links  -->
      <section class="">
        <MDBContainer class="text-center text-md-start pt-3">
          <!-- Grid row -->
          <MDBRow class="mt-3">
            <!-- Grid column -->
            <MDBCol md="3" lg="4" xl="3" class="mx-auto mb-4">
              <!-- Content -->
              <h6 class="text-uppercase fw-bold mb-4">
                <i class="fas fa-gem me-3"></i>Arbolicos s.a.
              </h6>
              <p>
               Decorate con naturaleza.
              </p>
            </MDBCol>
            <!-- Grid column -->
            <!-- Grid column -->
            <MDBCol md="2" lg="2" xl="2" class="mx-auto mb-4">
              <!-- Links -->
              <h6 class="text-uppercase fw-bold mb-4">Productos</h6>
              <p>
                <a href="#!" class="text-reset">Java</a>
              </p>
              <p>
                <a href="#!" class="text-reset">SpringBoot</a>
              </p>
              <p>
                <a href="#!" class="text-reset">Vue 3</a>
              </p>
            </MDBCol>
            <!-- Grid column -->
            <!-- Grid column -->
            <MDBCol md="3" lg="2" xl="2" class="mx-auto mb-4">
              <!-- Links -->
              <h6 class="text-uppercase fw-bold mb-4">Links</h6>
              <p>
                <a href="#!" class="text-reset">Preguntas frecuentes</a>
              </p>
              <p>
                <a href="#!" class="text-reset">Otras colecciones</a>
              </p>
              <p>
                <a href="#!" class="text-reset">Quienes somos</a>
              </p>
            </MDBCol>
            <!-- Grid column -->
            <!-- Grid column -->
            <MDBCol md="4" lg="3" xl="3" class="mx-auto mb-md-0 mb-4">
              <!-- Links -->
              <h6 class="text-uppercase fw-bold mb-4">Contact</h6>
              <p>
                <i class="fas fa-home me-3"></i> Gijón, ES
              </p>
              <p>
                <i class="fas fa-envelope me-3"></i>
                info@arbolicos.com
              </p>
              <p>
                <MDBIcon icon="phone" class="me-3" /> + 34 691 962 693
              </p>
            </MDBCol>
            <!-- Grid column -->
          </MDBRow>
          <!-- Grid row -->
        </MDBContainer>
      </section>
        <!-- Copyright -->
        <div
        class="text-center p-3"
        style="background-color: rgba(0, 0, 0, 0.2)">
        © 2020 Copyright: <span class="fw-bold">Arbolicos.es</span> 
     
      </div>
      <!-- Copyright -->
    
    </MDBFooter>
 

    </div>
  
</template>