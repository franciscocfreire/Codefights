package br.com.codefights.arcade.intro.thejourneybegins;

public class CheckPalindrome {
	public boolean checkPalindrome(String inputString){
		
		int j = inputString.length() - 1;
		for(int i = 0; j != 0; i++){
		
			if(inputString.charAt(i) != inputString.charAt(j)){
				return false;
			}
			j--;
		}
		
		
		return true;
	}
	
	public boolean betterSolution(String inputString){
		
		return  inputString.equals(new StringBuilder(inputString).reverse().toString());
	}
	
	
	public static void main(String[] args) {
		
		String inputString = "hlbeeykoqqqqokyeeblh";
		CheckPalindrome test = new CheckPalindrome();
		System.out.println(test.betterSolution(inputString));
		
	}
}
