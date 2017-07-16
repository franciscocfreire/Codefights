package br.com.codefights.arrays;

import java.util.HashMap;

public class FirstDuplicate {	
	
	public int test(int[] a){
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for(int i = 0; i < a.length; i++){
			
			Integer test = hmap.get(a[i]);
			if(test == null){
				hmap.put(a[i], a[i]);
			}else{
				return a[i];
			}
			
			
		}
		return -1;		
	}
	
	public int test2(int[] a){
	    for(int i=0;i<a.length;i++){
	    	
	    	
	    	int x = Math.abs(a[i]);
	    			
	        if(a[Math.abs(a[i])-1]<0)
	            return Math.abs(a[i]);
	        else{
	            a[Math.abs(a[i])-1]=-a[Math.abs(a[i])-1];
	        }
	    }
	    return -1;
	}
}
