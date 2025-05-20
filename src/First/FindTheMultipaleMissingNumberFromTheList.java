package First;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheMultipaleMissingNumberFromTheList {

	public static void main(String[] args) {
	List<Integer> l1 = new ArrayList<>();
		
		l1.add(1);
		l1.add(5);
		l1.add(4);
		l1.add(3);
		l1.add(5);
		l1.add(8);
		l1.add(3);
		
         try {
			for(int n :  findMissing(l1))
			 {
				System.out.println(n); 
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static List<Integer> findMissing(List<Integer> l1) throws Exception {
		
		try {
			Set <Integer>s1 = new HashSet<Integer>(l1);
			List<Integer> l2 = new ArrayList<>();
			
			int max = Collections.max(l1);
			int min = Collections.min(l1);
			
			
			for( int i = min;i<=max;i++)
			{
				if(!s1.contains(i))
				{
					l2.add(i);
				}
			}
			

			return l2;
			
			
		}catch(Exception e)
		{
			throw new Exception(e);

		}
		
	}

}
