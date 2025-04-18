package Loops;

public class Pyramid3 {

	// LeftAlignedPyramid 
	    public static void main(String[] args) {
	        int n = 5;

	        for (int i = 1; i <= n; i++) {
	            // Printing stars
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }

	            // Move to the next line
	            System.out.println();
	        }
	    }
	}


