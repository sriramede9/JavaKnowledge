package basic;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(1);
		ts.add(2);
		ts.add(4);
		ts.add(3);
		ts.add(3);
		
		descendingTreeSet(ts);
	}

	private static void descendingTreeSet(TreeSet<Integer> ts) {
		// TODO Auto-generated method stub
		
		ts.stream().forEach(x->System.out.println(x));
		
		Iterator<Integer> descendingIterator = ts.descendingIterator();
		
		descendingIterator.forEachRemaining(x-> System.out.println(x));
	}

}
