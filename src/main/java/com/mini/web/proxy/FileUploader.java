package com.mini.web.proxy;

import com.mini.web.floating.Floating;
import com.mini.web.floating.FloatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.mini.web.floating.FloatingDTO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


@Service("uploader") @Lazy
public class FileUploader extends Proxy{
    @Autowired Inventory<String> inventory;
    @Autowired FloatingRepository floatingRepository;


    public void upload(){
        inventory.clear();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/sn9tk/IdeaProjects/mini/src/main/resources/static/floating.csv"
)));
            String floating = "";
            while((floating = reader.readLine()) != null){
                inventory.add(floating);
            }
        }catch(Exception e){
            print("파일 리딩 에러");
            e.printStackTrace();
        }
        print(inventory.get().get(0).toString());
        String[] arr = inventory.get().get(0).toString().split(",");
        Floating floating = new Floating();
        floating.setRoadName(arr[0]);
        floating.setRoadDescription(arr[1]);
        floating.setKm(arr[2]);
        floating.setRequired(arr[3]);
        floating.setStartPoint(arr[4]);
        floating.setStartNewAdress(arr[5]);
        floating.setStartOldAdress(arr[6]);
        floating.setEndPoint(arr[7]);
        floating.setEndNewAdress(arr[8]);
        floating.setEndOldAdress(arr[9]);
        floating.setCourse(arr[10]);
        floating.setManagementNumber(arr[11]);
        floating.setManagement(arr[12]);
        floating.setUpdateDate(arr[13]);
        floating.setLati(arr[14]);
        floating.setLongi(arr[15]);
        floating.setProviderCode(arr[16]);
        floating.setProvider(arr[17]);

        floatingRepository.save(floating);

    }
}