package br.com.codefights.arcade.intro.edgeoftheocean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class MakeArrayConsecutive2 {
	public int makeArrayConsecutive2(int[] statues) {
		
		SortedSet<Integer> sSet = new TreeSet<>();		
		sSet.addAll(new ArrayList<Integer>(){{for(int i :statues ) add(i);}});		
		Integer previous = null;
		Integer current = null;
		Integer totalStatues = 0;
		for(Integer i : sSet){
			if(current != null){
				current = i;
				Integer space =  current- previous;
				
				totalStatues =  totalStatues  + (space - 1);
				previous = current;
				
			}else{
				current = i;
				previous = i;
			}
		}
		return totalStatues;

	}
	
	//It's not cover duplicate scenario
	public int betterSolution(int[] a) {
	    Arrays.sort(a);
	    int n = a[a.length-1] - a[0];
	    return n - a.length + 1;
	}

	public static void main(String[] args) {
		
		int[] inputArray = {6,2,3,8};
		int[] inputArray2 = {1,2, 2, 4};
		
		MakeArrayConsecutive2 test = new MakeArrayConsecutive2();
		System.out.println(test.makeArrayConsecutive2(inputArray));
		System.out.println(test.betterSolution(inputArray));
		
	}
}
