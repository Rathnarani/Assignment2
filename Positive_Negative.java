package positive_negative;

import java.util.Scanner;

public class Positive_Negative {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number you want to check:");
	        n = s.nextInt();
	        if(n > 0)
	        {
	            System.out.println("The given number "+n+" is Positive");
	        }
	        else if(n < 0)
	        {
	            System.out.println("The given number "+n+" is Negative");
	        }
	        else
	        {
	            System.out.println("The given number "+n+" is neither Positive nor Negative ");
	        }
	}

}


