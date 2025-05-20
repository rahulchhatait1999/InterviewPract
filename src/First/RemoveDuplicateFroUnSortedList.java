package First;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFroUnSortedList {
	
	public static Node removeDuplicate(Node n)
	{
		
		Set <Integer>s1 = new HashSet<>();
		Node curr = n;
		Node prev = null;
		while(curr!=null)
		{
			if(!s1.contains(curr.data))
			{
				prev = curr;
				s1.add(curr.data);
			}else {
				prev.next = curr.next;
				
			}
			curr =curr.next;
			
			
		}
		
		return n;
	}

	public static void main(String[] args) {

		Node n1 = new Node(10);
		n1.next =  new Node(5);
		n1.next.next = new Node(3);
		n1.next.next.next = new Node(3);
		n1.next.next.next.next = new Node(6);
		n1.next.next.next.next.next = new Node(5);

		Node after = removeDuplicate(n1);
		
		while(after!=null)
		{
			System.out.println(after.data);
			after=after.next;
		}
	}

}
