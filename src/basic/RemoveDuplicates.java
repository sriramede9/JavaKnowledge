package basic;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<>();
		li.add(1);
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(3);
		li.add(4);
		
		removeDuplicates(li);
	}

	private static void removeDuplicates(List<Integer> li) {
		// TODO Auto-generated method stub
		
		List<Integer> li2=new ArrayList<>();
		
		for(Integer i:li) {
			if(li2.contains(i)) {
				continue;
			}else li2.add(i);
		}
		
		li2.stream().forEach(x->System.out.println(x));
	}
}
