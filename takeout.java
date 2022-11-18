import java.util.ArrayList;

public class takeout extends orders {
    private String customer;

    public takeout(String customer){
        super();
        this.customer = customer;
    }
    public takeout(String customer, ArrayList<food> dishes){
        super(dishes);
        this.customer = customer;
    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public String toString() {
        return "takeout [customer=" + customer + "]";
    }
}
