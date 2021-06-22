package Trees;

public class InsertData 
{
	static ListNode root;
	
	InsertData()
	{
		root=null;
	}
	
	public static void main(String[] args) 
	{
		InsertData i=new InsertData();
		i.insertData(50);
		i.insertData(30);
		i.insertData(80);
		/*i.insert(40);
		i.insert(70);
		i.insert(60);
		i.insert(80);*/
		i.inOrder(root);
	}
	
	/*public void insert(int data)
	{
		root=insertData(root,data);
	}*/
	
	public void insertData(int data)
	{
		ListNode node=new ListNode();
		if(root==null)
		{
			node.value=data;
			root=node;
		}
		//return node;
		else
		{
			if(data<root.value)
			{
				node.value=data;
				root.left=node;
			}
			else
			{
				if(data>root.value)
				{
					node.value=data;
					root.right=node;
				}
			}
		}
		/*if(data<root.value)
		{
			root.left=insertData(root.left,data);
		}
		else
		{
			if(data>root.value)
			{
				root.right=insertData(root.right,data);
			}
		}
		return root;*/
	}
	
	public void inOrder(ListNode root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.println(root.value);
			inOrder(root.right);
		}
	}

}
