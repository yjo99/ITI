package iti.springcore.Human;

import org.springframework.beans.factory.annotation.Value;

public class Car {

    @Value("Mazda 323")
    private String carModel;
    @Value("654123")
    private String carPlageNo;
    @Value("red")
    private String color;


    
    public Car() {
        System.out.println("car def const");
    }

    public Car(String carModel, String carPlageNo, String color) {
        System.out.println("car arg const");
        
        this.carModel = carModel;
        this.carPlageNo = carPlageNo;
        this.color = color;
    }
    public String getCarModel() {
        return carModel;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    public String getCarPlageNo() {
        return carPlageNo;
    }
    public void setCarPlageNo(String carPlageNo) {
        this.carPlageNo = carPlageNo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
