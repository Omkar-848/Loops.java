package Loops;

public class Pyramid1 {

	    public static void main(String[] args) {
	        int n = 5; // Number of rows

	        // Outer loop for each row
	        for (int i = 1; i <= n; i++) {
	            // Printing spaces before stars in each row
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" "); // Printing space
	            }

	            // Printing stars in each row
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*"); // Printing star
	            }

	            // Move to the next line after each row
	            System.out.println();
	        }
	    }
	}
	
	

