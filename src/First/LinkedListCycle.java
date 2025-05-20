package First;

public class LinkedListCycle {
	
	public static boolean isCycle(Node node)
	{
		if(node == null || node.next == null) return false;
		Node first = node;
		Node last = node;
		while(last != null && last.next!=null)
		{
			first = first.next;
			last = last.next.next;
			if(first == last)
			{
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(5);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = node.next;

		System.out.println(isCycle(node));
	}

}
