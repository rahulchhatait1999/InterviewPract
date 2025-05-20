package First;

import java.util.ArrayList;
import java.util.List;

public class FindTheMissingNumberInAUnSortedList {
	
	public static int findMissing(List<Integer> l1)
	{
		int size = l1.size()+1;
		
		int expactedSum = (size*(size+1))/2;
		System.out.println(expactedSum);
		int currentSum = 0;
		for(Integer a : l1)
		{
			currentSum = currentSum + a;		
			
		}
		System.out.println(currentSum);
		
		return expactedSum-currentSum;
		
	}

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(5);
		l1.add(1);
		l1.add(4);
		l1.add(3);
		
		System.out.println(findMissing(l1));
		

		
	}

}
