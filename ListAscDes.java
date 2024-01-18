package org.task;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListAscDes {
	public static void main(String[] args) {
		List<Integer> l= Arrays.asList(10,100,20,1,23,67,900,34);
		Collections.sort(l);
		System.out.println("Ascending order:"+l);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Descending order:"+l);
		
		List<String> l2= Arrays.asList("Novotel","Citadine","Taj","IBIS");
		Collections.sort(l);
		System.out.println("Ascending order:"+l2);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Descending order:"+l2);
	}

}
