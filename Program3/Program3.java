import java.util.Scanner;

public class Program3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter price of CPU:");
        int price=sc.nextInt();
        CPU cpu=new CPU(price);
        
        CPU.Processor processor=cpu.new Processor(8, "Intel");
        processor.show();

        CPU.RAM ram=new CPU.RAM(16, "AMD");
        ram.show();

        sc.close();
    }
}

class CPU{
    int price;
    CPU(int price){
        this.price=price;
    }

    class Processor{
        int noOfCores;
        String manufacturer;
        Processor(int noOfCores,String manufacturer){
            this.noOfCores=noOfCores;
            this.manufacturer=manufacturer;
        }
        void show(){
            System.out.println("Number of processors:"+noOfCores+"\nManufacturer:"+manufacturer);
        }
    }

    static class RAM{
        int memory;
        String manufacturer;
        RAM(int memory,String manufacturer){
            this.memory=memory;
            this.manufacturer=manufacturer;
        }
        void show(){
            System.out.println("Memory:"+memory+" RAM\nManufacturer:"+manufacturer);
        }
    }
}