<template>
    <div id="app">
        <nav class="main-nav">
            <div class="logo">
                my.company
            </div>
            <div class="right">
                <Burger></Burger>
            </div>

            <div>
                <i class="fas fa-bars fa-spin" />
            </div>
        </nav>

        <Sidebar>
            <div class="sidebar">
                <a href="#home"><i class="fas fa-check-square"></i>Home</a>
            </div>
        </Sidebar>
    </div>
</template>

<script>
import Burger from './components/menu/Burger.vue';
import Sidebar from './components/menu/Sidebar.vue';

export default {
    name: 'app',
    components: {
        Burger,
        Sidebar
    }
}
</script>

<style>
    html {
        height: 100%;
        overflow:hidden;
    }

    body {
        border: 0; margin: 0; padding: 0;
        font-family: 'Lato';
        height: 100%;
        background: rgb(101,31,87);
        background: linear-gradient(45deg, rgba(101,31,87,1) 0%, rgba(225,113,87,1) 48%, rgba(249,248,113,1) 100%);
    }

    .right {
        width: 100px;
        float: right
    }

    .logo {
        align-self: center;
        color: #fff;
        font-weight: bold;
        font-family: 'Lato';
    }

    .main-nav {
        display: flex;
        justify-content: space-between;
        padding: 0.5rem 0.8rem;
    }

    ul.sidebar-panel-nav {
        list-style-type: none;
    }

    ul.sidebar-panel-nav > li > a {
        color: #fff;
        text-decoration: none;
        font-size: 1.5rem;
        display: block;
        padding-bottom: 0.5em;
    }
</style>