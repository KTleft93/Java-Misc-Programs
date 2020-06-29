
public class LabRecursion1 {

	public static void main(String[] args) {
		System.out.println(raiseBaseToExp(5,2));
		mystery3(5);
		System.out.println();
		System.out.println(mystery(4));
	}
	public static int raiseBaseToExp(int base, int exp) {
		if(exp==0)
			return 1;
		//5-1=4
		//4-1=3
		//3-1=2
		//2-1=1
		//1-1=0
		//return 1
		else
			return base*raiseBaseToExp(base,exp-1);
		
}
	public static void mystery3 (int n)
	{
	if (n > 0)
	{
		//n=5   5
		//5-1=4 4
		//4-1=4 3
		//3-1=2 2
		//2-1=1 1
		//1-1=0 skips 0 goes up one
		
	System.out.print(n + " ");
	mystery3(n - 1);
	} }
	
	public static int mystery(int n) { 
		
		if (n==1)
		// 4-1=3 3*27=81
		// 3-1=2 3*9=27
		// 2-1=1 3*3=9
				//RETURN 3
			
			
			
			
			return 3;
	return 3 * mystery (n-1);
}
	public static void mystery2 (int n) {
		if (n > 0) {
		mystery3(n - 1);
		System.out.print(n + " "); } }
}