package com.mini.web.floating;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class FloatingDTO {
    private String floatingSeq, roadName, roadDescription, km, required,
    startPoint, startNewAdress, startOldAdress,
    endPoint, endNewAdress, endOldAdress,
            course, managementNumber, management,
    updateDate, lati, longi, providerCode, provider;
}
