package lect08_generic_types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class GenericsComparator {
	private Collection  collection1;
	private Collection  collection2;
	
	private boolean isLoneger(Collection c1, Collection c2) {
		return c1.size() > c2.size();
	}
	
	public static void main(String[] args) {
		GenericsComparator gp = new GenericsComparator();
		System.out.println(gp.isLoneger(
				new ArrayList(Arrays.asList(1,2,3,4)),
				new HashSet(Arrays.asList(4,5,6,7,8))
						));
		System.out.println(gp.isLoneger(
				new ArrayDeque(Arrays.asList(1,2,1,2,1,2,3,4)),
				new TreeSet()
						));
	}

}
