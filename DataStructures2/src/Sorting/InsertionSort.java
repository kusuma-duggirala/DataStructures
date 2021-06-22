package Sorting;

import java.util.Scanner;

public class InsertionSort 
{
	static int size;
	static int temp;
	static int i;
	static int j;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array:");
		size=sc.nextInt();
		int[] arr=new int[size];
		for(i=0;i<size;i++)
		{
			System.out.println("Enter array elements:");
			arr[i]=sc.nextInt();
		}
		
		for(i=1;i<size;i++)
		{
			System.out.println("Value of i:"+i);
			temp=arr[i];
			for(j=i;j>0&&temp<arr[j-1];j--)
			{
				System.out.println("Value of j:"+j);
				arr[j]=arr[j-1];
			}
			System.out.println("Value of j outside:"+j);
			arr[j]=temp;
		}
		
		for(int k=0;k<size;k++)
		{
			System.out.println(arr[k]);
		}

	}

}
