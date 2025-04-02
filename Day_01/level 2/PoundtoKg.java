import java.util.Scanner;
public class PoundtoKg{
	public static void main(String[] args){
		double km;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter weight(kg): ");
		int weight = input.nextInt();
		double pound = weight /2.2;
		System.out.println("The weight of the person in pound is "+String.format("%.2f",pound)+" and in kg is " + weight);
		input.close();
	}
}