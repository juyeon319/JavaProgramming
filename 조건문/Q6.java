package ch1.조건문;

import java.util.Scanner;

/*
6. 369게임을 간단히 작성해보자. 1~99까지의 정수를 입력받고 정수에 3, 6, 9 중 하나가 
     있는 경우는 "박수짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라.
	
   -----------------------------	
   1~99 사이의 정수를 입력하시오>>36
     박수짝짝
   -----------------------------	
*/
public class Q6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = scan.nextInt();
		
		if(num>=1 && num <=99) {
			int tensPlace = num/10;
			int onesPlace = num%10;
		
			if((tensPlace==3 || tensPlace==6 || tensPlace==9) 
					&& (onesPlace==3 || onesPlace==6 || onesPlace==9)) {
				System.out.println("박수짝짝");
			}else if ((tensPlace==3 || tensPlace==6 || tensPlace==9) 
					|| (onesPlace==3 || onesPlace==6 || onesPlace==9)) {
				System.out.println("박수짝");
			}else {
				System.out.println("박수없음");
			}
		}
	}
}