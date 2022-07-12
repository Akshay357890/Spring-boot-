package repo;

import java.util.ArrayList;
import java.util.List;

public class productRepo {
	public static void main (String arg[])
	{
		List<Integer> elements = new ArrayList<Integer>();
		
		elements.add(2);
		elements.add(30);
		elements.add(10);
		elements.add(34);
		elements.add(90);
		elements.add(100);
		elements.add(8);
		System.out.println(elements);
		elements.removeIf(e -> e>30);
		System.out.println(elements);

		
		
		
	}

}
