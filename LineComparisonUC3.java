package LinePackage;

import java.util.Scanner;

public class LineComparisonUC3 {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		double linelength = 0.0;
		Scanner linecompare = new Scanner(System.in);
		System.out.println("enter the data for line comparison");
		int X1 = linecompare.nextInt();
		int Y1 = linecompare.nextInt();
		int X2 = linecompare.nextInt();
		int Y2 = linecompare.nextInt();
		A = Y1 - X1;
		B = Y2 - X2;
		if (A == B) 
			System.out.println("Both the Lines Are Equal");
		
		else if (A<B)
			System.out.println("First line is Smaller Than The Second");
		else if (A>B)
			System.out.println("First line is Greater Than The Second");
		else
			System.out.println("Both Are Different");
		linecompare.close();
		
		
	}

}
