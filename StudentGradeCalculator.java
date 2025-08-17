import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Subjects: ");
        int n = sc.nextInt();

        // int[] marks = new int[n];
        int totalMarks = 0;

        for(int i = 1;i<=n; i++){
            System.out.print("Enter marks for Subject " + i + "(out of 100): ");
            double marks = sc.nextInt();
        
        while(marks <0 || marks>100){
             System.out.println("Invalid Marks.Please enter a valid marks.");
             System.out.println("Enter marks for Subject " + i + "(out of 100): ");
             marks = sc.nextInt();
        }
        totalMarks += marks;
        }
        System.out.println("\nStudent Result: ");
        System.out.println("Total marks obtained in all Subjects: "+ totalMarks);

        double AvgPer = totalMarks/n;
        System.out.println("Average Percentage: "+AvgPer);

        if(AvgPer >= 90 && AvgPer <=100){
            System.out.println("\nYour grade: A+! You Pass...");
        }
        else if(AvgPer >= 80 && AvgPer < 90){
            System.out.println("\nYour grade: B+! You Pass...");
        }
        else if(AvgPer >= 70 && AvgPer < 80){
            System.out.println("\nYour grade: B! You Pass...");
        }
        else if(AvgPer >= 60 && AvgPer < 70){
            System.out.println("\nYour grade: C+! You Pass...");
        }
        else if(AvgPer >= 50 && AvgPer < 60){
            System.out.println("\nYour grade: C! You Pass...");
        }
        else if(AvgPer >= 40 && AvgPer < 50){
            System.out.println("\nYour grade: D+! You Pass...");
        }
        else if(AvgPer >= 33 && AvgPer < 40){
            System.out.println("\nYour grade: D! You Pass...");
        }
        else{
            System.out.println("\nYour grade: F! You Fail...");
        }

       sc.close();
    }

}
