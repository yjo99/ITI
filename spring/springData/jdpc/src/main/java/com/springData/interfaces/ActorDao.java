package com.springData.interfaces;

import com.springData.Entities.Actor;
import java.util.List;


public interface ActorDao {


    public void insert(Actor actor);

    public void update(Actor actor);
    public void delete(int id);

    public List<Actor> findAllActor();

    public Actor findById(int id);

    public List<Actor> findCollection(int id1, int id2);
    
    
}
