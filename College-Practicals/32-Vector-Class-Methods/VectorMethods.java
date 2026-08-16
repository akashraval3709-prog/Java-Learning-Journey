import java.util.Scanner;
import java.util.Vector;

public class VectorMethods {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Vector<String> products = new Vector<>();

        System.out.print("Enter number of products: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product " + (i + 1) + ": ");
            products.add(input.nextLine());
        }

        System.out.println("\nProducts: " + products);

        System.out.print("Enter product to add: ");
        String newProduct = input.nextLine();
        products.addElement(newProduct);

        System.out.println("After addElement(): " + products);

        System.out.println("First Product: " + products.firstElement());
        System.out.println("Last Product: " + products.lastElement());
        System.out.println("Size: " + products.size());
        System.out.println("Capacity: " + products.capacity());

        System.out.print("\nEnter product to search: ");
        String search = input.nextLine();

        System.out.println("Contains: " + products.contains(search));
        System.out.println("Index: " + products.indexOf(search));

        if (products.contains(search)) {
            products.remove(search);
            System.out.println("After remove: " + products);
        }

        System.out.print("\nEnter product to update: ");
        String oldProduct = input.nextLine();

        if (products.contains(oldProduct)) {
            int index = products.indexOf(oldProduct);

            System.out.print("Enter new product name: ");
            String updatedProduct = input.nextLine();

            products.set(index, updatedProduct);
            System.out.println("After update: " + products);
        }

        System.out.println("Is Vector Empty? " + products.isEmpty());

        input.close();
    }
}
