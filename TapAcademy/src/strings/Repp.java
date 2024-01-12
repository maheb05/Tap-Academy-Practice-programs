package strings;

import java.util.Scanner;

public class Repp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        System.out.print("Enter the word to replace: ");
        String searchWord = scanner.nextLine();
        
        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        char[] sentenceChars = sentence.toCharArray();
        char[] searchChars = searchWord.toCharArray();

        int sentenceLength = sentenceChars.length;
        int searchLength = searchChars.length;

        int i = 0;
        while (i < sentenceLength) {
            boolean found = true;
            for (int j = 0; j < searchLength; j++) {
                if (i + j >= sentenceLength || sentenceChars[i + j] != searchChars[j]) {
                    found = false;
                    break;
                }
            }

            if (found) {
                result.append(replacementWord);
                i += searchLength;
            } else {
                result.append(sentenceChars[i]);
                i++;
            }
        }

        System.out.println("Replaced Sentence: " + result.toString());
    }
}
