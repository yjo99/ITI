package iti.springcore.customeScope;
import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.context.annotation.ScopeMetadataResolver;


public class CustScope implements ScopeMetadataResolver {

    @Override
    public ScopeMetadata resolveScopeMetadata(BeanDefinition def){
        // def.setScope("prototype");
        System.out.println(def.getScope());
        ScopeMetadata scp = new ScopeMetadata();
        scp.setScopeName("prototype");
        System.out.println(scp.getScopeName());
        return scp;

    }
    
}
