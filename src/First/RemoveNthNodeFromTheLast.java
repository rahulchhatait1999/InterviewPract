package First;

public class RemoveNthNodeFromTheLast {

	public static void main(String[] args) {

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		//node.next.next.next.next.next = node.next;
		
		Node head = removeElement(node,3);
		while(head!=null)
		{
			System.out.println(head.data);
			head = head.next;
		}
	}

	private static Node removeElement(Node node,int index) {
		
		Node dummy = new Node(0);
		dummy.next=node;
		Node start = dummy;
		Node end = dummy;

	//	Node newn =node;
		
		for(int i =0; i<index;i++)
		{
			end = end.next;
		}
		while(end!=null && end.next!=null)
		{
			start = start.next;
			end = end.next;
			
		}
		start.next = start.next.next;
		
		return dummy.next;
		
		
		
	}

}
