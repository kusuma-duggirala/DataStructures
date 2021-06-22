package Search;

public class BinarySearchRecursion 
{

	int low;
	int high;
	int mid;
	static int[] arr={1,2,3,4,5,6};
	static int res;
	static int len;
	
	public static void main(String[] args) 
	{
		BinarySearchRecursion bs=new BinarySearchRecursion();
		len=arr.length;
		res=bs.binarySearchRecursion(arr,0,len-1,8);
		if(res==-1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at position: "+res);
		}
	}
	
	public int binarySearchRecursion(int arr[],int low,int high,int key)
	{
		if(low<=high)
		{
			mid=(low+high)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			else
			{
				if(key<arr[mid])
				{
					return binarySearchRecursion(arr,low,mid-1,key);
				}
				else
				{
					return binarySearchRecursion(arr,mid+1,high,key);
				}
			}
		}
		return -1;

	}

}
