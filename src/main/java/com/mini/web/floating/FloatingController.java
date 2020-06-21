package com.mini.web.floating;


import com.mini.web.mappers.FloatingMapper;
import com.mini.web.proxy.Box;
import com.mini.web.proxy.IFunction;
import com.mini.web.proxy.Pager;
import com.mini.web.proxy.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.function.Function;


@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@RestController
@RequestMapping("/floatings")
public class FloatingController {
    @Autowired Pager pager;
    @Autowired FloatingMapper floatingMapper;
    @Autowired Box<Object> box;
    @Autowired Proxy pxy;

    @GetMapping("/{searchWord}/{pageNumber}")
    public Map<?,?> list(@PathVariable("pageNumber") String pageNumber,
                         @PathVariable("searchWord") String searchWord){
        if(searchWord.equals("null")){
            pager.setSearchWord("");
        }else{
            pager.setSearchWord(searchWord);
        }
        pager.setNowPage(pxy.integer(pageNumber));
        pager.setBlockSize(5);
        pager.setPageSize(20);
        pager.paging();
        Function<Pager, List<FloatingDTO>> f = p ->  floatingMapper.selectFloatings(p);
        List<FloatingDTO> list = f.apply(pager);
        for(FloatingDTO m : list){

        }
        box.clear();
        box.put("pager", pager);
        box.put("list", list);
        return box.get();
    }

        @GetMapping("/{seq}")
        public FloatingDTO detail(@PathVariable("seq") String seq){
        return floatingMapper.selectFloating(seq);
    }
}
