import java.util.Scanner;
public class main {
    /*
Anna Valdez
31 August 2022
This program will find the perrimiter and the area of a square
*/
        public static void main (String[] args){

            System.out.println("This program will calculate the perimeter and area of a square"); //Prints description of program

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the length of a side of your square: "); // Prompts user to input length of a side of a square
            double length = input.nextDouble();

            double area = length*length; // Calculates area
            double perimeter = 4*length; // Calculates Perimeter

            System.out.println("We can calculate the perimeter of a square with the formula: perimeter = 4*(length of a side)");

            System.out.println("The perimeter of the square = "+ perimeter);

            System.out.println("We can calculate the area of the square with the formula: area = (length of a side)^2");

            System.out.println("The area of the square = "+ area);


        }//main
    }//class

