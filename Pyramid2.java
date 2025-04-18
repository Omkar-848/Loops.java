package Loops;
//Rightaligned Pyramid

public class Pyramid2 {

	
	    public static void main(String[] args) {
	        int n = 5;

	        for (int i = 1; i <= n; i++) {
	            // Printing spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Printing stars
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }

	            // Move to the next line
	            System.out.println();
	        }
	    }
	}


