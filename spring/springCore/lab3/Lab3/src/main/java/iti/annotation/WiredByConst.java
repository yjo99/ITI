package iti.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class WiredByConst {
    private String name;

    @Autowired(required = true)
    private ClassWired cw;

    public WiredByConst() {
        System.out.println("def const");
    }

    public WiredByConst(ClassWired cw) {
        System.out.println("obj const");

        this.cw = cw;
    }


    public WiredByConst(String name) {
        System.out.println("name const");

        this.name = name;
    }

    @Autowired(required = false)
    public WiredByConst(String name, ClassWired cw) {
        System.out.println("Both prop const");
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

    @Autowired(required = true)
    public void setCw(ClassWired cw) {
        this.cw = cw;
    }

}
