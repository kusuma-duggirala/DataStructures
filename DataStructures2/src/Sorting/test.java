package Sorting;

public class test 
{
	static int j;
	static int i;
	public static void main(String[] args) 
	{
		/*for(i=1;i<3;i++)
		{
			System.out.println("Value of i:"+i);
			for(j=i;j>0;j--)
			{
				System.out.println("Value of j:"+j);
			}
			System.out.println("Value of j outside:"+j);
		}*/
		
		for(i=1;i<3;i++)
		{
			System.out.println("Value of i:"+i);
			for(j=i;j>0&&j==1;j--)
			{
				System.out.println("Value of j:"+j);
			}
			System.out.println("Value of j outside:"+j);
		}
	}

}
