package edu.cgcc.cs161;

/* PSEUDOCODE
 * Create FLoating point variable
 * Make system print zero if number is zero
 * Make system print positive or negative is number is positive or negative
 * Make system print small or large if number is less than 1 or greater than 1000000
 * Program end
 */


public class ExerciseOne {
	public static void main(String args[]) {
		
		
		float Number = 0F;
		
		if (Number < 0)
			
		    System.out.println("Negative");
		
		if (Number > 0)
			
			System.out.println ("Positive");
		 
		if (Number == 0)
			System.out.println ("zero");
		
		if (Number < 1)
			System.out.println ("Small");
		
		if (Number > 1000000)
			System.out.println ("Large");
	}
}
