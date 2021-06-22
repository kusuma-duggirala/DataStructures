package Sorting;

import java.util.Scanner;

public class BubbleSort 
{
	static int size;
	static int temp;
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array:");
		size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter array elements:");
			arr[i]=sc.nextInt();
		}
		
		for(int i=1;i<size;i++)
		{
			for(int j=0;j<size-i;j++) //j<size-- gives Array Out of bound exception as arr[j+1] will be out of array size range.
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int k=0;k<size;k++)
		{
			System.out.println(arr[k]);
		}
		
		

	}

}
