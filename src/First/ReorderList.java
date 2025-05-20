package First;
//Input: head = [1,2,3,4,5]
//Output: [1,5,2,4,3]
//
public class ReorderList {
	
	public static void reorder(Node node)
	{
		if(node == null)return ; 
		Node first = node;
		Node last  = node;
		while(last!=null && last.next!=null)
		{
			first = first.next;
			last = last.next.next;
		}
		Node prev = null;
		Node curr = first.next;
		first.next = null;
		
		while(curr!=null)
		{
			Node newNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = newNode;
			
		}
		Node firstNode = node;
		Node secendNode = prev;
		
		while(firstNode!=null && secendNode!=null)
		{
			 Node tmp1 = firstNode.next;
			 Node tmp2 = secendNode.next;
			 firstNode.next = secendNode;
			 secendNode.next = tmp1;
	            firstNode = tmp1;
	            secendNode = tmp2;
		}
		
	}
	
	   public static void printList(Node head) {
	        while (head != null) {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	        System.out.println();
	    }


	public static void main(String[] args) {

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		printList(node);
		reorder(node);
		printList(node);

		
	}

}
