package Loops;

public class Numberp1 {

	
	    public static void main(String[] args) {
	        // Loop to print each line with increasing numbers
	        for (int i = 1; i <= 7; i++) {
	            // Print numbers from 1 to i in each line
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println(); // Move to the next line after printing numbers
	        }
	    }
	}


