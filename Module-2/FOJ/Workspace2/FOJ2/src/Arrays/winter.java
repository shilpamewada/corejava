package Arrays;

public class winter {

		    public static String getWearAdvice(String s, int t) {
		    	 if ((t < 0) && (s.equals("Winter"))) {
		             return "Wear a heavy coat.";
		         }
		         if ((t > 0 && t < 30) && (s.equals("Winter"))) {
		             return "Wear a jacket.";
		         }
		         if ((t > 30) && (s.equals("Summer"))) {
		             return "Wear light clothing.";
		         }
		         if ((t < 30) && (s.equals("Summer"))) {
		             return "A t-shirt is fine.";
		         }
		         if (s.equals("Spring") || s.equals("Fall")) {
		             return "Wear a sweater or light jacket.";
		         }
		         // Return a default value if none of the conditions match
		         return "Invalid season or temperature.";

		     }

		     public static void main(String[] args) {
		         System.out.println(getWearAdvice("Winter", -5)); // Example usage
		     }
		 }