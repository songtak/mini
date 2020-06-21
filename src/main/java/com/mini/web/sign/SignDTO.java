package com.mini.web.sign;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;


@Data
@Component
public class SignDTO {
    private String id, password, name, phoneNumber, sex, birth;
    private int seq;
    private Date signDate;
}
