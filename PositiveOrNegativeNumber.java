package week1.day2;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		int input=-78;
		
		if(input<0) {
			System.out.println(input+" is negative");			
		}
		else if(input > 0) {
			System.out.println(input+" is positive");
		}else {
			System.out.println(input+" is neither negative nor positive");
		}
	}

}
