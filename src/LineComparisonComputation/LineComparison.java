package LineComparisonComputation;

import java.util.*;
public class LineComparison {
	
	public static void main(String[] args) {
		//Variables
		double lengthOfALine=0;
		//UserInputs
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the x1 value : ");
		int x1 = sc.nextInt();
		System.out.print("Enter the y1 value : ");
		int y1 = sc.nextInt();
		System.out.print("Enter the x2 value : ");
		int x2 = sc.nextInt();
		System.out.print("Enter the y2 value : ");
		int y2 = sc.nextInt();
		
		//Computations
		
		lengthOfALine=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.println("Length Of the Line = " + lengthOfALine);
	}

}
