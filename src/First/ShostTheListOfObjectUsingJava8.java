package First;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShostTheListOfObjectUsingJava8 {

	public static void main(String[] args) {
List<Integer> l1 = new ArrayList<>();
		
		l1.add(1);
		l1.add(5);
		l1.add(4);
		l1.add(3);
		l1.add(5);
		l1.add(8);
		l1.add(3);
		
		List <Integer>l2 = l1.stream().sorted().collect(Collectors.toList());
		for(int n : l2)
		{
			System.out.println(n);
		}
	}

}
