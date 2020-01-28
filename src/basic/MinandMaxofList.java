package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinandMaxofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = new ArrayList();
		
		li.add(2);
		li.add(12);
		li.add(3);
		li.add(7);
		li.add(1);
		

		findMin(li);
		findMax(li);

		System.out.println(findMin(li)+" "+findMax(li));
		
		findSecondMin(li);
		findSecondMax(li);
		
		System.out.println(findSecondMin(li)+" "
		+findSecondMax(li));

		niavewaymin(li);
	}

	private static void niavewaymin(List<Integer> li) {
		// TODO Auto-generated method stub
		Integer min=Integer.MAX_VALUE;
		
		for(Integer i:li) {
			if(i<min) {
				min=i;
			}
		}
		
		System.out.println(min);
	}

	private static Integer findSecondMax(List<Integer> li) {
		// TODO Auto-generated method stub

		Collections.sort(li);

		return li.get(1);
	}

	private static Integer findSecondMin(List<Integer> li) {
		// TODO Auto-generated method stub

		Collections.sort(li, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}

		});

		return li.get(1);
	}

	private static Integer findMax(List<Integer> li) {
		// TODO Auto-generated method stub
		Integer min = Collections.min(li);
		return min;
	}

	private static Integer findMin(List<Integer> li) {
		// TODO Auto-generated method stub
		Integer max = Collections.max(li);
		return max;
	}
	
	//

}
