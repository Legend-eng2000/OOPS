package Program10;

public class Program10 {
    public static void main(String[] args) {
        Product[] proList=new Product[2];
        proList[0]=new Product(101, "A", 2, 25);
        proList[1]=new Product(102, "B", 1, 100);
        Product.displayAll(proList);
    }
}
