package edu.cgcc.cs161;


/* PSEUDOCODE
 * Program start
 * Define a,b, and q
 * Use logic AND gate
 * Use logic OR gate
 * Use logic NAND gate
 * Program end
 */



public class ExcersiseTwo {

	public static void main(String args[]) {
	
	int a = 10;
	int b = 15;
	int q = 20;{
	
	//Logic AND gate	
		
	if (a+b<=q) {
	System.out.println ("true1");

	}
	
	if (a+b>q) {
	System.out.println ("false1");
	
	
	//Logic OR gate

	if (a<b || b>q) {
		System.out.println ("true2");
	
	if (a>b || b<q) {
		System.out.println ("false2");
		
		
	// Logic NAND gate
		
        System.out.println("!(a < b) = " + !(a < b)); 
	    System.out.println("!(a > b) = " + !(a > b)); 

	
	}}}}}}
