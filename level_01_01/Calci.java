import java.util.Scanner;
public class Calci{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num1:");
		double num1=input.nextDouble();
		System.out.println("Enter num2:");
		double num2=input.nextDouble();
		double add=num1+num2;
		double sub=num1-num2;
		double mul=num1*num2;
		double div=num1/num2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and " + num2+" is "+ add+", "+sub+", "+mul+" , and "+div);
		input.close();
	}
}