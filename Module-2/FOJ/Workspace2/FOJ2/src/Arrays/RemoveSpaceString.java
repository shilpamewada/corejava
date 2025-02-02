package Arrays;

public class RemoveSpaceString {
	public static String removeSpaces(String input) {
		char[] charArray = input.toCharArray();
		char[] result = new char[charArray.length];
		int index = 0;

		for (char c : charArray) {
			if (c != ' ' && c != '\t' && c != '\n' && c != '\r') {
				result[index++] = c; // Store non-whitespace character into result array
			}
		}
		// Create a new string from the result array with the correct length
		return new String(result, 0, index);
	}

	public static void main(String[] args) {
		String input = "Hello, world!";
		String output = removeSpaces(input);
		System.out.println(output);
	}
}
