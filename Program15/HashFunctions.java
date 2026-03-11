package Program15;

import java.util.HashMap;
import java.util.Scanner;

public class HashFunctions {

    static void pushValue(HashMap<Integer,Integer> map,Scanner sc){
        System.out.print("Enter roll number :");
        Integer rollNumber=sc.nextInt();
        System.out.print("Enter mark :");
        Integer mark=sc.nextInt();
        map.put(rollNumber,mark);
    }
    static Integer searchMark(HashMap<Integer,Integer> map,Scanner sc){
        System.out.print("Enter roll number :");
        Integer rollNumber=sc.nextInt();
        return map.getOrDefault(rollNumber,-1);
    }
    static void removeStudent(HashMap<Integer,Integer> map,Scanner sc){
        System.out.print("Enter roll number :");
        Integer rollNumber=sc.nextInt();
        map.remove(rollNumber);
    }
    
}
