package collectionsFramework;

import java.util.LinkedList;

public class linked {
	public static void main(String[] args) {
		LinkedList<Float> numbers = new LinkedList<>();
		numbers.add(5.67f);
		numbers.add(3.67f);
		numbers.add(52.67f);
		numbers.add(435.67f);
		
		for(Float el : numbers) {
			System.out.println(el);
		}
	}
}
