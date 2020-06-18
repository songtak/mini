package com.mini.web.admin;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Admin {
    private String  id, password, name, phoneNumber, sex;

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s",
                id, password, name, phoneNumber, sex);
    }
}