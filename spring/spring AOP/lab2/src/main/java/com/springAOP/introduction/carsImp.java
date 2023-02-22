package com.springAOP.introduction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springAOP.interfaces.cars;



public class carsImp implements cars {
    

    private String getCarModel;

    private String getCarPlate;

    @Override
    public String getCarModel() {
        this.getCarModel = "Mazda";
        return this.getCarModel;
    }

    @Override
    public String getCarPlate() {
        this.getCarPlate = "7amada";
       return this.getCarPlate;
    }

   
}
