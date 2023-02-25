package com.springData.Entities;

import java.sql.Date;

public class Actor {

    private int actorId;
    private String firstName;
    private String lastName;
    private Date LastUpdate;


    public Actor(){

    };
    public Actor(int actorId, String firstName, String lastName, Date lastUpdate) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
        LastUpdate = lastUpdate;
    }

    
    public int getActorId() {
        return actorId;
    }
    public void setActorId(int actorId) {
        this.actorId = actorId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Date getLastUpdate() {
        return LastUpdate;
    }
    public void setLastUpdate(Date lastUpdate) {
        LastUpdate = lastUpdate;
    }

    
    @Override
    public String toString() {
        return "actor [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + ", LastUpdate="
                + LastUpdate + "]";
    }
    
}
