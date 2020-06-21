package com.mini.web.sign;


import com.mini.web.Messenger;
import com.mini.web.mappers.SignMapper;
import com.mini.web.proxy.IConsumer;
import com.mini.web.proxy.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SignServiceImpl implements SignService{
    @Autowired
    SignMapper signMapper;
    @Autowired
    Pager pager;


    @Override
    public Messenger join(SignDTO sign) {
        Messenger no = Messenger.FAIL;

        pager.setSearchWord(sign.getId());
        if(signMapper.searchCount(pager)==0){
            sign.setSignDate((java.sql.Date) new Date(new Date().getTime()));
            IConsumer<SignDTO> s = signMapper ::insertSign;
            s.accept(sign);
            no = Messenger.SUCCESS;
        }
        return no;
    }

    @Override
    public Messenger loginSign(String id, SignDTO signDTO) {
        Messenger no = Messenger.FAIL;
        if(signMapper.signIn(signDTO)==1){
            no = Messenger.SUCCESS;
        }
        return no;
    }

}
