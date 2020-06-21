<template>
    <div></div>
</template>

<script>
    export default {
        name: "Results",


            // METHODS
            methods: {
                back_to_signup() {
                    this.$emit('change_comp', 'signup-form');
                }
            }

    }
</script>

<style scoped>

</style>