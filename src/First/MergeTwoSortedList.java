package First;

public class MergeTwoSortedList {
	
	public static Node merge(Node list1 , Node list2)
	{
		if(list1 ==  null)return list2;
		if(list2 == null) return list1;
		Node current = new Node(0);
		Node merge = current;
		while(list1!=null && list2!=null)
		{
			if(list1.data>list2.data)
			{
				merge.next = list2;
				list2=list2.next;
			}
			else {
				merge.next = list1;
				list1=list1.next;
			}
			merge= merge.next;
		}
		if(list1!=null)merge.next = list1;
		if(list2!=null)merge.next = list2;
		
		return current.next;
	}

	public static void main(String[] args) {

		Node list1 = new Node(1);
		list1.next = new Node(2);
		list1.next.next = new Node(4);
		
		Node list2 = new Node(1);
		list2.next = new Node(3);
		list2.next.next = new Node(4);
		
		Node merge = merge(list1,list2);
		while(merge!=null)
		{
			System.out.println(merge.data);
			merge =merge.next;
		}
		
	}

}
