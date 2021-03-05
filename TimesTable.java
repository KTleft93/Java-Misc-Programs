import java.io.*;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		int num,i=0;
		int sum=0;
		int count=0;
		int ans[] = new int[12];
		
		System.out.println("Enter a number between 1 and 100: ");

        //Initialize num[] array with user input
        for(i=0; i < 1; i++){
           num=reader.nextInt();
          
           ans[0]=num*1;
           ans[1]=num*2;
           ans[2]=num*3;
           ans[3]=num*4;
           ans[4]=num*5;
           ans[5]=num*6;
           ans[6]=num*7;
           ans[7]=num*8;
           ans[8]=num*9;
           ans[9]=num*10;
           ans[10]=num*11;
           ans[11]=num*12;
         
		
		for(int c=0;c<12;c++) {
		
		System.out.println(ans[c]+" ");
	}
        }
}
}
