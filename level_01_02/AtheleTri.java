import java.util.Scanner;
public class AtheleTri{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter side 1: ");
		int s1 = input.nextInt();
		System.out.print("Enter side 2: ");
		int s2 = input.nextInt();
		System.out.print("Enter side 3: ");
		int s3 = input.nextInt();
		double perimeter = s1+s2+s3;
		int distance = 5 *1000;
		int rounds=(int)(distance / perimeter);
		System.out.println("The total number of rounds the athelete will run is "+rounds+" to complete 5 km");
	}
}