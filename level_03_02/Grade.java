import java.util.*;
public class Grade {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of students:");
       int n = sc.nextInt();
       float[] marks = new float[n];
       double[] percentages = new double[n];
       String[] grades = new String[n];
       float[] maths = new float[n];
       float[] chem = new float[n];
       float[] phy = new float[n];
       System.out.println("Enter marks of  maths:");
       for (int i = 0; i < n; i++) {
           maths[i] = sc.nextFloat();
           if (maths[i] < 0) {
               do {
                   System.out.println("Enter positive value");
                   maths[i] = sc.nextFloat();
               } while (maths[i] < 0);
           }
       }
       System.out.println("Enter marks of  chemistry:");
       for (int i = 0; i < n; i++) {
           chem[i] = sc.nextFloat();
           if (maths[i] < 0) {
               do {
                   System.out.println("Enter positive value");
                   chem[i] = sc.nextFloat();
               } while (chem[i] < 0);
           }
       }
       System.out.println("Enter marks of  physics:");
       for (int i = 0; i < n; i++) {
           phy[i] = sc.nextFloat();
           if (maths[i] < 0) {
               do {
                   System.out.println("Enter positive value");
                   phy[i] = sc.nextFloat();
               } while (phy[i] < 0);
           }
       }
       for(int i=0;i<n;i++){
           marks[i]=chem[i]+maths[i]+phy[i];
       }
       for (int i = 0; i < n; i++) {
           double avg = marks[i] / 3;
           percentages[i] = avg ;
           if (percentages[i] >= 80) {
               grades[i] = "A";
           } else if (percentages[i] >= 70 && percentages[i] <= 79) {
               grades[i] = "A";
           } else if (percentages[i] >= 60 && percentages[i] <= 69) {
               grades[i] = "A";
           } else if (percentages[i] >= 50 && percentages[i] <= 59) {
               grades[i] = "A";
           } else if (percentages[i] >= 40 && percentages[i] <= 49) {
               grades[i] = "A";
           } else {
               grades[i] = "R";
           }
       }
       for (int i = 0; i < n; i++){
           System.out.println("Student " + i + 1 + " marks :" + marks[i] + " percentage :" + percentages[i] + "%  grades :" + grades[i]);
       }
   }
}