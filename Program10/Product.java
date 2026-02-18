package Program10;
public class Product implements ProductCalc{
    int pid,quantity,price,total;
    String pname;
    Product(int pid,String pname,int quantity,int price){
        this.pid=pid;
        this.pname=pname;
        this.quantity=quantity;
        this.price=price;
        this.calculateTotal();
    }
    public void calculateTotal(){
        total=quantity*price;
    }
    public static void displayAll(Product[] liProducts){
        System.out.printf("%-13s %-12s %-10s %-12s %-20s%n","ProductID", "Name", "Quantity", "Unit Price", "Total");
        System.out.println("---------------------------------------------------------------------");
        for (Product p : liProducts) {
            System.out.printf("%-15d %-15s %-10d %-8d %-8d%n",
                    p.pid, p.pname, p.quantity, p.price, p.total);
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%52s %d %n", "Net Amount:", calcNet(liProducts));
    }
    public static int calcNet(Product[] liProducts){
        int total=0;
        for (Product p : liProducts) {
            total+=p.total;
        }
        return total;
    }
}
