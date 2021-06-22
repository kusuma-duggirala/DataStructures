package Stack;

import java.util.Stack;

public class BalancedBrackets 
{
	static String s="{{[[(())]]}}";
	public static void main(String[] args) 
	{
		BalancedBrackets bb=new BalancedBrackets();
		System.out.println(bb.isBalanced(s));

	}
	
	public boolean isBalanced(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		boolean flag = false;
		char c;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
			{
				stack.push(s.charAt(i));
				System.out.println("Element at "+i+" position "+s.charAt(i)+" pushed successfully");
			}
			
			if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}')
			{
				if(stack.isEmpty())
				{
					System.out.println("Returning false as stack is empty");
					return false;
				}
				else
				{
					c=stack.pop();
					if(c=='('&&s.charAt(i)==')')
					{
						System.out.println(c+" and "+s.charAt(i)+" are equal");
						//return true;
						flag=true;
					}
					else
					{
						if(c=='['&&s.charAt(i)==']')
						{
							System.out.println(c+" and "+s.charAt(i)+" are equal");
							//return true;
							flag=true;
						}
						else
						{
							if(c=='{'&&s.charAt(i)=='}')
							{
								System.out.println(c+" and "+s.charAt(i)+" are equal");
								//return true;
								flag=true;
							}
							else
							{
								System.out.println(c+" and "+s.charAt(i)+" are not equal");
								//return false;
								flag=false;
								return flag;
							}
						}
					}
				}
			}
		}
		if(stack.isEmpty()&&flag==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
