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
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<t;j++)
		{
			int u=sc.nextInt();
			int v=sc.nextInt();
			u=u-1;
			v=v-1;
			int res=0;
		
			for(int i=u-1;u<v-1;i++)
			{
				res=res^arr[i];
			}
			System.out.println(res);
		}
	}
}
