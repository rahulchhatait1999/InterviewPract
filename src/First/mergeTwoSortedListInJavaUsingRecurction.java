package First;

public class mergeTwoSortedListInJavaUsingRecurction {

	public static void main(String[] args) {

		Node list1 = new Node(1);
		list1.next = new Node(2);
		list1.next.next = new Node(4);
		
		Node list2 = new Node(3);
		list2.next = new Node(5);
		list2.next.next = new Node(6);
		
		Node merge = merge(list1,list2);
		while(merge!=null)
		{
			System.out.println(merge.data);
			merge =merge.next;
		}

	}

	private static Node merge(Node list1, Node list2) {
		
		if(list1 == null && list2 == null) return null;
		
		if(list1 == null) return list2;
		if(list2 == null) return list1;
		
		if(list1.data<list2.data)
		{
			list1.next = merge(list1.next,list2);
			return list1;
		}else {
			list2.next = merge(list1,list2.next);
			return list2;
		}
		
		
	}

}
