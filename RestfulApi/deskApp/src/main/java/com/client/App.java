package com.client;

import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();

        // // // get specific element
        // List<Users> users =
        // client.target("http://localhost:8090/restful/api/serv").path("{age}")
        // .resolveTemplate("age", 24).request(MediaType.APPLICATION_JSON).get(new
        // GenericType<List<Users>>() {
        // });

        // System.out.println(txt);
        // for (Users o : allUsers) {
        // System.out.println(o.name);
        // }

        // // // get all element
        // List<Users> allUsers =
        // client.target("http://localhost:8090/restful/api/serv")
        // .request(MediaType.APPLICATION_JSON).get(new GenericType<List<Users>>() {
        // });

        // // add new element
        // Users khames = new Users(27, "abdulla");
        // String txt = client.target("http://localhost:8090/restful/api/serv")
        // .request().post(Entity.entity(khames, MediaType.APPLICATION_JSON),
        // String.class);

        // // Update user
        // Users x1 = client.target("http://localhost:8090/restful/api/serv").request()
        // .put(Entity.entity(khames, MediaType.APPLICATION_JSON), Users.class);
        // System.out.println(x1);

        List<Users> userinDelete = client.target("http://localhost:8090/restful/api/serv").path("{name}")
                .resolveTemplate("name", "Jo3")
                .request(MediaType.APPLICATION_JSON).delete(new GenericType<List<Users>>() {});

        System.out.println(userinDelete);
    }
}
