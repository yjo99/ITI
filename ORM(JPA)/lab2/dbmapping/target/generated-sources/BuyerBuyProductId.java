// default package
// Generated Jan 7, 2023, 7:22:48 PM by Hibernate Tools 6.1.6.Final


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * BuyerBuyProductId generated by hbm2java
 */
@Embeddable
public class BuyerBuyProductId  implements java.io.Serializable {


     private int buyerId;
     private int productId;

    public BuyerBuyProductId() {
    }

    public BuyerBuyProductId(int buyerId, int productId) {
       this.buyerId = buyerId;
       this.productId = productId;
    }
   


    @Column(name="buyer_id", nullable=false)
    public int getBuyerId() {
        return this.buyerId;
    }
    
    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }


    @Column(name="product_id", nullable=false)
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BuyerBuyProductId) ) return false;
		 BuyerBuyProductId castOther = ( BuyerBuyProductId ) other; 
         
		 return (this.getBuyerId()==castOther.getBuyerId())
 && (this.getProductId()==castOther.getProductId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getBuyerId();
         result = 37 * result + this.getProductId();
         return result;
   }   


}


