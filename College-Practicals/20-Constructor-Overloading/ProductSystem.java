import java.util.Scanner;

class ProductSystem {
 
    String productName;
    double price;
    String category;

    
    static String platformName = "Flipkart";
    static int productCount = 0;

   
    Product(String productName, double price) {
       
        this(productName, price, "General");
       
    }

    
    Product(String productName, double price, String category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
        
       
        productCount++; 
        
    }

    
    void displayProductInfo() {
        System.out.println("[" + platformName + "] Product: " + productName + 
                           " | Category: " + category + 
                           " | Price: " + price);
    }

    
    static void displayTotalProducts() {
        System.out.println("\n---------------------------------------------------------");
        System.out.println("Total Products Registered on " + platformName + ": " + productCount);
        System.out.println("---------------------------------------------------------");
    }
}


public class ProductSystem {
    public static void main(String[] args) {
        System.out.println("--- Starting Flipkart Product Catalog Simulator --- \n");

        Scanner input = new Scanner(System.in);
      
        System.out.println("--- Enter Details for Product 1 ---");
        System.out.print("Product Name: ");
        String productName1 = input.nextLine();

        System.out.print("Price: ");
        double price1 = input.nextDouble();
        input.nextLine(); 
        
        Product prod1 = new Product(productName1, price1);
        prod1.displayProductInfo();
        System.out.println();
        
        
        System.out.println("--- Enter Details for Product 2 ---");
        System.out.print("Product Name: ");
        String productName2 = input.nextLine();

        System.out.print("Price: ");
        double price2 = input.nextDouble();
        input.nextLine(); 

        Product prod2 = new Product(productName2, price2, "Electronics");
        prod2.displayProductInfo();

        
        Product.displayTotalProducts();
        
        input.close();
    }
}
