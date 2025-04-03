package level3;
import java.util.*;
public class NumCheck {
    public static int countdigits(int num) {
        int count = 0;
        if (num == 0) {
            return 1;
        }
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    public static int[] digitArr(int num, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }
    public static boolean isDuck(int[] digits){
        if(digits[0]==0){
            return false;
        }
        for(int i=1;i<digits.length;i++){
            if(digits[i]==0){
                return true;
            }
        }
        return false;
    }
    public static boolean isAmstrong(int[] digits, int num){
        int sum = 0;
        for(int i=0;i<digits.length;i++){
            sum += Math.pow(digits[i],digits.length);
        }
        return sum == num;
    }
    public static int[] largest(int[] digits){
        int Large = Integer.MIN_VALUE;
        int scndLarge = Integer.MIN_VALUE;
        for(int i=0;i<digits.length;i++){
            if(digits[i]>Large){
                scndLarge = Large;
                Large = digits[i];
            }
            else if(digits[i] > scndLarge && digits[i]!=Large){
                scndLarge = digits[i];
            }
        }
        return new int[] {Large,scndLarge};
    }
    public static int[] smallest(int[] digits){
        int small=Integer.MAX_VALUE;
        int scndSmall = Integer.MAX_VALUE;
        for(int i=0;i<digits.length;i++){
            if(digits[i]<small){
                scndSmall = small;
                small = digits[i];
            }
            else if(digits[i] < scndSmall && digits[i] != small){
                scndSmall = digits[i];
            }
        }
        return new int[] {small,scndSmall};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = countdigits(num);
        int[] digits = digitArr(num, count);
        boolean Duck = isDuck(digits);
        System.out.println("Is Duck Number: "+ Duck);
        boolean Amstrong = isAmstrong(digits, num);
        System.out.println("Is Amstrong Number: " + Amstrong);
        int[] LargeandScndLarge = largest(digits);
        System.out.println("Largest digit: "+LargeandScndLarge[0]);
        System.out.println("Second Largest digit: "+LargeandScndLarge[1]);
        int[] SmallandScndSmall = smallest(digits);
        System.out.println("Smallest digit: "+SmallandScndSmall[0]);
        System.out.println("Second Smallest digit: "+SmallandScndSmall[1]);
    }
}