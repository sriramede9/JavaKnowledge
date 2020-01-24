package basic;

public class PairsofVowelsinString {
	
	
	//works but has better solution

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aeoui";
		int count;
		
		//how to find how many pairs exists.
		
		//i have to split and pair all of them
		
		//let's do this in pairs
		//System.out.println(s.substring(0, 2));
		
		int countresp=0;
		for(int i=0;i<s.length()-1;i++) {
	//	System.out.println(s.substring(i, i+2));
		
			 countresp=	count(s.substring(i, i+2));
		}
		
		//now write swith case.
		
		System.out.println(countresp);
		
		//better approach
		
		String s2 = "abaebio"; 
        int n = s2.length(); 
        System.out.print(vowelPairs(s, n)); 

	}
	
	static int totalvowelpairs=0;

	private static int count(String string) {  
		
		// TODO Auto-generated method stub
		
		//aeiou ae,ai,ao,au,
		//		ea,ei,eo,eu,
		//ia,ie,io,iu,
		//oa,oe,oi,ou,
		//ua,ue,ui,uo
		
		switch(string) 
        { 
            case "ae": 
                System.out.println("ae"); 
			totalvowelpairs++;
                break; 
            case "ai": 
            	System.out.println("ai"); 
            	totalvowelpairs++;
            	break; 
            case "ao": 
            	System.out.println("ao"); 
            	totalvowelpairs++;
            	break; 
            case "au": 
            	System.out.println("au"); 
            	totalvowelpairs++;
            	break; 
            	//pairs with e
            case "ea": 
            	System.out.println("au"); 
            	totalvowelpairs++;
            	break; 
            case "ei": 
            	System.out.println("au"); 
            	totalvowelpairs++;
            	break; 
            case "eo": 
            	System.out.println("au"); 
            	totalvowelpairs++;
            	break; 
            case "eu": 
            	System.out.println("au"); 
            	totalvowelpairs++;
            	break; 
            	//pairs with i
            case "ia": 
            	System.out.println("ia"); 
            	totalvowelpairs++;
            	break; 
            case "ie": 
            	System.out.println("ie"); 
            	totalvowelpairs++;
            	break; 
            case "io": 
            	System.out.println("io"); 
            	totalvowelpairs++;
            	break; 
            case "iu": 
            	System.out.println("iu"); 
            	totalvowelpairs++;
            	break; 
            	
            	//pairs with o
            case "oa": 
            	System.out.println("oa"); 
            	totalvowelpairs++;
            	break; 
            case "oe": 
            	System.out.println("oe"); 
            	totalvowelpairs++;
            	break; 
            case "oi": 
            	System.out.println("oi"); 
            	totalvowelpairs++;
            	break; 
            case "ou": 
            	System.out.println("ou"); 
            	totalvowelpairs++;
            	break; 
            	
            	//pairs with u
            	
            case "ua": 
            	System.out.println("ua"); 
            	totalvowelpairs++;
            	break; 
            case "ue": 
            	System.out.println("ue"); 
            	totalvowelpairs++;
            	break; 
            case "ui": 
            	System.out.println("ui"); 
            	totalvowelpairs++;
            	break; 
            case "uo": 
            	System.out.println("uo"); 
            	totalvowelpairs++;
            	break; 
           
            default: 
               // System.out.println("no match"); 
        
        }
		
		return totalvowelpairs;
	}
	
	//better solution
	
	 // Function that return true 
    // if character ch is a vowel 
    static boolean isVowel(char ch) 
    { 
        switch (ch) { 
        case 'a': 
        case 'e': 
        case 'i': 
        case 'o': 
        case 'u': 
            return true; 
        default: 
            return false; 
        } 
    } 
  
    // Function to return the count of adjacent 
    // vowel pairs in the given string 
    static int vowelPairs(String s, int n) 
    { 
        int cnt = 0; 
        for (int i = 0; i < n - 1; i++) { 
  
            // If current character and the 
            // character after it are both vowels 
            if (isVowel(s.charAt(i)) && isVowel(s.charAt(i + 1))) 
                cnt++; 
        } 
  
        return cnt; 
    } 
	
	

}
