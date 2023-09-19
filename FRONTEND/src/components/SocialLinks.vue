<script setup lang="ts">
  import {
    MDBFooter,
    MDBContainer,
    MDBRow,
    MDBCol,
    MDBBtn,
    MDBIcon
  } from 'mdb-vue-ui-kit';
</script>


<template>
    <MDBFooter :text="['center', 'white']">
      <!-- Grid container -->
      <MDBContainer class="">
        <!-- Section: Social media -->
        <section class="">
          <!-- Facebook -->
          <MDBBtn
            tag="a"
            color="primary"
            href="#!"
            floating
            style="background-color: #3b5998"
            class="m-1"
          >
            <MDBIcon iconStyle="fab" icon="facebook-f"></MDBIcon>
          </MDBBtn>
          <!-- Twitter -->
          <MDBBtn
            tag="a"
            color="primary"
            href="#!"
            floating
            style="background-color: #55acee"
            class="m-1"
          >
            <MDBIcon iconStyle="fab" icon="twitter"></MDBIcon>
          </MDBBtn>
          <!-- Google -->
          <MDBBtn
            tag="a"
            color="primary"
            href="#!"
            floating
            style="background-color: #dd4b39"
            class="m-1"
          >
            <MDBIcon iconStyle="fab" icon="google"></MDBIcon>
          </MDBBtn>
          <!-- Instagram -->
          <MDBBtn
            tag="a"
            color="primary"
            href="#!"
            floating
            style="background-color: #ac2bac"
            class="m-1"
          >
            <MDBIcon iconStyle="fab" icon="instagram"></MDBIcon>
          </MDBBtn>
          <!-- Linkedin -->
          <MDBBtn
            tag="a"
            color="primary"
            href="#!"
            floating
            style="background-color: #0082ca"
            class="m-1"
          >
            <MDBIcon iconStyle="fab" icon="linkedin-in"></MDBIcon>
          </MDBBtn>
          <!-- Github -->
          <MDBBtn
            tag="a"
            color="primary"
            href="#!"
            floating
            style="background-color: #333333"
            class="m-1"
          >
            <MDBIcon iconStyle="fab" icon="github"></MDBIcon>
          </MDBBtn>
        </section>
        <!-- Section: Social media -->
      </MDBContainer>
      <!-- Grid container -->
    
    </MDBFooter>
  </template>