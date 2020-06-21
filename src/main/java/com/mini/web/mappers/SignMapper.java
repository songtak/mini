package com.mini.web.mappers;


import com.mini.web.Messenger;
import com.mini.web.sign.SignDTO;
import com.mini.web.proxy.Pager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SignMapper {

    void insertSign(SignDTO signDTO);
    int searchCount(Pager pager);
    int signIn(SignDTO signDTO);

    int loginSign(SignDTO signDTO);
}
