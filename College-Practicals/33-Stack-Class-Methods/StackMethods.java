import java.util.Scanner;
import java.util.Stack;

public class StackMethods {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Stack<String> books = new Stack<>();

        System.out.print("Enter number of books: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter book " + (i + 1) + ": ");
            books.push(input.nextLine());
        }

        System.out.println("\nStack: " + books);

        System.out.println("Top Book: " + books.peek());
        System.out.println("Stack Size: " + books.size());

        System.out.print("\nEnter book to search: ");
        String search = input.nextLine();

        System.out.println("Contains: " + books.contains(search));
        System.out.println("Position: " + books.search(search));

        System.out.print("\nEnter a new book: ");
        String newBook = input.nextLine();

        books.push(newBook);
        System.out.println("After push: " + books);

        String removedBook = books.pop();
        System.out.println("Popped Book: " + removedBook);
        System.out.println("After pop: " + books);

        System.out.println("Top Book After Pop: " + books.peek());

        System.out.println("Is Stack Empty? " + books.empty());

        books.clear();
        System.out.println("After clear(): " + books);
        System.out.println("Is Stack Empty Now? " + books.empty());

        input.close();
    }
}
