import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.Scanner;
// gives a invoice for 5 items at a time

public class FruitCompany {
	public static void main(String[] args){
		String name="";
		String check="";
		double fruitPrice=0;
		int fruitNum;
		Scanner red=new Scanner(System.in);
		double sum=0;
		double sum1=0;
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;

		System.out.print("Enter 5 fruits and their price: ");

		while(count!=5) {
			name=red.next();
			fruitPrice=red.nextDouble();
			count++;
			System.out.print(name+" "+fruitPrice);
		}
		System.out.println();
		
		System.out.print("Do you want to enter more fruit?..Press Y to continue.. OR any key to quit");
		check=red.next();
		
		if(check.contains("Y")){
			System.out.print("Enter 5 fruits and their price: ");
			while(count1!=5) {
				name=red.next();
				fruitPrice=red.nextDouble();
				count1++;
				System.out.print(name+" "+fruitPrice);
			}}
		else
			
		System.out.println();
		System.out.println("END_PRICES");
		System.out.println();
		System.out.println("Enter the same fruits and their quantity");


		while(count2!=5) {
			name=red.next();
			fruitNum=red.nextInt();
			count2++;
			sum+=fruitNum;
			System.out.print(name+" "+fruitNum);
		}
		System.out.println();
		
		System.out.println("Do you need to create another invoice?.. Press Y for Yes.. OR any key to quit");
		check=red.next();
	
		if(check.contains("Y")){
			System.out.println("Enter fruits and their quantity");
			while(count3!=5) {
				name=red.next();
				fruitNum=red.nextInt();
				count3++;
				sum1+=fruitNum;
				System.out.print(name+" "+fruitNum);
			
		}}
		System.out.println();
		System.out.println("END_INVOICE");

		
			System.out.println("QUIT");
			System.out.println();
			System.out.printf("Invoice #1 Total: %.2f",sum);
			System.out.println();
			System.out.printf("Invoice #2 Total: %.2f",sum1);

		





		/*m1.put(red.next(),red.nextDouble());
	System.out.print(m1);
	m1.put(red.next(),red.nextDouble());
	System.out.print(m1);
	m1.put(red.next(),red.nextDouble());
	System.out.print(m1);*/





	}}

/* Map<String, String> objMap = new HashMap<String, String>();
objMap.put("Name", "Suzuki");
objMap.put("Power", "220");
objMap.put("Type", "2-wheeler");
objMap.put("Price", "85000");
System.out.println("Elements of the Map:");
System.out.println(objMap */
