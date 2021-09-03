import java.util.Arrays;

public class PrimeNumber {
	
	public static boolean primeOrNot(int numberToCheck) {
		if(numberToCheck==0 || numberToCheck==1) {
			return false;
		}
		else
		{
			for(int index=2; index<=numberToCheck/2; index++) {
				if(numberToCheck%index==0) 
					return false;
			}
			return true;
		}      
	}  
	
	public static int[][]  primeNumbers(int start, int end) {
		
		int[][] primeNumArray=new int[10][100];
		
		for(int i=start;i<=end;i++) {
			if(primeOrNot(i))
				primeNumArray[i/100][i%100]=i;
			
		}
		return primeNumArray;
	}
	
	public static void printPrimeNumbers(int[][] primeArray) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<100;j++) {
				if(primeArray[i][j]!=0)
					System.out.print(primeArray[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
			
	

	public static void main(String[] args) {
		int[][] primeArray=primeNumbers(0, 1000);
		printPrimeNumbers(primeArray);

	}

}
