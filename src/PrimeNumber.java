import java.util.Arrays;
import com.bridgelabz.stacksandqueues.*;;
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
	
	static boolean checkAnagram(String num1, String num2)
	{

		char[] str1=num1.toCharArray();
		char[] str2=num2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		str1.toString();
		str2.toString();
		if((new String(str1)).equals(new String(str2)))
			return true;
		else
			return false;
	}
	
	static void anagram() {
		int[] primes=new int[200];
		int index=0;
		MyStack<Integer> stack=new MyStack<>();
		for(int start=0;start<=1000;start++)
			if(primeOrNot(start))
				primes[index++]=start;
		
		for(int i=0;i<primes.length;i++) {
			for(int j=i+1;j<primes.length-1;j++) {
				if(primes[i]!=0) {
					if(checkAnagram(primes[i]+"", primes[j]+"")) {
						Node<Integer> node1=new Node<>(primes[i]);
						Node<Integer> node2=new Node<>(primes[j]);
						stack.push(node1);
						stack.push(node2);
					}
				}
			}
		}
		stack.popAll();
		
	}
	

	public static void main(String[] args) {
		int[][] primeArray=primeNumbers(0, 1000);
		printPrimeNumbers(primeArray);
		anagram();

	}

}
