package com.mini.web.proxy;

import com.mini.web.floating.Floating;
import com.mini.web.floating.FloatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@RestController
public class ProxyController{
    @Autowired Box<Object> box;
    //@Autowired FileUploader uploader;
    @Autowired Proxy pxy;
    @Autowired FloatingRepository floatingRepository;
//    @Autowired FileUploader loader;



    @GetMapping("/floating")
    public HashMap<String,Object> floating(@PathVariable String floating){
        List<Floating> list = floatingRepository.findAll();
        pxy.print("count :"+list.size());
        box.put("list", list);
        box.put("count", list.size());
        return box.get();


    }
}