// Java Program to enter Marks of Five Subjects and Calculate Total
import java.util.Scanner; 

public class Percentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the marks of Five Students::\n");

        //To Store the values of five subjects
        float sub_1 = in.nextFloat();
        float sub_2 = in.nextFloat();
        float sub_3 = in.nextFloat();
        float sub_4 = in.nextFloat();
        float sub_5 = in.nextFloat();
        float total;
        float percentage;

        //Calculate the Total marks
        total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        percentage = (float)((total / 500.0) * 100);
      
        //It will produce the final output

        System.out.println("\nThe Total Marks = " + total + "/500.0");
        System.out.println("The Percentage = " + percentage + "%");
    }
    
}

