package First;

import java.util.LinkedList;
import java.util.List;

public class MultiplyTwoNumberReprasentByLinkedList {

	public static void main(String[] args) {

		Node n1 = new Node(1);
		n1.next = new Node(3);
		n1.next.next = new Node(2);
		n1.next.next = new Node(10);
		n1.next.next = new Node(25);

		
		Node n2 = new Node(3);
		n2.next = new Node(1);
		n2.next = new Node(9);

		
		int val = multiplay(n1,n2);
		System.out.println(val);
	}

	private static int multiplay(Node n1, Node n2) {
		if(n1==null || n2 == null) return 0;
		int first =0;
		int secend = 0;
		
		while(n1!=null)
		{
			first = first+n1.data;
			n1=n1.next;
		}
		
		while(n2!=null)
		{
			secend = secend+n2.data;
			n2=n2.next;
		}
		
	//	System.out.println(first+"  ,  "+secend);
		
		return first*secend;
		
	}

}
