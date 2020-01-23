package basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksforgeeks";
		// find occurence of char e

		// 1 normal for loop

		char c[] = s.toCharArray();
		int count = 0;

		// using tochar Array and use if.
		for (int i = 0; i < c.length; i++) {

			if (c[i] == 'e') {
				System.out.println(c[i]);
				count++;
			}

		}

		System.out.println("No of \t" + "e" + "\t are \t" + count);

		System.out.println(count(s, 'e')); //using Regex

	}

	// using regex

	// Method that returns the count of the given
	// character in the string
	public static long count(String s, char ch) {

		// Use Matcher class of java.util.regex
		// to match the character
		Matcher matcher = Pattern.compile(String.valueOf(ch)).matcher(s);

		int res = 0;

		// for every presence of character ch
		// increment the counter res by 1
		while (matcher.find()) {
			res++;
		}

		return res;
	}

}
