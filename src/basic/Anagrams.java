package basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// check anagrams using hashmap

		String s1 = "geeksforgeeks";

		String s2 = "forgeeksgeeks";

		// abcd and dabc cbad all are same

		// 1) way to sort them and then compare both of them are same

		String[] split = s1.split("");

		List<String> asList = Arrays.asList(split);

		asList.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}

		});

		List<String> asList2 = Arrays.asList(s2.split(""));

		asList2.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}

		});

		System.out.println(asList.equals(asList2));

		// second way using hashmap

		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();

//		hm1.put('a', 1);
//		hm1.put('c', 3);
//		hm1.put('b', 2);
//		hm1.put('i', 4);

		// String[] split2 = s2.split("");

		char[] charArray = s2.toCharArray();
		char[] charArray2 = s1.toCharArray();

		// List<String> asList3 = Arrays.asList(split2);

		//Arrays.asList(s2.split("")).forEach(x -> System.out.println(x));

		for (int i = 0; i < asList2.size(); i++) {

			hm1.put(charArray[i], i);

		}
		for (int i = 0; i < charArray2.length; i++) {
			
			hm2.put(charArray2[i], i);
			
		}
		
		

		hm1.forEach((x, y) -> {
			System.out.println(x + " " + y);
		});
		hm2.forEach((x, y) -> {
			System.out.println(x + " " + y);
		});
		
		if(hm1.keySet().equals(hm2.keySet())) {
			System.out.println("They are Anagms");
		}else System.out.println("No they are not");

	}

}
