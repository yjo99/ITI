package iti.qualifier;

public class Buyer extends Person {

    private String IdBuying;



    public Buyer(String idBuying) {
        IdBuying = idBuying;
    }

    public Buyer(String name, int age, int mobile, String idBuying) {
        super(name, age, mobile);
        IdBuying = idBuying;
    }

    public String getIdBuying() {
        return IdBuying;
    }

    public void setIdBuying(String idBuying) {
        IdBuying = idBuying;
    }
    
}
