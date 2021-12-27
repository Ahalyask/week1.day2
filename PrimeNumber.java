package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		 int input=3;
		 boolean flag=false;
		 
		 if(input==1) {
			 System.out.println(input+" is not prime"); 
		 }else {
		 
		 for(int i=2;i<input/2;i++) {
			 if(input%i ==0) {
				 flag=true;
				 break;
			 }			 
		}
		 if(flag==true) {
		 System.out.println(input+" is not prime");
		 }else {
			 System.out.println(input+" is prime");

		 }

	}
	}

}
