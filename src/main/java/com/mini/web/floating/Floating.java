package com.mini.web.floating;


import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;



@Entity(name="floating")
@Lazy
@Data
public class Floating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long floatingSeq;
    @NotNull
    @Column(length = 50)
    private String roadName;
    @Column(length = 850)
    private String roadDescription;
    @Column(length = 30)
    private String km;
    @Column(length = 30)
    private String required;
    @Column(length = 100)
    private String startPoint;
    @Column(length = 200)
    private String startNewAdress;
    @Column(length = 200)
    private String startOldAdress;
    @Column(length = 100)
    private String endPoint;
    @Column(length = 200)
    private String endNewAdress;
    @Column(length = 200)
    private String endOldAdress;
    @Column(length = 800)
    private String course;
    @Column(length = 15)
    private String managementNumber;
    @Column(length = 60)
    private String management;
    @Column(length = 30)
    private String updateDate;
    @Column(length = 25)
    private String lati;
    @Column(length = 25)
    private String longi;
    @Column(length = 15)
    private String providerCode;
    @Column(length = 50)
    private String provider;

    public Floating() {
    }

    @Builder
    Floating(
             String roadName,
             String roadDescription,
             String km,
             String required,
             String startPoint,
             String startNewAdress,
             String startOldAdress,
             String endPoint,
             String endNewAdress,
             String endOldAdress,
             String course,
             String managementNumber,
             String management,
             String updateDate,
             String lati,
             String longi,
             String providerCode,
             String provider) {
        this.roadName = roadName;
        this.roadDescription = roadDescription;
        this.km = km;
        this.required = required;
        this.startPoint = startPoint;
        this.startNewAdress = startNewAdress;
        this.startOldAdress = startOldAdress;
        this.endPoint = endPoint;
        this.endNewAdress = endNewAdress;
        this.endOldAdress = endOldAdress;
        this.course = course;
        this.managementNumber = managementNumber;
        this.management = management;
        this.updateDate = updateDate;
        this.lati = lati;
        this.longi = longi;
        this.providerCode = providerCode;
        this.provider = provider;
    }
    @Override
    public String toString() {
        return "Floating{" +
                "floatingSeq=" + floatingSeq +'\'' +
                ", roadName='" + roadName + '\'' +
                ", roadDescription='" + roadDescription + '\'' +
                ", km='" + km + '\'' +
                ", required='" + required + '\'' +
                ", startPoint='" + startPoint + '\'' +
                ", startNewAdress='" + startNewAdress + '\'' +
                ", startOldAdress='" + startOldAdress + '\'' +
                ", endPoint='" + endPoint + '\'' +
                ", endNewAdress='" + endNewAdress + '\'' +
                ", endOldAdress='" + endOldAdress + '\'' +
                ", course='" + course + '\'' +
                ", managementNumber='" + managementNumber + '\'' +
                ", management='" + management + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", lati='" + lati + '\'' +
                ", longi='" + longi + '\'' +
                ", providerCode='" + providerCode + '\'' +
                ", provider=" + provider +
                '}';
    }

}
