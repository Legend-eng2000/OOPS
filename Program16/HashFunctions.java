package Program16;

import java.util.HashMap;
import java.util.Scanner;

public class HashFunctions {
    static int num=251;
    static void pushValue(HashMap<String,Student> map){
        Student s=new Student();
        s.getValues();
        map.put("MCA"+ num++, s);
    }
    static Student searchStudent(HashMap<String,Student> map,Scanner sc){
        System.out.print("Enter admission number: ");
        String rollNumber=sc.nextLine();
        return map.get(rollNumber);
    }
    static void removeStudent(HashMap<String,Student> map,Scanner sc){
        System.out.print("Enter admission number: ");
        String rollNumber=sc.nextLine();
        map.remove(rollNumber);
        System.out.println("Element removed.");
    }
    
}
