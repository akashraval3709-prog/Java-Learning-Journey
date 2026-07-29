import java.util.Scanner;

class Device{
    String brand;

    Device(String brand)
    {
        this.brand = brand;
    }

  void  displayDeviceDetails()
    {
        System.out.println("Brand : " + brand);
    }
}

class Computer extends Device
{
    int ramSize;
     Computer(String drand , int ram_size)
     {
          super(drand);
          this.ramSize = ram_size;

     }
    
    void  displayComputerDetails()
    {
        System.out.println("RAM Size : " + ramSize + " GB");
    }
}

 
class Laptop extends Computer{

    double batteryLife;
    Laptop( String brand ,int ramSize , double batteryLife)
    {
        super(brand, ramSize);

        this.batteryLife = batteryLife;


    }

   void  displayLaptopDetails(){   
    displayDeviceDetails();
    displayComputerDetails();
    System.out.println("Battery Backup: "+ batteryLife  +" Hours");

   }
} 

public class program_22 {
    
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Brand Name: ");
        String brand = input.nextLine();

       
        System.out.print("Enter RAM (in GB): ");
        int ram = input.nextInt();

       
        System.out.print("Enter Battery Backup (in Hours): ");
        double battery = input.nextDouble();

        System.out.println("--- 💻 Laptop Product Specifications ---");

        Laptop lp = new Laptop(brand , ram , battery);

        lp.displayLaptopDetails();


        input.close();

    }
}
