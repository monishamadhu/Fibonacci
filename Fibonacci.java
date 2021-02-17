package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private static	final int MAX_TERM_VALUE =10000;
	public void run() {
	
		int temp0 = 0;	//temporary storage for first value
		int temp1 = 1;	//temporary storage for second value
		int term = temp0+temp1; // to store the sum of previous 2 values
		System.out.println("This program lists the Fibonacci Sequence.");
		System.out.println(temp0);
		System.out.println(temp1);
		
		while(term<MAX_TERM_VALUE) { //enters the loop only if the term is less than the max limit
			System.out.println(term);
		    temp0 = temp1; 
			temp1= term;
			term = temp0+temp1 ;	
		}
	}
}

