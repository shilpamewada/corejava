package Basicjava;

public class Demo6 {
	
	public static void main(String[] args) {
		
		String s = "25";
		byte b = Byte.parseByte(s);  //string to byte
		short sh = Short.parseShort(s);  //string to short
		int i = Integer.parseInt(s);    // string to integer
		long l = Long.parseLong(s);    // string to long
		
		//lower to higher
		
		System.out.println(" Stringvalue s : " + s);
		System.out.println(" Bytevalue b : " + b);
		System.out.println(" Shortvalue sh : " + sh);
		System.out.println(" intvalue i : " + i);
		System.out.println(" longvalue l : " + l);
		System.out.println();
		
		
		
		
		l = 450 ;
		i =  (int) l ;    //type casting to Int
		sh = (short) i ;  //type casting to short
		b = (byte) sh ;   // type casting to byte
		s = b + " " ;     // converting to string (any to string)
		
		//higher to lower
		
		System.out.println(" longvalue l : " + l);
		System.out.println(" intvalue i : " + i);
		System.out.println(" Shortvalue sh : " + sh);
		System.out.println(" Bytevalue b : " + b);
		System.out.println(" Stringvalue s : " + s);
		System.out.println();
		
	}

}

