import java.util.Scanner;

public class ArraySorting {
    
   
    public static void sortArray(int[] arr) {
        int n = arr.length;
        
        // Bubble sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                if (arr[j] > arr[j + 1]) {
             
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Method to display array
    public static void displayArray(int[] arr) {
        System.out.print("Array Elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
 

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Array Sorting Program ---");
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("\nEnter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("\nBefore Sorting:");
        displayArray(numbers);
        
        sortArray(numbers);
        
        System.out.println("\nAfter Sorting (Ascending Order):");
        displayArray(numbers);
        
        scanner.close();
    }

   
}

