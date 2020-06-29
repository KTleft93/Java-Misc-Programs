import java.util.*;
public class ExceptionLab {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		int [] numbers = new int [100];
	 {	
		for (int i = 0; i < 100; i++)
		{
			numbers [i] = (int)(Math.random() * 100 + 1);
		}
		System.out.println("Enter an index value from 0 to 99");
		int index = reader.nextInt();

		
	try {	System.out.println( numbers [index]);
		
	} 
	catch (ArrayIndexOutOfBoundsException ex) {
		System.out.println("Invalid Index\n " + 
	" The array can only hold 100 elements");
	}
	
	finally {
		for(int i=0;i<numbers.length;i++) 
		{
			if(i%20==0) 
				System.out.println();
			System.out.print(numbers[i]+" ");
		
		}
		}
	}
	}
}

	
	


