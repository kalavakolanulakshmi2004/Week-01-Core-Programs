import java.util.Scanner;
public class DigitFreq{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int[] freq = new int[10];
		int temp = (num < 0) ? -num : num;
		while (temp > 0) {
            int digit = temp % 10; 
            freq[digit]++;   
            temp /= 10;             
        }
		System.out.println("Digit Frequency is: ");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " appears " + freq[i] + " times.");
            }
        }
    }
}