package day6;

import java.util.Scanner;

public class PS4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scanner.nextInt();//123
		int rev = 0;
		while(num>0) {
		int rem = num%10;
		rev = (rev*10)+rem;
		num = num/10;
		}
		System.out.println("Its reverese is: " +rev);
		scanner.close();
	}	
}
