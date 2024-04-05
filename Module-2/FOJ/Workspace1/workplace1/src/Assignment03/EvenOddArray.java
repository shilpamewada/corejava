package Assignment03;

public class EvenOddArray {

	public static void main(String[] args) {
		 int num[] = {1,2,3,4,5,6};
		 
		 for(int i = 0 ; i < num.length ; i++){
			  if(num[i]%2==0){
				  System.out.println(num[i] +  " it is a even number ");
			  }else{
				  System.out.println( num[i] + " it is a odd number");
			  }
		 }
	}

}
