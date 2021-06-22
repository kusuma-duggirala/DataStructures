package Sorting;

import java.util.Scanner;

public class SelectionSort 
{
	static int size;
	static int temp=0,temp2=0;
	static int i;
	static int j;
	static int min;
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
		
		/*for(i=0;i<size-1;i++)
		{
			min=arr[i];
			for(j=i+1;j<size;j++)
			{
				
				if(arr[j]<min)
				{
					min=arr[j];
					temp2=j;
				}
				
			}
			System.out.println("Minimum element:"+min);
			//System.out.println("Temp2: "+temp2);
			temp=arr[i];
			arr[i]=min;
			arr[temp2]=temp;
		}*/
		
		for(i=0;i<size;i++)
		{
			min=i;
			for(j=i+1;j<size;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(int k=0;k<size;k++)
		{
			System.out.println(arr[k]);
		}
		
		/*min=arr[i];
		for(j=1;i<size;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum element:"+min);*/

	}

}
