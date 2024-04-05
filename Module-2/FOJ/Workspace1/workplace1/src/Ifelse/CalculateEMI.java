package Ifelse;

public class CalculateEMI {

	public static void main(String[] args) {
	
	        double loanAmount = 700000;
	        int numberOfMonths = 48;
	        double annualInterestRate = 12.0; 

	        double monthlyInterestRate = (annualInterestRate / 100) / 12;

	        double emi = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths));

	      
	        System.out.println("EMI for the car loan: Rs. " + (emi));
	    }
	}
