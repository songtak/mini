<template>
    <div>
        <div class="top">

        </div>

        <!--detail scope-->
        <table style="margin: 0 auto; width: 850px; height: 500px">
            <tr>
                <td style="padding-left: 20px; font-size: 45px; font-weight: bold; vertical-align: top" height="45px">
                    {{ item2.roadName}}
                </td>
            </tr>

            <tr>
                <td style="padding-left: 20px; font-size: 18px" height="18px">
                    <tr><span style="padding-right: 10px; border-right : 1px solid #E4e4e4">등록일 : <span style="color:#FF382E">{{ item2.updateDate }}</span></span>
                    <tr><span style="padding-left : 10px">설명 : {{ item2.roadDescription }}</span></tr>
                    <tr><span style="padding-left : 10px">km : {{ item2.km }}</span></tr>
                    <tr><span style="padding-left : 10px">소요시간 : {{ item2.required }}</span></tr>
                    <tr><span style="padding-left : 10px">시작점 : {{ item2.startPoint }}</span></tr>
                    <tr><span style="padding-left : 10px">시작점 주소(도로명) : {{ item2.startNewAdress }}</span></tr>
                    <tr><span style="padding-left : 10px">시작점 주소(지번) : {{ item2.startOldAdress }}</span></tr>
                    <tr><span style="padding-left : 10px">도착점 : {{ item2.endPoint }}</span></tr>
                    <tr><span style="padding-left : 10px">도착점 주소(도로명) : {{ item2.endNewAdress }}</span></tr>
                    <tr><span style="padding-left : 10px">도착점 주소(지번) : {{ item2.endOldAdress }}</span></tr>
                    <tr><span style="padding-left : 10px">코스 : {{ item2.course }}</span></tr>
                    <tr><span style="padding-left : 10px">관리처  {{ item2.management }}</span></tr>
                    <tr><span style="padding-left : 10px">관리처 전화번호 : {{ item2.managementNumber }}</span></tr>
                    <tr><span style="padding-left : 10px">제공처: {{ item2.provider }}</span></tr>
                </td>
            </tr>

        </table>
        <div id="map" style="width:500px;height:400px;"></div>
    </div>
</template>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=de9b38249478fabb18d7a62672968006"></script>
<script>
    import {mapState} from "vuex";
    export default {
        mounted() {this.initMap();
        },

        computed : {
            ...mapState ({
                item2 : state => state.search.item2,
                list: state => state.search.list
            })
        },
        methods: {
            retrieveOne(floatingSeq){
                this.$store.dispatch('search/retrieveOne',{cate:'floatings' ,
                    seq:floatingSeq})
            },
            initMap() {
                let mapOption = {
                    center: new kakao.maps.LatLng(this.$store.state.search.item2.lati, this.$store.state.search.item2.longi), // 지도의 중심좌표
                    level: 3 // 지도의 확대 레벨
                };

                let map = new kakao.maps.Map(document.getElementById('map'), mapOption); // 지도를 생성합니다

                let markerPosition = new kakao.maps.LatLng(mapOption.center);

                let marker = new kakao.maps.Marker({
                    position: markerPosition
                });

                marker.setMap(map);}
        }
    };
</script>
<style scoped>
    .top  {
        margin-top:28px;
        margin-bottom:28px;
    }

    #search{
        display: block;
        width: 550px;
        height: 50px;
        font-size: 15pt;
        border: 1px solid #EAEAEA;
    }
    .btn_submit {
        width: 50px;
        height: 50px;
        background-color: #fff;
    }
    button{
        font-size: 12px;
        line-height: 16px;
        color: #000;
    }
    button{
        margin: 0;
        padding: 0;
    }
    button {
        -webkit-appearance: button;
        -webkit-writing-mode: horizontal-tb !important;
        text-rendering: auto;
        letter-spacing: normal;
        word-spacing: normal;
        text-transform: none;
        display: inline-block;
        text-align: center;
        align-items: flex-start;
        cursor: default;
        background-color: buttonface;
        box-sizing: border-box;
        margin: 0em;
        font: 400 13.3333px Arial;
        padding: 1px 6px;
        border : 1px solid #EAEAEA;
    }
    a{
        text-decoration: none;
        font-size: 10.5pt;
        margin: 0px 10px;
        color: grey;
    }
    a:hover{
        text-decoration: underline;
    }
    .btn_submit {
        width: 50px;
        height: 50px;
        background-color: #fff;
    }

</style>