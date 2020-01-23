package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "This is the text to be searched " + "for occurrences of the http:// pattern.";

		String regex = ".*http://.*";
		String regex2 = "^This.*";
		String regex3 = "[a-z]";
		
		//https://www.rexegg.com/regex-quickstart.html helpful

		boolean matches = Pattern.matches(regex3, text);
		
		//java String with regex methods
		
		String text1 = "one two three two one";

		boolean matches1 = text1.matches(".*two.*");
		
		

		System.out.println("matches = " + matches1);
		
		
		//count occurence of is
		
		String text3    =
		        "This is the text which is to be searched " +
		        "for occurrences of the word 'is'.";

		String regex4 = "is";

		Pattern pattern = Pattern.compile(regex4);
		Matcher matcher = pattern.matcher(text);

		int count = 0;
		while(matcher.find()) {
		    count++;
		    System.out.println("found: " + count + " : "
		            + matcher.start() + " - " + matcher.end());
		}
		
		
		
		
		//experiment on String
		
		//String ss="Testing this with regex";
		
		String[] split = text1.split("two");
		
		String s2="";
		for(String s:split) {
			 s2=s2+s;
		}
		
		System.out.println(s2);
	
		
		
		
	}

}
