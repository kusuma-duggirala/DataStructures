package SinglyLinkedList;

public class LinkedListDeletion 
{
	ListNode head;
	
	LinkedListDeletion()
	{
		head=null;
	}
	
	public static void main(String[] args) 
	{
		LinkedListImpl ll=new LinkedListImpl();
		ll.addAtStart(5);
		ll.addAtStart(7);
		ll.addAtEnd(9);
		ll.addAtEnd(11);
		ll.deleteElementByKey(7);            //Deleting Head
		ll.deleteElementByKey(11);
		ll.deleteElementByIndex(1);
		ll.printList(ll.head);
	}
	
	public void deleteElementByKey(int key)
	{
		if(key==head.value)
		{
			head=head.next;
			System.out.println(key+" found and deleted");
		}
		else
		{
			ListNode currNode=head;
			ListNode prevNode=null;
			while(currNode.value!=key)
			{
				
				prevNode=currNode;
				currNode=currNode.next;
			}
			System.out.println("Previous Node value"+prevNode.value);
			System.out.println("Current Node Value"+currNode.value);
			prevNode.next=currNode.next;
		}
		
	}
	
	public void deleteElementByIndex(int index)
	{
		if(index<0)
		{
			System.out.println("Invalid index");
		}
		else
		{
			if(index==0)
			{
				head=head.next;
				System.out.println("Element at "+index+" index is deleted");
			}
			else
			{
				ListNode prevNode=head;
				ListNode currNode;
				System.out.println("Deleting element at index "+index);
				while(--index>0)
				{
					prevNode=prevNode.next;
				}
				currNode=prevNode.next;
				prevNode.next=currNode.next;
			}
		}
	}
}
