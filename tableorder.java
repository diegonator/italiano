import java.util.ArrayList;
public class tableorder extends orders{
    private int tablenumber;

    public tableorder(int tablenumber){
        this.tablenumber = tablenumber;
    }
    public tableorder(int tablenumber, ArrayList<food> dishes){
        super(dishes);

    }
     public int getTablenumber() {
        return tablenumber;
    }

    public void setTablenumber(int tablenumber) {
        this.tablenumber = tablenumber;
    }
    public String toString() {
        return "tableorder [tablenumber=" + tablenumber + "]";
    }
}
