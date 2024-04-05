package Arrays;

public class FitnessApp {
	
	public static int findMinimum(int[]heartrate){
		int minheart = heartrate[0];
		for(int i =1 ; i < heartrate.length; i++){
			if(heartrate[i] < minheart){
				minheart =heartrate[i];
			}
		}
		return minheart;
	}

	public static void main(String[] args) {
	
		int[] heartrate = {80, 75, 70, 65, 60};
        int minheart = findMinimum(heartrate);
        System.out.println("Minimum heart rate recorded: " + minheart);
	}

}
