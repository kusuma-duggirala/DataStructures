package Search;

import java.util.Scanner;

public class BinarySearch 
{

	static int size;
	static int temp;
	static int i;
	static int j;
	static int low;
	static int high;
	static int mid;
	static int key;
	static boolean flag=false;
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
		
		//Sort the array
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("Sorted array Elements are:");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter the element to search: ");
		key=sc.nextInt();
		
		low=0;
		high=size;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			System.out.println("Mid is: "+mid);
			if(key==arr[mid])
			{
				System.out.println("Element found at position:"+mid);
				break;
			}
			else
			{
				if(key<arr[mid])
				{
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
		}
		
		if(low>high)
		{
			System.out.println("Element not found");
		}

	}

}
