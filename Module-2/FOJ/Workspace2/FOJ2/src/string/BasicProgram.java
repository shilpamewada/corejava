package string;

public class BasicProgram {

	public static void main(String[] args) {
		String name = "Shilpa Mewada";
		
		System.out.println(" last character in string is : " + name.charAt(name.length()-1) );
		
		System.out.println(  "the 5th index value is " + name.charAt(12));
		System.out.println(  "total  length " + name.length());
					//int indexOf(Char ch)

		int indexOfSpace = name.indexOf(' ');
		char charAtIndex = name.charAt(indexOfSpace + 1); 
		
		 System.out.println("index of first letter of second word is: " + name.charAt(indexOfSpace+1));
		 System.out.println(charAtIndex);
		 
			//	without using for loop 
		 System.out.print( name.charAt(0));
	        System.out.print( name.charAt(1));
	        System.out.print( name.charAt(2));
	        System.out.print( name.charAt(3));
	        System.out.print( name.charAt(4));
	        System.out.println( name.charAt(5));
	        
		 //print the first word  using for loop
//	        for (int i = 0; i < name.indexOf(' '); i++) {
//	            System.out.print(name.charAt(i));
	            
	       
                    // reverse of the name
	            String reverse = "";
	            for (int j = name.length() - 1; j >= 0; j--) {
	                reverse += name.charAt(j);
	            }
	            System.out.println("Reversed name: " + reverse);
	        
	        
	        //print the reverseof each word by maintaining the order of the words
	        
	        
	        }
	}
//}
		
		
		
		
		
		
	


