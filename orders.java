import java.util.ArrayList;

public class orders {
    private ArrayList<food> dishes;
    private int ordernumber;
    private static int totalorders = 0;
    private String status;


    public orders(ArrayList<food> dishes){
        this.dishes = dishes;
        totalorders++;
        this.ordernumber = totalorders;
        status = "placed";
    }
    public orders(){
        totalorders++;
        this.ordernumber = totalorders;
        dishes = new ArrayList<>();
        status = "placed";
    }

    public ArrayList<food> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<food> dishes) {
        this.dishes = dishes;
    }

    public int getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
    }
    public boolean equals(orders o ){
        return ordernumber == o.ordernumber;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
