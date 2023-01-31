package com.rest.api;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import com.rest.models.*;
import java.util.*;


@Path("serv")
public class ServCls {
    List<Users> us = new ArrayList<>();
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
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public List<Users> getUsersById(@PathParam("id") int age){
        List<Users> filtUser = new ArrayList<>();
        System.out.println(us);
        for(Users o: us){
            if(o.age == age){
                filtUser.add(o);
            }
        }
        return filtUser;
    }

    // @POST
    // @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    // @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    // public String addUser(Users u){
    //     us.add(u);
    //     return "User : " + u.name + "Save Successfully";
    // }
    @POST
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED})
    
    public String addUser(@FormParam("edit") String edit ,Users u){
        us.add(u);
        return "User : " + u.name + "Save Successfully,, " + edit;
    }


    @PUT
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Path("hello")
    public Users updateUser(@QueryParam("name") String name){
        for(Users o: us){
            if(o.name.equals(name)){
                o.name = "Yousef Sayed Abdelaziz Mohamed eldahshan";
                return o;
            }
        }
        return new Users(-1, "Not Exist");
    }

}
