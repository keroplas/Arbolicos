import axios from "axios";

const url = "http://localhost:8080/users";

class ApiConnection {
    async getAllUsers() {
        try {
            let response = await axios.get(url);
            return response.data;
        } catch(error) {
            throw error;
        }
    }

    async getUserById(id) {
        try {
            let response = await axios.get(`${url}/${id}`);
            return response.data;
        } catch (error) {
            throw error;
        }
    }

    async deleteUser(id) {
        try {
            let response = await axios.delete(`${url}/${id}`);
            return response.data;
        } catch (error) {
            throw error;
        }
    }

    async addUser(user) {
        try {
            let response = await axios.post(`${url}/save`, user);
            return response.data;
        } catch (error) {
            throw error;
        }
    }

    async updateUser(id, updatedUserData) {
        try {
          const response = await axios.put(`${url}/${id}`, updatedUserData);
          return response.data;
        } catch (error) {
          throw error;
        }
      }
}

export default new ApiConnection();