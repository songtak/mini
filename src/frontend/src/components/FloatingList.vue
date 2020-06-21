<template>
    <div>
        <span style="float: right"><input id="searchWord" type="text" style="border: 1px solid black">
    <button @click="retrieve">검 색</button></span>
        <v-simple-table>
            <template v-slot:default>
                <thead>
                <tr>
                    <th class="text-left">No.</th>
                    <th class="text-left">길이름</th>
                    <th class="text-left">출발지</th>
                    <th class="text-left">도착지</th>
                    <th class="text-left">km</th>
                    <th class="text-left">소요시간</th>
                    <th class="text-left">업데이트</th>
                    <th class="text-left">정보제공</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="item of list" :key="item.seq">
                    <td>{{ item.floatingSeq }}</td>
                    <td><router-link to="/floatingDetail"><a @click="retrieveOne(item.floatingSeq)">{{ item.roadName }}</a></router-link></td>
                    <td>{{ item.startPoint }}</td>
                    <td>{{ item.endPoint }}</td>
                    <td>{{ item.km }}</td>
                    <td>{{ item.required }}</td>
                    <td>{{ item.updateDate }}</td>
                    <td>{{ item.provider }}</td>
                    <!--<td><a @click="retrieveOne(item.movieSeq)" href="#">{{ item.title }}</a></td>-->
                </tr>
                </tbody>
            </template>
        </v-simple-table>
        <table name="page" class="text-center" style="margin : 0 auto;">
            <tr>
                <td>
                    <span @click="transferPage(--pager.startPage)" v-if='pager.existPrev' style="cursor:pointer">이전</span>
                </td>
                <td @click="transferPage(--num)" :key="num" v-for="num of pages" height="50" width="50" style="cursor:pointer">
                        <span>
                            {{num}}
                        </span>
                </td>
                <td height="50" width="50">
                    <span @click="transferPage(pager.nextBlock)" v-if='pager.existNext' style="cursor:pointer">다음</span>
                </td>
            </tr>
        </table>
    </div>

</template>

<script>
    import { mapState } from "vuex"
    import {proxy} from "./mixins/proxy"
    export default {
        mixins: [proxy],
        created: function () {
            let json = proxy.methods.paging(`${this.$store.state.search.context}/floatings/null/0`)
            this.$store.state.search.list = json.floatings
            this.$store.state.search.pages = json.pages
            this.$store.state.search.pager = json.temp
            this.$store.state.search.nowPage = json.nowPage
        },
        computed: {
            ...mapState({
                list: state => state.search.list,
                pages: state => state.search.pages,
                pager: state => state.search.pager,
                nowPage: state => state.search.nowPage
            })
        },
        methods: {
            transferPage(d) {
                this.$store.dispatch('search/transferPage',{cate : 'floatings',searchWord : "null", pageNumber : d})
            },
            retrieve(){
                let searchWord = document.getElementById('searchWord').value
                if(searchWord === '') searchWord = 'null'
                this.$store.dispatch('search/transferPage',{cate:'floatings' ,
                    searchWord:searchWord,
                    pageNumber: 0})
            },
            retrieveOne(floatingSeq){
                this.$store.dispatch('search/retrieveOne',{cate:'floatings' ,
                    seq:floatingSeq})
            }
        }
    }
</script>