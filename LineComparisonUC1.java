package LinePackage;
import java.util.Scanner;

public class LineComparisonUC1 {

	public static void main(String[] args) {
		double linelength =0.0;
		Scanner linecompare = new Scanner(System.in);
		System.out.println("enter the data for line comparison");
		int X1 = linecompare.nextInt();
		int Y1 = linecompare.nextInt();
		int X2 = linecompare.nextInt();
		int Y2 = linecompare.nextInt();
		linelength = Math.sqrt((X2-X1)^2 + (Y2-Y1)^2);
		System.out.println("the value is " + linelength );
		linecompare.close();
	}

}
