package iti.springcore.customeScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.inject.Singleton;

@Component
@Singleton
@Scope("custScope")
public class scopeImpl {

    private int x;

    public scopeImpl() {
    }

    public scopeImpl(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    
}
