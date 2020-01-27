package basic;

public class StringConcat {

	//how concat is diff than +
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Sri";
		System.out.println(s+"Sri");
		System.out.println(s.concat("Sri"));
		
		String s2="sri";
		String s3="";
		s2.concat(s3);
		System.out.println(s2);
		System.out.println(s2+"");
		
		System.out.println("-------------");
		
		System.out.println(s2.equals(s2+""));
		
//		
//		concat() method takes concatenates two strings and return new string object only string length is greater than 0, otherwise it returns same object.
//				+ operator creates a new string object every time irrespective of length of string.
		
		if(s2== s2+"") {
			System.out.println("my + is going to same string pool");
		}
		else System.out.println("no It is not"); //---> Output
		
		if(s2==s2.concat("")) {
			System.out.println("my + is going to same string pool"); //---> Output
		}
		else System.out.println("no It is not"); 
		}
	

}
