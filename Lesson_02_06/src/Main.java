//code to learn inputs and outputs in java

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        double studentGPA = 3.45;
        String studentFirstName = "Nicolas";
        String studentLastName = "Sousa";
        System.out.println(studentFirstName + " " +
                studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " +
                studentLastName + " has a GPA of " + studentGPA);
    }
}
