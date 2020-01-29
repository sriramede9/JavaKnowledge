package basic;

public class StringContrainsNoNumber {

	public static void main(String[] args) {
		
		isStringOnlyAlphabet("Sri Ram Ede"); //true
		isStringOnlyAlphabet("Sri Ram Ede9");//false
		isStringOnlyAlphabet2("Sri Ram Ede9");//false

		System.out.println(isStringOnlyAlphabet("Sri Ram Ede"));
		System.out.println(isStringOnlyAlphabet("Sri Ram Ede9"));
		System.out.println(isStringOnlyAlphabet2("Sri Ram Ede9"));
	}

	//return true if string contains only string
	public static boolean isStringOnlyAlphabet(String str) 
	{ 
		return ((!str.equals("")) 
				&& (str != null) 
				&& (str.matches("^[a-zA-Z]*$"))); 
	} 
	//will return true if string containes number
	public static boolean isStringOnlyAlphabet2(String str) 
	{ 
		return ((!str.equals("")) 
				&& (str != null) 
				&& (str.matches(".*[0-9].*"))); 
	} 
	
	//https://stackoverflow.com/questions/4187356/regular-expression-to-extract-numbers-from-a-string
	//use reference to find numbers in a string
	
	
	//https://stackoverflow.com/questions/3180354/regex-check-if-string-contains-at-least-one-digit
}
