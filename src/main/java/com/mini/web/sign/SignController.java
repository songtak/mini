package com.mini.web.sign;

import com.mini.web.Messenger;
import com.mini.web.mappers.SignMapper;
import org.mariadb.jdbc.internal.logging.Logger;
import org.mariadb.jdbc.internal.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signs")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class SignController {
    @Autowired SignMapper signMapper;
    @Autowired SignService signService;

    static Logger logger = LoggerFactory.getLogger(SignController.class);

    @PostMapping("/signup")
    private Messenger signUp(@RequestBody SignDTO signDTO){
        logger.info("signup");
         signMapper.insertSign(signDTO);
         return Messenger.SUCCESS;
    }

    @PostMapping("/signin/{id}")
    private Messenger signIn(@RequestBody SignDTO signDTO, @PathVariable String id){
        logger.info("signIn()");
        signMapper.loginSign(signDTO);
        return Messenger.SUCCESS;
    }

}