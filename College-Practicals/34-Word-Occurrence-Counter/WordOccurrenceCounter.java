import java.util.Scanner;

public class WordOccurrenceCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = input.nextLine();

        System.out.print("Enter word to search: ");
        String searchWord = input.nextLine();

        int count = 0;
        int wordLength = searchWord.length();

        for (int i = 0; i <= text.length() - wordLength; i++) {

            String word = text.substring(i, i + wordLength);

            if (word.equals(searchWord)) {
                count++;
            }
        }

        System.out.println("\nWord \"" + searchWord
                + "\" occurred " + count + " times.");

        input.close();
    }
}
