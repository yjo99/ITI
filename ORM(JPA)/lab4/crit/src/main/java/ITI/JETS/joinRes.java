package ITI.JETS;

public class joinRes {

    private final String owner;
    private final Long count;


    /**
     * 
     */
    public joinRes(String owner, Long count){
        this.owner = owner;
        this.count = count;
    }

    public String getOwner() {
        return owner;
    }

    // public void setOwner(String owner) {
    //     this.owner = owner;
    // }

    public Long getCount() {
        return count;
    }

    // public void setCount(Long count) {
    //     this.count = count;
    // }
}
