import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
public class rest {
    private static ArrayList<orders>  orders = new ArrayList<>();
    private static ArrayList<food> menu = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        makeMenu();
        int ans = -1;
        while(ans != 0){
            System.out.println("1. Eat in");
            System.out.println("2. Place Takeout Order");
            System.out.println("3. Place Delivery Order");
            System.out.println("4. List orders");
            System.out.println("5. Update Order");
            System.out.println("0. Exit");
            System.out.println("Enter Choice:");
            ans = sc.nextInt();
            sc.nextLine();

            switch(ans){
                case 1:
                System.out.println("table number: ");
                int tablenumber = sc.nextInt();
                ArrayList<food> dishes2 = getDishes();
                tableorder c = new tableorder(tablenumber);
                c.setDishes(dishes2);
                orders.add(c);
                break;
                case 2:
                System.out.println("Customer Name: "); 
                String customer1 = sc.nextLine();
                ArrayList<food> dishes1 = getDishes();
                takeout p = new takeout(customer1);
                p.setDishes(dishes1);
                orders.add(p);
                break;
                case 3:
                System.out.print("Customer Name: ");
                String customer = sc.nextLine();
                System.out.print("Address: ");
                String addr =sc.nextLine();
                System.out.print("Phone: ");
                String phone = sc.nextLine();
                ArrayList<food> dishes = getDishes();
                delivery o = new delivery(customer, addr, phone);
                o.setDishes(dishes);
                orders.add(o);
                break;
                case 4:
                ans= 0;
                while(ans <1 || ans > 3){
                    System.out.println("Press 2 for details");
                    ans = sc.nextInt();
                    sc.nextLine(); 
                }    
                listOrders(ans);
                break;
                case 5:
                System.out.println("1. Update status");
                System.out.println("2. Add dish");
                System.out.println("3. Remove dish");  
                System.out.println("4. Cancel order");
                ans = sc.nextInt();
                if(ans==1){
                    System.out.print("Status Updated");
                }

                break;
            }
        }

    }
    public static void makeMenu(){
        menu.add(new food("Cheeseburder", 10));
        menu.add(new food("Lasagna", 12));
        menu.add(new food("Chopped Saled", 9.99));
        menu.add(new food("Drink", 2.99));
    }
    public static ArrayList<food> getDishes(){
        ArrayList<food>  dishes =new ArrayList<>();
        int ans = 1;
        while(ans !=0){
            for(int i = 0; i < menu.size();i++){
                System.out.println(i+1+" "+menu.get(i));
            }
            System.out.println("Enter Choice (-1 to exit): ");
            ans = sc.nextInt();
            sc.nextLine();
            if(ans > 0 && ans <=menu.size()){
                dishes.add(menu.get(ans));
            }
            else if(ans== -1){
                break;
            }else{
                System.out.println("Invalid choice");
            }
        }
        return dishes;
    }
    public static String getType(orders o){
        if(o instanceof takeout){
            return "TakeoutOrder";
        }
        else if(o instanceof delivery){
            return "DeliveryOrder";
        }else if(o instanceof tableorder){
            return "TableOrder";
        }
        else{
            return "";
        }
    }
    public static void listOrders(int n){
        if(n == 1){//print orders by order number
        }else if(n == 2){//Print Orders by orderType
            HashSet<String> orderTypes = new HashSet<>();
            for(orders o: orders)//Find all the order types
                orderTypes.add(getType(o));
        
            for(String orderType:  orderTypes){//Loop through the order types
                for(orders o: orders){//For each order type print the oders that belong to that type
                    if(getType(o).equals(orderType)){
                        System.out.println(o);
                    }
                }
            }


        }else if(n == 3){//Print orders by status

            //TODO see code for option 2.This is similar 
        }
    }
}
