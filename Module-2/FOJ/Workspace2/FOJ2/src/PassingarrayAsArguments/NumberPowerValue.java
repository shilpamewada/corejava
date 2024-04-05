package PassingarrayAsArguments;

public class NumberPowerValue {


	public static int powerValueOfNum(int num , int pow){
		int result = 1;

		for( int i =0; i < pow; i++){
			result *= num;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(powerValueOfNum(3,4));
	}

}
