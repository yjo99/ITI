package iti.springcore.Human;

import org.springframework.beans.factory.annotation.*;

public class CarParts {

    @Value("123-pv132165")
    private String pn;

    @Value("123456sn")
    private String sn;

    @Value("elivator")
    private String name;

    private Workshop workshop;

    private Car car;

    private static int objcount=0;

    
    @Autowired
    public CarParts(String pn, String sn, String name, Workshop workshop, Car car) {
        objcount++;
        System.out.println("cartparts arg car and workshop const");
        this.pn = pn;
        this.sn = sn;
        this.name = name;
        this.workshop = workshop;
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public CarParts() {
    }

    @Autowired
    public CarParts(String pn, String sn, String name, Workshop workshop) {
        this.pn = pn;
        this.sn = sn;
        this.name = name;
        this.workshop = workshop;
    }


    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Workshop getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Workshop workshop) {
        this.workshop = workshop;
    }

    public static int getObjCount(){
        return objcount;
    }
    
}
