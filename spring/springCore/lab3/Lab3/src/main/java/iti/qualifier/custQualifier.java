package iti.qualifier;

import java.lang.annotation.*;
import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Qualifier;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface custQualifier {

    String name();
    int id();
    
    
}



