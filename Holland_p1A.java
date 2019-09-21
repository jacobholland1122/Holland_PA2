import java.util.Scanner;

public class Holland_p1A {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		System.out.println("Enter four integers");
		
		num1 = scnr.nextInt();
		num2 = scnr.nextInt();
		num3 = scnr.nextInt();
		num4 = scnr.nextInt();
		
		num1 = (num1 + 7) % 10;
		num2 = (num2 + 7) % 10;
		num3 = (num3 + 7) % 10;
		num4 = (num4 + 7) % 10;
		
		System.out.print(num3 + " " + num4);
		System.out.print(" " + num1 + " " + num2);
		
		scnr.close();
	}

}
