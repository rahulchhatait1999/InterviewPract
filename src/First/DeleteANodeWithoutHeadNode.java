package First;

public class DeleteANodeWithoutHeadNode {
	
	static void deleteNode(Node delNode) {
		
		
		if(delNode == null || delNode.next == null) return;
		
		delNode.data= delNode.next.data;
		delNode.next = delNode.next.next;
		
		
		
	}

	public static void main(String[] args) {

		Node node = new Node(10);
		node.next = new Node(20);
		node.next.next = new Node(4);
		node.next.next.next = new Node(30);
		
	     deleteNode(node.next);
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.next;
			
		}
		
		
	}

}
