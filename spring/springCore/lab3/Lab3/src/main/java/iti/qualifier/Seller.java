package iti.qualifier;

public class Seller extends Person {
    private String idSelleing;
    

    public Seller(String idSelleing) {
        this.idSelleing = idSelleing;
    }

    public Seller(String name, int age, int mobile, String idSelleing) {
        super(name, age, mobile);
        this.idSelleing = idSelleing;
    }

    public String getIdSelleing() {
        return idSelleing;
    }

    public void setIdSelleing(String idSelleing) {
        this.idSelleing = idSelleing;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }
    
    
}
