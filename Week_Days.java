package days;

import java.util.Scanner;

public class Week_Days {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);
		 int day=5;

         System.out.println("Enter the day :");
         reader.nextLine();
         switch(day)
        {
            case 1: 
                System.out.println("First day of the week!");
                break;
            case 2:
                System.out.println("Second day of the week!");
                break;
            case 3:
              
              
            case 4:
                System.out.println("Mid day of the week!");
                break;
            case 5:
                System.out.println("Last working day!");
                break;
            default:
                System.out.println("Week end!");
                break;
        }
	}

}  
