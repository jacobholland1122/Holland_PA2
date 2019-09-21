import java.util.Scanner;

public class Holland_p2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int formulaChoice;
		double BMI = 0;
		
		System.out.println("Which formula would you like to use?");
		System.out.println("1. BMI = (703 * weightInPounds) / (Math.pow(heightInInches, 2.0))");
		System.out.println("2. BMI = weightInKilograms / Math.pow(heightInMeters, 2.0)");
		formulaChoice = scnr.nextInt();
		
		
		if(formulaChoice == 1) {
			System.out.println("Enter your weight in pounds: ");
			System.out.println("Enter your height in inches: ");
			double weightInPounds = scnr.nextDouble();
			double heightInInches = scnr.nextDouble();
			BMI = (703 * weightInPounds) / (Math.pow(heightInInches, 2.0));
		}
		
		else if(formulaChoice == 2) {
			System.out.println("Enter your weight in kilograms: ");
			System.out.println("Enter your height in meters: ");
			double weightInKilograms = scnr.nextDouble();
			double heightInMeters = scnr.nextDouble();
			BMI = weightInKilograms / Math.pow(heightInMeters, 2.0);
		}
		
		System.out.print("" + BMI);
		System.out.println("");
		
		if(BMI < 18.5) {
			System.out.println("You are underweight.");
		}
		else if(BMI >= 18.5 && BMI <= 24.9) {
			System.out.println("You are normal.");
		}
		else if(BMI >= 25 && BMI <= 29.9) {
			System.out.println("You are overweight.");
		}
		else if(BMI >= 30) {
			System.out.println("You are obese.");
		}
		scnr.close();
	}
}
