package Loops;

public class Nestedforloop {

	
	    public static void main(String[] args) {
	        // Outer loop (rows)
	        for (int i = 1; i <= 3; i++) {
	            // Inner loop (columns)
	            for (int j = 1; j <= 3; j++) {
	                System.out.print(i + "," + j + "  "); // Printing the values of i and j
	            }
	            System.out.println(); // To move to the next line after each row
	        }
	    }
	}


