package com.springData.Entities;

import com.springData.interfaces.ActorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Component
public class ActorDaoImp implements ActorDao {

    @Autowired
    JdbcTemplate jdbcTemp;

    @Override
    public void insert(Actor actor) {
        String sql = "insert into actor values(?,?,?,?)";
        jdbcTemp.update(sql, actor.getActorId(), actor.getFirstName(),actor.getLastName(), actor.getLastUpdate());
        System.out.println("Insert successfuly");
    }

    @Override
    public void update(Actor actor ) {

        String sql = "update actor set first_name=?, last_name=?,last_update=? where actor_id = ?";
        jdbcTemp.update(sql, actor.getFirstName(),actor.getLastName(), actor.getLastUpdate(),actor.getActorId());
        System.out.println("Update successfuly");
    }

    @Override
    public void delete(int id) {
        String sql = "delete from actor where actor_id = ?";
        jdbcTemp.update(sql, id);
        System.out.println("Deleted Successfuly");

    }

    @Override
    public List<Actor> findAllActor() {
        String sql = "select * from actor";
        return jdbcTemp.query(sql, new MapActor());
    }

    @Override
    public Actor findById(int id ) {
        String sql = "select * from actor where actor_id = ?";
        return jdbcTemp.queryForObject(sql, new Object[] {id}, new MapActor());
    }

    @Override
    public List<Actor> findCollection(int id1, int id2) {
        String sql = "select * from actor where actor_id between ? and ?";

        return (List<Actor>) jdbcTemp.query(sql,new PreparedStatementSetter(){

            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                System.out.println("inside preparedStatment and values is " + id1 + id2);
                ps.setInt(1,id1);
                ps.setInt(2,id2);

            }
        },new ResultSetExtractor(){

            @Override
            public List<Actor> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Actor> x = new ArrayList<>();
                while(rs.next()){
                    Actor ac = new Actor();
                    ac.setActorId(rs.getInt(1));
                    ac.setFirstName(rs.getString(2));
                    ac.setLastName(rs.getString(3));
                    ac.setLastUpdate(rs.getDate(4));
                    x.add(ac);
                }
                return x;
            }

        });
    }


    //create a new table
    public void createTable(){
        jdbcTemp.execute("DROP TABLE IF EXISTS jo");
        String sql = " create table jo ( id int ,  name varchar(255));";
        jdbcTemp.execute(sql);
        System.out.println("Create successfuly");
    }

}
