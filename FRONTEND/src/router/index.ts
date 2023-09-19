import { createRouter, createWebHashHistory } from "vue-router";

const routes = [
  {
    path: "/",
    name: "home",
    component: () => import("../views/Home.vue")
  },
  {
      path: "/ginko",
      name: "ginko",
      component: () => import("../views/Ginko.vue"),
    },
    {
      path: "/roble",
      name: "roble",
      component: () => import("../views/Roble.vue"),
    },
    {
      path: "/register",
      name: "register",
      component: () => import("../views/Register.vue")
    },
    {
      path: "/client",
      name: "client",
      component: () => import("../views/ClientTable.vue")
    }
];

const router = createRouter({
  history: createWebHashHistory(),
  routes,
});

export default router;
