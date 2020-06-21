package com.mini.web.sign;


import com.mini.web.Messenger;
import org.springframework.stereotype.Component;


@Component
public interface SignService {

    Messenger join(SignDTO signDTO);


    Messenger loginSign(String id, SignDTO signDTO);
}
