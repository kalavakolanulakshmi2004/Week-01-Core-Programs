import java.util.Scanner;
public class OddEven{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a natural number: ");
        int number = input.nextInt();
		if(number<=0){
			System.out.println("Error");
			return;
		}
		int[] even=new int[number/2+1];
		int[] odd=new int[number/2+1];
		int evenindex=0;
		int oddindex=0;
		for(int i=1;i<=number;i++){
			if (i % 2 == 0) {
                even[evenindex++] = i;  
            } else {
                odd[oddindex++] = i;   
            }
        }
        System.out.println("Even Numbers: ");
        for (int i = 0; i < evenindex; i++) {
            System.out.println(even[i] + " ");
        }
		System.out.println("Odd Numbers: ");
		for (int i = 0;i < oddindex; i++){
			System.out.println(odd[i]+" ");
		}
	}
}