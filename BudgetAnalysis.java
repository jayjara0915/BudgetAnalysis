import java.util.Scanner;

/* 
   @author Jaymar Jaramillo
   @date 8/1/2022
*/

//Programming Challenge 16 from Chapter 4
//of Starting out with >>> Java, Tony Gaddis

public class BudgetAnalysis {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double budget, costs;
		double expenses = 0;
		
		System.out.print("Enter in a budget made for the month: ");
		budget = in.nextDouble();
		
		do {
			System.out.print("Enter in an expense made in the month "
							 + "or type 0 to quit: ");
			costs = in.nextDouble();
			
			expenses += costs;
		
		} while (costs != 0);
		
		if (expenses > budget) {
			double over = expenses - budget;
			System.out.printf("You are over budget by $%.2f\n", over);
		} 
		else if (expenses < budget) {
			double under = budget - expenses;
			System.out.printf("You are under budget by $%.2f\n", under);
		}	
	}
}