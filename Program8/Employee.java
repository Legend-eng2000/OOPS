package Program8;
public class Employee extends Person {
    int id;
    double salary;
    String address;
    Employee(int id,String name,String gender,int age,double salary,String address){
        super(name, gender, age);
        this.id=id;
        this.salary=salary;
        this.address=address;
    }
}
