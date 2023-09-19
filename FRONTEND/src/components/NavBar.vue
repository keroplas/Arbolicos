<script setup lang="ts">
  import {
    MDBBtn,
    MDBNavbar,
    MDBNavbarToggler,
    MDBNavbarBrand,
    MDBNavbarNav,
    MDBNavbarItem,
    MDBCollapse,
    MDBDropdown,
    MDBDropdownToggle,
    MDBDropdownMenu,
    MDBDropdownItem,
    MDBIcon
  } from 'mdb-vue-ui-kit';
  import { ref } from 'vue';

  const collapse1 = ref(false);
  const dropdown1 = ref(false);
</script>



<template>
    <MDBNavbar expand="lg" light bg="light" container class="fixed-top scrolling-navbar">
        <img src="../assets/images/arbolicos_logo.svg" class="img-container" alt="">
      <MDBNavbarToggler
        @click="collapse1 = !collapse1"
        target="#navbarSupportedContent"
      ></MDBNavbarToggler>
      <MDBCollapse v-model="collapse1" id="navbarSupportedContent">
  
        <MDBNavbarNav class="mb-2 mb-lg-0">
          <MDBNavbarItem to="/" active class="mx-4"> 
          </MDBNavbarItem>

          <MDBNavbarItem>
            <MDBDropdown class="nav-item mx-4" v-model="dropdown1">
              <MDBDropdownToggle 
                tag="a"
                class="nav-link"
                @click="dropdown1 = !dropdown1"
                >Administración
              </MDBDropdownToggle>
              <MDBDropdownMenu aria-labelledby="dropdownMenuButton">
                <MDBDropdownItem href="#/client">Clientes</MDBDropdownItem>
              </MDBDropdownMenu>
            </MDBDropdown>
          </MDBNavbarItem>
         
        </MDBNavbarNav>  
        <a href="/">
          <MDBIcon icon="fas fa-home text-success mx-5" size="2x" />
          </a> 
        <a href="#/register">
          <MDBIcon icon="fas fa-sign-in-alt text-success" size="2x" />
        </a>   
        <a href="#">
          <MDBIcon icon="cart-arrow-down mx-5 text-success" size="2x" />
        </a>
      </MDBCollapse>

      
      
    </MDBNavbar>
  </template>

  <style scope>
    .img-container{
        height: 60px;
    }

    .icon{
      width:50px;
    }
  </style>
