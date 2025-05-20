package First;

public class deleteNodesWhichHaveAGreaterValueOnRightSide {
	
	public static void removeData(Node node)
	{
		if(node == null) return;
		Node curr = node;
		Node prev = null;
		
		while(curr!=null)
		{
			prev = curr;
			if(curr.data<curr.next.data)
			{
				curr = curr.next;
				prev.next = curr.next.next ;
			}
			curr = curr.next;
		}
	}

	public static void main(String[] args) {


		Node n1 = new Node(12);
		n1.next = new Node(15);
		n1.next.next = new Node(10);
		n1.next.next.next = new Node(11);
		n1.next.next.next.next = new Node(5);
		n1.next.next.next.next.next = new Node(6);
		n1.next.next.next.next.next.next = new Node(2);
		n1.next.next.next.next.next.next.next = new Node(3);
		
		




	}

}
