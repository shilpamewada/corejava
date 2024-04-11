package Arrays;

class SumCube{
	 public static int sumCubes(int n) {
	 //Write your code here
	 if(n<1){
	 throw new IllegalArgumentException("invalid");
	 }
	 int sum=(n*(n+1)/2);
	 return sum*sum;


	 }
	 public static void main(String[]args){
	 int n=3;
	 int result=sumCubes(n);
	 System.out.println(result+n);
	 }
	}
