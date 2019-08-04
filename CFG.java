import java.io.*;
import java.util.Scanner;
public class GFG 
{ 
	
	// utility function for digit sum 
	static int digSum(int n) 
	{ 
		int sum = 0, rem = 0; 
		
		while (n>0) { 
			rem = n % 10; 
			sum += rem; 
			n /= 10; 
		} 
		
		return sum; 
	} 
	
	// function for finding x 
	static int findX(int n) 
	{ 
		
		// iterate from 1 to n. For every no. 
		// check if its digit sum with it is 
		// equal to n. 
		for (int i = 0; i <= n; i++) 
			if (i + digSum(i) == n) 
				return i; 
		
		// if no such i found return -1 
		return -1; 
	} 
	
	// Driver code 
	public static void main (String[] args) 
	{ Scanner sc=new Scanner(System.in);
		int n = sc.nextInt(); 
		System.out.println(1);
		System.out.println(findX(n)); 
	} 
} 

