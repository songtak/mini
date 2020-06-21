<template>
    <div id="map" style="width:100%;height:350px;"></div>
</template>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=de9b38249478fabb18d7a62672968006"></script>
<script>
    export default {
        name: "Map",

        mounted() {this.initMap();
        },

        methods : {
            initMap() {
                let mapOption = {
                center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
                level: 3 // 지도의 확대 레벨
            };

                let map = new kakao.maps.Map(document.getElementById('map'), mapOption); // 지도를 생성합니다

                let markerPosition = new kakao.maps.LatLng(mapOption.center);

                let marker = new kakao.maps.Marker({
                    position: markerPosition
                });

                marker.setMap(map);},

        }
    }
</script>

<style scoped>

</style>

