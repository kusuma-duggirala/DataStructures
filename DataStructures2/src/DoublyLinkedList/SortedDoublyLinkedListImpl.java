package DoublyLinkedList;

public class SortedDoublyLinkedListImpl 
{
	ListNode head;
	
	SortedDoublyLinkedListImpl()
	{
		head=null;
	}
	
	public static void main(String[] args) 
	{
		SortedDoublyLinkedListImpl sdll=new SortedDoublyLinkedListImpl();
		sdll.insertElement(5);
		sdll.insertElement(2);
		sdll.insertElement(3);
		sdll.insertElement(8);
		sdll.printList();
	}
	
	public void insertElement(int data)
	{
		if(head==null||head.value>data)
		{
			ListNode node=new ListNode();
			node.value=data;
			node.next=head;
			node.prev=null;
			if(head!=null)
			{
				  head.prev=node;
			}
			head=node;
		}
		else
		{
			ListNode node=new ListNode();
			node.value=data;
			ListNode prevNode=head;
			while(prevNode.next!=null&&prevNode.next.value<data)
			{
				prevNode=prevNode.next;
			}
			node.next=prevNode.next;
			prevNode.next=node;
			node.prev=prevNode;
		}
	}
	
	public void printList()
	{
		ListNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
	}

}
