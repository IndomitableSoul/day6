package day6;

public class PS1 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int nextNum = 0;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=0;i<5;i++) {
			nextNum = num1+num2;
			System.out.println(nextNum);
			num1 = num2;
			num2 = nextNum;
		}
	}
}
