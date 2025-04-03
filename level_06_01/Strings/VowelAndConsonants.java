package Strings;
import java.util.*;
public class VowelAndConsonants {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int vowelcnt =0, consonantcnt=0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if(ch=='a' || ch =='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowelcnt++;
                    }
                else{
                    consonantcnt++;
                }
            }
        }
        System.out.println("Vowels count: "+ vowelcnt);
        System.out.println("Consonants count: "+ consonantcnt);
    }
}