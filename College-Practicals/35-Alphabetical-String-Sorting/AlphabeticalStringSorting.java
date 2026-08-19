import java.util.Scanner;

public class AlphabeticalStringSorting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        char[] characters = text.toCharArray();

        for (int i = 0; i < characters.length; i++) {

            for (int j = i + 1; j < characters.length; j++) {

                if (characters[i] > characters[j]) {

                    char temp = characters[i];
                    characters[i] = characters[j];
                    characters[j] = temp;
                }
            }
        }

        String sortedString = new String(characters);

        System.out.println("\nOriginal String: " + text);
        System.out.println("Alphabetical Order: " + sortedString);

        input.close();
    }
}
