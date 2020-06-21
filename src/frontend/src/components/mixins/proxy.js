import axios from "axios";

export const proxy={
    methods: {
        paging(d){
            const floatings = []
            const pages = []
            let temp = {}
            let nowPage = {}

            axios
                .get(d)
                .then(res => {
                res.data.list.forEach(elem => {
                    floatings.push(elem)
                })
                let pager = res.data.pager
                let i = pager.startPage
                for (; i <= pager.endPage; i++) {
                    pages.push(i + 1)
                }
                    nowPage = pager.nowPage
                    temp.existNext = pager.existNext
                    temp.existPrev = pager.existPrev
                    temp.nextBlock = pager.nextBlock
                    temp.nowBlock = pager.nowBlock
                    temp.pageSize = pager.pageSize
                    temp.startPage = pager.startPage

                })
                .catch(err=>{
                    alert(`통신 실패 ${err}`)
                })

            return {floatings, pages, temp, nowPage}
        }
    }
}