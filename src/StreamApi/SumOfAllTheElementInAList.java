package StreamApi;

import java.util.Arrays;
import java.util.List;

public class SumOfAllTheElementInAList {

	public static void main(String[] args) {
		
		List <Integer> l1 = Arrays.asList(5,8,7,1,5,6);
		int sum  = l1.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);

	}

}
