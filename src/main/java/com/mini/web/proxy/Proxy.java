package com.mini.web.proxy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("pxy") @Lazy
public class Proxy {
    public String string(Object o){
        Function<Object, String> f = String :: valueOf;
        return f.apply(o);
    }
    public int integer(String s){
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(s);
    }

}