package Loops;

public class Pyramidall4 {

	public static void main(String[] args) {
	        // Loop through the pyramid heights from 4 to 8 rows
	        for (int n = 4; n <= 8; n++) {
	            // Printing the pyramid pattern for the current height n
	            for (int i = 1; i <= n; i++) {
	                // Print spaces before stars
	                for (int j = i; j < n; j++) {
	                    System.out.print(" ");
	                }
	                // Print stars
	                for (int k = 1; k <= (2 * i - 1); k++) {
	                    System.out.print("*");
	                }
	                System.out.println();
	            }
	            System.out.println();  // Print a blank line between pyramids
	        }
	    }
	}


