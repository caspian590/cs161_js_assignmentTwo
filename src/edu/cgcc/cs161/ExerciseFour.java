package edu.cgcc.cs161;

/* PSEUDOCODE
 * Program start
 * Create int Number
 * Create limits between 0 and 100
 * Create if parameters for < 50 and > 50
 * Program end
 */

public class ExerciseFour {
	public static void main(String args[]) {
		
	
		int Number = 64; 
		
		if ((Number < 0) || (Number > 100))
	        throw new IllegalArgumentException("value is out of range for anumber");
	   
		if (Number>50)
			System.out.println ("Pass");
		
		if (Number<50)
			System.out.println ("Fail");
		
		
		
		
		
		
		
}
}