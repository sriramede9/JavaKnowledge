package basic;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abba";
		String s2 = "geek";
		// reverse a string
		// using String Buffer
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		System.out.println(sb);

		String s1rev = sb.toString();

		if (s1.equals(s1rev)) {
			System.out.println("They are palindrome");
		} else
			System.out.println("Nope!!");

		// without using StringBuffer

		char[] charArray = s1.toCharArray();

//	for(char c:charArray) {
//		System.out.println(c);
//	}

		char rev[] = new char[charArray.length];
		
		//reverse chararray and add it to rev array

		for (int i = charArray.length; i > 0; i--) {

			// System.out.println(charArray[i-1]);

			rev[i - 1] = charArray[charArray.length - i];

		}

		//checking reversed array
//		for (char re : rev) {
//			System.out.println(re);
//		}
		
//converting char to string
		String revss = new String(rev);
		
		if(s1.equals(revss)) {
			System.out.println("thye are PalinDrome");
		}
		else System.out.println("They are not Palindrome!!");

	}

}
