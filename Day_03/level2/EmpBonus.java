import java.util.Scanner;
public class EmpBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonusAmount = new double[10];
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            while (true) {
                System.out.print("Enter salary: ");
                salary[i] = input.nextDouble();
                if (salary[i] > 0) break;  
                System.out.println("Invalid salary! Please enter a valid salary.");
            }
            while (true) {
                System.out.print("Enter years of service: ");
                yearsOfService[i] = input.nextDouble();
                if (yearsOfService[i] >= 0) break;  
                System.out.println("Invalid years of service! Please enter a valid number.");
            }
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05;  
            } else {
                bonusAmount[i] = salary[i] * 0.02;  
            }
            newSalary[i] = salary[i] + bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonusAmount[i];
        }        
        System.out.println("\n");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
