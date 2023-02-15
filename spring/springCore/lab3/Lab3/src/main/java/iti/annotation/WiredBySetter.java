package iti.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class WiredBySetter {

    private String name;
    private ClassWired cw;
    
    public WiredBySetter(String name, ClassWired cw) {
        this.name = name;
        this.cw = cw;
    }
    public WiredBySetter() {
    }
    public WiredBySetter(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ClassWired getCw() {
        return cw;
    }
    @Autowired
    public void setCw(ClassWired cw) {
        this.cw = cw;
    }
    public ClassWired set$getCwName(){
        this.cw.setText(this.name);
        return cw;
    }
    
}
