/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=1;
		int count=0;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			x++;
			while(x!=0)
			{
				int rem=x%10;
				sum=sum+rem;
				x=x/10;
			}
			if(x+sum==n)
			{
				count++;
				System.out.println(x);
			}
			
			
		}
		System.out.println(count);
	}
}
