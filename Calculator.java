import java.util.Scanner;

//A addition, subtraction, division, and multiplication calculator
public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("Enter 1st number:");
		Scanner red=new Scanner(System.in);
		int num1=red.nextInt();
		System.out.println("Enter 2nd number:");
		int num2=red.nextInt();
		String op="";
		System.out.println("Select your operation: ");
		op=red.next();
		if (op.equals("+")) {
		System.out.print("Answer:"+ (num1+num2));
		}
		if (op.equals("-")) {
			System.out.print("Answer:"+ (num1-num2));
			}
		if (op.equals("/")) {
			System.out.print("Answer:"+ (num1/num2));
			}
		if (op.equals("*")) {
			System.out.print("Answer:"+ (num1*num2));
			}
		else {
			System.out.println("ERROR");
		}
		
	}

}
