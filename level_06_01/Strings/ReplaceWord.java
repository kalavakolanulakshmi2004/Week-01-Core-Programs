package Strings;
import java.util.*;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to be replaced: ");
        String oldWord = sc.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();
        String replacedSentence = sentence.replace(oldWord, newWord);
        System.out.println("Modified String: " + replacedSentence);
    }
}
