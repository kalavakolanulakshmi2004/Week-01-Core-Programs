import java.util.Scanner;
public class TempConv{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperatue(c): ");
		double celsius= input.nextInt();
		double fahrenheit=(celsius*9/5)+32;
		System.out.println(celsius+ " celsius is " +String.format("%.2f",fahrenheit)+" fahrenheit");
	}
}