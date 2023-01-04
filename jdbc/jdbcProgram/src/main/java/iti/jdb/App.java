package iti.jdb;
import java.sql.*;

public class App 
{
    static int count = 201;
    static Connection con = dbconn.getConn();
    static Statement stm = null;
    static PreparedStatement prstm = null;
    static PreparedStatement sprstm = null;

    public static void preStm(int id){
        try{
            System.out.println("using Prepared Statement");
            prstm = con.prepareStatement("insert into actor values(?,?,?,?);");
            prstm.setInt(1,id);
            prstm.setString(2,"firstDatetest1");
            prstm.setString(3,"lastDatetest1");
            prstm.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now()));
            prstm.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                prstm.close();
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }

    public static void resSet(){
        try{
            System.out.println("Dealing with ResultSet");
            sprstm = con.prepareStatement("SELECT * from actor",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs2 = sprstm.executeQuery();
            while(rs2.next()){
                int id = rs2.getInt(1);
                rs2.updateString("first_name",String.format("test %d",(id*2)));
                rs2.updateRow();

                if(rs2.getInt(1) == 10){
                    rs2.deleteRow();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                sprstm.close();
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }
    public static void selectAll(){
        try{
            String q = "select * from actor";
            stm = con.createStatement();

            stm.executeUpdate("Update actor set first_name = 'jooooo' where actor_id = 1");


            ResultSet rs = stm.executeQuery(q);



            System.out.printf("%-40s || %s","id","FirstName" );
            System.out.println();
            while(rs.next()){
                System.out.printf("%-40s || %s",rs.getInt(1) , rs.getString(2));
                System.out.println();
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                stm.close();
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }
    public static void main( String[] args )
    {


        if(con== null){
            System.out.println("not work");
        }else{
            try {




                /////////////// used preparedStatement
                App.preStm(451);


                ///////////// work with ResultSet
                App.resSet();

                //////select all
                App.selectAll();

            }catch(Exception e){
                e.printStackTrace();
            }finally{
                try {
                    con.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
