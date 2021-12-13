package day6;

import java.util.Scanner;

public class PS5 {
	static Scanner scanner = new Scanner(System.in);
    public static void randomNumberGenerator(int[] coupons) {
    	for(int i=0;i<coupons.length;i++) {
			
			int randomNum = (int)Math.floor(Math.random()*20000);
			coupons[i] = randomNum;
		}
    	System.out.println("Your Coupons Are:");
    	for (int i=0;i<coupons.length;i++) {
    		System.out.println(coupons[i]);
    	}
    }
	public static void main(String[] args) {
		
		System.out.println("How many coupon numbers do you want to generate: ");
		int size = scanner.nextInt();
		
		int[] coupons = new int[size];
		randomNumberGenerator(coupons);
		
		
		

	}

}
