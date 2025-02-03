package java.lab.pkg1.pkg2;
import java.util.Scanner;

/* @author gvera14 */ 

public class JavaLab12 {

    /* @param args the command line arguments */
    public static void main(String[] args) {
        Scanner giovanni = new Scanner(System.in);
        
        System.out.print("Enter total miles driven per day: ");
        double milesPerDay = giovanni.nextDouble();
        
        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = giovanni.nextDouble();
        
        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = giovanni.nextDouble();
        
        System.out.print("Enter parking fees per day: ");
        double parkingFees = giovanni.nextDouble();
        
        System.out.print("Enter tolls per day: ");
        double tolls = giovanni.nextDouble();
        
        double dailyCost = calculateDrivingCost(milesPerDay, costPerGallon, milesPerGallon, parkingFees, tolls);
        System.out.println("Your daily driving cost is: $" + dailyCost);
    }
    
    static double calculateDrivingCost(double miles, double costPerGallon, double mpg, double parking, double tolls) {
        return (miles / mpg * costPerGallon) + parking + tolls;
    }
}
