package Program10;
public class Product implements ProductCalc{
    int pid,quantity,price,total;
    String pname;
    Product(int pid,String pname,int quantity,int price){
        this.pid=pid;
        this.pname=pname;
        this.quantity=quantity;
        this.price=price;
    }
    public void calculateTotal(){
        total=quantity*price;
    }
    public static void displayAll(Product[] liProducts){
        System.out.println("Product ID\tName\tQuantity\tUnit Price\tTotal");
    }
}
