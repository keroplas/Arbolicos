<script setup>
    import NavBar from '../components/NavBar.vue';

    import { MDBCardBody,MDBCardLink,MDBCardTitle,MDBCardText } from 'mdb-vue-ui-kit';
    import CardProduct from '../components/CardProduct.vue'
    import { ref } from 'vue';

const dataCards = ref([
 
  {id: 3,image: "https://i.imgur.com/DB1rP8A.png", title: "cedroRoble", text: ""},
  {id: 4,image: "https://i.imgur.com/E8d6pvF.png", title: "cedroVarias", text: ""},
  {id: 5,image: "https://i.imgur.com/0OhuS4j.png", title: "corazon", text: ""},
  {id: 6,image: "https://i.imgur.com/TJNPRtZ.jpg", title: "hhh", text: ""},
  {id: 7,image: "https://i.imgur.com/uwBV6YH.png", title: "otraRoble", text: ""},
  {id: 8,image: "https://i.imgur.com/TJNPRtZ.jpg", title: "tilo", text: ""},
 
])

</script>

<template>

    <div class="background-image"> 
        <NavBar /> 

        <div class="container marginExtra">
            <h2 class="text-center nameProduct pt-5 text-dark">Ginko Biloba</h2>
            <div class="row">
                <div class="col-xl-8">
                    <div class="container text-center boxColor">
                        <div class="row"> 
                            <div v-for="card in dataCards" class=" col-lg-4 col-md-6 mt-5 image cards">
                                <CardProduct                               
                                :key="card.id"
                                :image="card.image"                              
                                />
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-xl-4 cards">
                    <div class="container text-center d-flex flex-column">
                        <div class="cards">
                            <img src="../assets/images/ginko.png"  alt="">
                        </div>
                        <div class="price">
                            <MDBCard>
                                <MDBCardBody>
                                    <MDBCardTitle class="size">Precio de venta</MDBCardTitle>
                                    <MDBCardText>10€</MDBCardText>
                                </MDBCardBody>
                                <MDBCardBody>         
                                    <MDBCardLink href="#">Añadir al carrito</MDBCardLink>
                                </MDBCardBody> 
                            </MDBCard>                          
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div
            class="text-center  p-4 mt-5 slink">© 2020 Copyright: <span class="fw-bold">Arbolicos.es</span> 
        </div>

    </div>
  
</template>


<style scoped>
.background-image {
    height: auto;
  background-image: url('../assets/images/fondo_17.png');
  background-size:auto; 
  background-position: center;
  
}
.marginExtra {
    margin-top: 70px;
}

.price{
  
    margin-top: 35px;
    background-color: rgba(254, 254, 254, 0.694);
    /* min-height: 10em;
    min-width: 24em; */
    padding: 2em; 
    font-family: 'Irish Grover', cursive;
    font-size: 25px;
    border: 1px solid black;
}

.size{
    font-size: 40px;
}


.slink{
    background-color: rgba(0, 0, 0, 0.2)
}

.nameProduct{

    font-family: 'Irish Grover', cursive;
    font-size: 70px;
}

.boxColor{
    background-color: rgba(255, 255, 255, 0);
}

.cards:hover{
    transition: all 0.3s;
    transform: scale(1.15);
}
</style>