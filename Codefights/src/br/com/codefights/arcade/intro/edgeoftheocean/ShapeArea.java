package br.com.codefights.arcade.intro.edgeoftheocean;

public class ShapeArea {

	public int shapeArea(int n) {
		
		int sum = 1;
		int total = 1;
		for(int i = 1; i < n; i++){
			sum = 2 + sum;
			total = sum + total;
		}
		
		for(int i = total; sum != 1; i++){
			sum = sum - 2;
			total = sum + total;
		}

		return total;
	}
	
	
	public int betterSolution(int n) {
		  return (n*n)+( (n-1)*(n-1) ); 
	}

	
	public static void main(String[] args) {
		
		int n = 5;		
		
		ShapeArea test = new ShapeArea();
		System.out.println(test.betterSolution(n));
		
	}
}
