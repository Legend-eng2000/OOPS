package Program7;
class Instuctor extends Employee {
    String department;
    String subject;

    Instuctor(int id, String name, double salary, String address,String department,String subject){
        super(id, name, salary, address);
        this.department=department;
        this.subject=subject;
    }

    void display(){
        System.out.println("ID: "+id+"\tName: "+name+"\tSalary: "+salary+"\tAddress: "+address+"\tDepartment: "+department+"\tSubject: "+subject);
    }
}
