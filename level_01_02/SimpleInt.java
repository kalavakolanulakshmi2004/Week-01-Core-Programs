import java.util.Scanner;
public class SimpleInt{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter principal: ");
		int principal = input.nextInt();
		System.out.print("Enter rate: ");
		int rate = input.nextInt();
		System.out.print("Enter time: ");
		int time = input.nextInt();
		int SimpleInterest = (principal* rate * time)/100;
		System.out.println("The Simple Interest is "+SimpleInterest+" for Principal "+principal+", Rate of Interest " +rate+" and Time "+time);
	}
}