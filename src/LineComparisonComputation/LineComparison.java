package LineComparisonComputation;

import java.util.Scanner;
public class LineComparison {
	
	public static void main(String[] args) {
		//Variables
		double lengthOfLine1=0.0;
		double lengthOfLine2=0.0;
		//UserInputs
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the line1x1 value : ");
		int line1x1 = sc.nextInt();
		System.out.print("Enter the line1y1 value : ");
		int line1y1 = sc.nextInt();
		System.out.print("Enter the line1x2 value : ");
		int line1x2 = sc.nextInt();
		System.out.print("Enter the line1y2 value : ");
		int line1y2 = sc.nextInt();
		System.out.print("Enter the line2x1 value : ");
		int line2x1 = sc.nextInt();
		System.out.print("Enter the line2y1 value : ");
		int line2y1 = sc.nextInt();
		System.out.print("Enter the line2x2 value : ");
		int line2x2 = sc.nextInt();
		System.out.print("Enter the line2y2 value : ");
		int line2y2 = sc.nextInt();
		
		
		//Computations
		
		lengthOfLine1=Math.sqrt(Math.pow((line1x2-line1x1),2)+Math.pow((line1y2-line1y1),2));
		lengthOfLine2=Math.sqrt(Math.pow((line2x2-line2x1),2)+Math.pow((line2y2-line2y1),2));
		String line1Length=String.valueOf(lengthOfLine1);
		String line2Length=String.valueOf(lengthOfLine2);
		System.out.println("Length Of the Line1 = " + line1Length);
		System.out.println("Length Of the Line2 = " + line2Length);
		if (line1Length.compareTo(line2Length) == 0) {
			System.out.println("Line1 length  is equal to Line2 ");
		}else if(line1Length.compareTo(line2Length) == -1) {
			System.out.println("Line1 length is less than line2 ");
		}else {
			System.out.println("Line1 length is greater than Line2");
		}
	}

}
