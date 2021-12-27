package week1.day2;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		int input=-987;
		
		if(input<0) {
			System.out.print("The number "+input);
			input=0-input;
			System.out.println(" is convertied to "+input);
		}
		else if(input > 0) {
			System.out.println(input+" is positive");
		}else {
			System.out.println(input+" is neither negative nor positive");
		}		
	}

}
