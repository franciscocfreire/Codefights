package br.com.codefights.arcade.intro.edgeoftheocean;

import br.com.codefights.arcade.intro.thejourneybegins.CheckPalindrome;

public class AdjacentElementsProduct {
	
	public int adjacentElementsProduct(int[] inputArray) {
		
		int product = Integer.MIN_VALUE;
		Integer productAux = Integer.MIN_VALUE;
		for(int i = 0; i < inputArray.length; i++){
			if( i + 1 >= inputArray.length){
				return product;
			}else{
				productAux = inputArray[i] * inputArray[i+1];
				if(productAux > product)
					product = productAux;
				
			}
			
		}
			
		return 0;

	}
	
	public static void main(String[] args) {
		
		int[] inputArray = {3,6,-2,-5,7,3};
		int[] inputArray2 = {-23, 4, -3, 8, -12};
		
		AdjacentElementsProduct test = new AdjacentElementsProduct();
		System.out.println(test.adjacentElementsProduct(inputArray2));
		
	}
}
