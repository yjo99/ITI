package iti.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class WiredList {

    private String name;

    @Autowired
    private List<ClassWired> wList;


    
    public WiredList() {
    }

    public WiredList(String name) {
        this.name = name;
    }

    public WiredList(List<ClassWired> wList) {
        this.wList = wList;
    }

    public WiredList(String name, List<ClassWired> wList) {
        this.name = name;
        this.wList = wList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ClassWired> getwList() {
        return wList;
    }

    public void setwList(List<ClassWired> wList) {
        this.wList = wList;
    }
    
}
