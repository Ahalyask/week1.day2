package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int input = 4554;
		int original=input;
		int n, sum = 0;
		while(input != 0){
			n=input%10;
			sum=(sum*10)+n;
			input=input/10;
		}
		if(original==sum) {
			System.out.println(original+" is Palindrome number");
		}else {
			System.out.println(original+" is not plaindrome");
		}

	}

}
