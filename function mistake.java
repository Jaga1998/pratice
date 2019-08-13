import java.io.*;
import java.util.Scanner;
class Solution
{
	static int gcd(int arr[],int l,int r)
	{
		int k=arr[l];
		int f=arr[r];
		int gcd=1;
		for(int i=0;i<=k&& i<=f;i++)
		{
			if(k%i==0&&f%i==0)
			gcd=i;
		}
		return gcd;
	}
	public static void main(String args[])
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
			int l=sc.nextInt();
			int r=sc.nextInt();
			l=l-1;
			r=r-1;
			int result=gcd(arr,l,r);
			System.out.println(result);
		}
	}
}
