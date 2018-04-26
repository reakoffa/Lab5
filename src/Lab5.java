import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int i = 1;
		long fac = 1;
		int num;
		String ans;
		
		// Anthony Reakoff, Lab 5, 4/26/18

		do {
			System.out.println("Please enter an integer from 1-9");
			num = scnr.nextInt();

			if (num > 9) {
				System.out.println("You did not follow directions");
			} else if (num < 1) {
				System.out.println("You did not follow directions");
			} else {

				for (i = 1; i <= num; i++) {
					fac = fac * i;
				}
				System.out.println("The factorial of " + num + " is " + fac);

			}
			System.out.println("Would you like to continue? Y/N");
			scnr.nextLine();
			ans = scnr.nextLine();
		} while (ans.equalsIgnoreCase("y"));
		
		System.out.println("Goodbye!");

	}

}
