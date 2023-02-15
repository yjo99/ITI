package iti.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class WiredByConst {
    private String name;
    private ClassWired cw;

    public WiredByConst() {
    }

    public WiredByConst(ClassWired cw) {
        this.cw = cw;
    }


    public WiredByConst(String name) {
        this.name = name;
    }

    @Autowired(required = false)
    public WiredByConst(String name, ClassWired cw) {
        this.name = name;
        this.cw = cw;
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
    public void setCw(ClassWired cw) {
        this.cw = cw;
    }

}
