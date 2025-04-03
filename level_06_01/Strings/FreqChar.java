package Strings;
import java.util.*;
public class FreqChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int[] freq = new int[256];
        for(int i=0;i<str.length();i++) {
            freq[str.charAt(i)]++;
        }
        char mostFreqChar=' ';
        int max=0;
        for(int i=0;i<256;i++) {
            if(freq[i]>max) {
                max=freq[i];
                mostFreqChar=(char)i;
            }
        }
        System.out.println("Most Frequent Character: '"+mostFreqChar+"'");
    }
}
