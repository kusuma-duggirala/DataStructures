package SinglyLinkedList;

public class LinkedListReverse 
{

	
	static ListNode head;
	
	LinkedListReverse()
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
		//ll.printList(ll.head);
		LinkedListReverse llr=new LinkedListReverse();
		ListNode reverseHead=llr.reverseLinkedList(ll.head);
		ll.printList(reverseHead);
	}
	
	public ListNode reverseLinkedList(ListNode currNode)
	{
		ListNode prevNode=null;
		ListNode nextNode=null;
		while(currNode!=null)
		{
			nextNode=currNode.next;
			currNode.next=prevNode;
			prevNode=currNode;
			currNode=nextNode;
		}
		return prevNode;
	}
	
	 
	
}
