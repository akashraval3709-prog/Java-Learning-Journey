import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = input.nextLine();

        System.out.print("Enter a word to search: ");
        String searchWord = input.nextLine();

        System.out.println("\n--- String Class Results ---");

        System.out.println("Original String: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Trimmed String: " + name.trim());

        if (!name.isEmpty()) {
            System.out.println("First Character: " + name.charAt(0));
            System.out.println("Last Character: " +
                    name.charAt(name.length() - 1));
        }

        System.out.println("Contains \"" + searchWord + "\": "
                + name.contains(searchWord));

        System.out.println("Starts With \"" + searchWord + "\": "
                + name.startsWith(searchWord));

        System.out.println("Ends With \"" + searchWord + "\": "
                + name.endsWith(searchWord));

        System.out.println("Replace Spaces with '-': "
                + name.replace(" ", "-"));

        System.out.println("Substring: "
                + name.substring(0, Math.min(3, name.length())));

        input.close();
    }
}
