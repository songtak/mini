<template>
    <div>
        <h3>총게시글수 : {{pager.rowCount}}</h3>
        <span style="float: right"><input id="searchWord" type="text" style="border: 1px solid black">
    <button @click="retrieve">검 색</button></span>
        <v-simple-table>
            <template v-slot:default>
                <thead>
                <tr>
                    <th class="text-left">No.</th>
                    <th class="text-left">길이</th>
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
                    <td><a @click="retrieveOne(item.floatingSeq)" href="#">{{ item.roadName }}</a></td>
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
        <div class="text-center" >
            <div style="margin: 0 auto; width: 500px; height: 100px">
                <span @click="transferPage(pager.prevBlock)" v-if ='pager.existPrev' style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">이전</span>
                <span @click="transferPage(i-1)" v-for='i of pages' :key="i" style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">{{i}}</span>
                <span @click="transferPage(pager.nextBlock)" v-if ='pager.existNext' style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">다음</span>
            </div>

            <!--<v-pagination v-model="page" :length="5" :total-visible="5"></v-pagination>-->
        </div>
    </div>

</template>

<script>
    import { mapState } from "vuex"
    import {proxy} from "./mixins/proxy"
    export default {
        mixins: [proxy],
        created() {
            console.log('페이징 가기 전 : ')
            let json = proxy.methods.paging(`${this.$store.state.search.context}/floatings/null/0`)
            this.$store.state.search.list = json.floatings
            this.$store.state.search.pages = json.pages
            this.$store.state.search.pager = json.temp
            console.log('페이징 다녀온 다음 : '+json.temp.pageSize)
        },
        computed: {
            ...mapState({
                list: state => state.search.list,
                pages: state => state.search.pages,
                pager: state => state.search.pager
            })
        },
        methods: {
            transferPage(d) {
                proxy.methods.tester(d)
                this.$store.dispatch('search/transferPage',{cate:'floatings' ,
                    searchWord:'null',
                    pageNumber: d})
            },
            retrieve(){
                let searchWord = document.getElementById('searchWord').value
                if(searchWord === '') searchWord = 'null'
                this.$store.dispatch('search/transferPage',{cate:'floatings' ,
                    searchWord:searchWord,
                    pageNumber: 0})
            },
            retrieveOne(movieSeq){
                this.$store.dispatch('search/retrieveOne',{cate:'floatings' ,
                    searchWord:movieSeq})
            }
        }
    }
</script>