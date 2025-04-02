import java.util.Scanner;
public class Mul6to9{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number to print its multiplication table: ");
        int number = input.nextInt();
        int[] arr = new int[4];
		for(int i=6;i<=9;i++){
			arr[i-6] = number*i;
		}
		System.out.println("Multiplication Table for " + number + "is :");
		for(int i=6;i<=9;i++){
			System.out.println(number + " * " +i+" = "+arr[i-6]);
		}
	}
}