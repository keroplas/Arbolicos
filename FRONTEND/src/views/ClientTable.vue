<script setup>
    import { ref, onBeforeMount } from 'vue';
    import ApiConnection from "../services/ApiConnection"

    import NavBar from '../components/NavBar.vue';
   
    const users = ref([]);
   

    const getUsers = async () => {
      try {
        const response = await ApiConnection.getAllUsers();
        users.value = response;

      } catch (error) {
        console.error("Error al obtener usuarios:", error);
      } 
      
      };
    
   onBeforeMount(getUsers);
 


</script>

<template>

    <NavBar/>
    <div class="container  my-5 py-5">
        <table class="table table-striped table-hover">
            <thead>
                <tr>
                <th scope="col">Id</th>
                <th scope="col">Nombre y apellidos</th>
                <th scope="col">Dirección de envío</th>
                <th scope="col">Población</th>
                <th scope="col">Provincia</th>
                <th scope="col">Código Postal</th>
                <th scope="col">Email</th>
                <th scope="col">Teléfono</th>
                <th scope="col">Información adicional</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="user in users" :key="user.id">
                <th scope="row">{{ user.id }}</th>
                <td>{{ user.username }}</td>
                <td>{{ user.direction }}</td>
                <td>{{ user.population }}</td>
                <td>{{ user.province }}</td>
                <td>{{ user.cp }}</td>
                <td>{{ user.email }}</td>
                <td>{{ user.phone }}</td>
                <td>{{ user.info }}</td>
                </tr>
            </tbody> 
        </table> 
    </div>
   
</template>

