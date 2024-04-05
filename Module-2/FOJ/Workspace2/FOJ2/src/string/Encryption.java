package string;

public class Encryption{

	public static void main(String[] args) {
		String plaintext = "NAVYA";
		int shift = 1;
		System.out.println("Encrypted text: " + encrypt(plaintext, shift));
	}

	public static String encrypt(String plaintext, int shift) {
	    String ciphertext = "";
	    for (int i = 0; i < plaintext.length(); i++) {
	        char ch = plaintext.charAt(i);

	        if (ch >= 'A' && ch <= 'Z') {
	            ch = (char) ((ch - 'A' + shift) % 26 + 'A');
	        } else if (ch >= 'a' && ch <= 'z') { 
	            ch = (char) ((ch - 'a' + shift) % 26 + 'a');
	        }
	        // Leave other characters unchanged
	        ciphertext += ch;
	    }
	    return ciphertext;
	}
	

}

