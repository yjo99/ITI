package com.rest.api;

import com.rest.repo.*;
import com.rest.Entity.*;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import com.rest.models.*;
import java.util.*;


@Path("serv")
public class ServCls {
    static  List<Users> us = new ArrayList<>();
    public ServCls(){
        us.add(new Users(24, "Yousef"));
        us.add(new Users(24, "Jo"));
        us.add(new Users(24, "Jo2"));
        us.add(new Users(25, "Jo3"));
        us.add(new Users(27, "Jo4"));
        us.add(new Users(20, "Jo5"));
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Users> getUsers(){
        return us;
    }
    @GET
    @Path("wo")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Workorder> getWorkorder(){
        woRepo wor = new woRepo();
        
        return wor.findAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{age}")
    public List<Users> getUsersByage(@PathParam("age") int age){
        List<Users> filtUser = new ArrayList<>();
        System.out.println(us);
        for(Users o: us){
            if(o.age == age){
                filtUser.add(o);
            }
        }
        return filtUser;
    }

    @POST
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public String addUser(Users u){
        us.add(u);
        return "User : " + u.name + " Saved Successfully";
    }
    // @POST
    // @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    // @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED})
    
    // public String addUser(@FormParam("edit") String edit ,Users u){
    //     us.add(u);
    //     return "User : " + u.name + "Save Successfully,, " + edit;
    // }


    @PUT
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    // @Path("{name}")
    public Users updateUser( Users u){
        for(Users o: us){
            if(o.name.equals("Jo2")){
                o.name = u.name;
                return o;
            }
        }
        return new Users(-1, "Not Exist");
    }


    @DELETE
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Path("{name}")
    public List<Users> delUsers(@PathParam("name") String name){
        for(Users o: us){
            if(o.name.equals(name)){
                us.remove(o);
                return us;
            }
        }
        return us;
    }

}
