package First;

import java.util.ArrayList;
import java.util.List;


 class Node{
	 int data;
	    Node next;

	    Node(int data) {
	    	this.data = data;
	        this.next = null;
		}
 }

public class ReverseLinkedList {

	public static void main(String[] args) {

	List<Integer> l1 = new ArrayList<>();
		
	 Node head = new Node(10);
     head.next = new Node(20);
     head.next.next = new Node(4);
     head.next.next.next = new Node(30);

		
		Node newHead = reverse(head);
		while(newHead!=null)
		{
			System.out.println(newHead.data);
			newHead=newHead.next;
		}
	}

	private static Node reverse(Node head) {
		
		Node next = null;
		Node prev = null;
		Node curr = head;
		
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev =curr;
			curr = next;
		}
		

		return prev;
		
	}
	

}
