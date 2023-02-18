package iti.qualifier;

import java.lang.annotation.*;

import org.springframework.beans.factory.annotation.Qualifier;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface custQualifier {

    String name();
    PersonType type();
    
    
}


enum PersonType{
    Buyer, Seller
}
