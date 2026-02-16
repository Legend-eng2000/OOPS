package Program8;
public class Instructor extends Employee{
    String subject;
    String department;
    int instructorId;
    Instructor(int id,int instructorId,String name,String gender,int age,double salary,String address,String subject,String department){
        super(id, name, gender, age, salary, address);
        this.subject=subject;
        this.department=department;
        this.instructorId=instructorId;
    }
    void display(){
        System.out.println("ID: "+id+"\tInstructor-ID: "+instructorId+"\tName: "+name+"\tGender: "+gender+"\tAge: "+age+"\tSalary: "+salary+"\tAddress: "+address+"\tSubject: "+subject+"\tDepartment: "+department);
    }
}
