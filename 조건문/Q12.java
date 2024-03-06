package ch1.조건문;

import java.util.Scanner;

/*
12. 사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 연산자는 +, -, *, /의 네 가지로 하고
       피연산자는 모두 실수로 한다. 피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다.
    0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
    
    ---------------------------
       연산>>2 + 4
    2+4의 계산 결과는 6
    ---------------------------
*/
public class Q12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연산>>");
		int num1 = scan.nextInt();
		String op = scan.next();
		int num2 = scan.nextInt();
		
		//(1)연산 식을 구분할 때 if-else 문을 이용하여 프로그램을 작성하라.
		if(op.equals("+")) {
			System.out.println(num1 + op + num2 + "의 계산 결과는 " + (num1+num2));
		}else if(op.equals("-")) {
			System.out.println(num1 + op + num2 + "의 계산 결과는 " + (num1-num2));
		}else if(op.equals("*")) {
			System.out.println(num1 + op + num2 + "의 계산 결과는 " + (num1*num2));
		}else if(op.equals("/")) {
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
				System.out.println(num1 + op + num2 + "의 계산 결과는 " + (num1/num2));
			}
		}else {
			System.out.println("잘못된 연산자 입니다.");
		}
		
		//(2)연산 식을 구분할 때 switch 문을 이용하여 프로그램을 작성하라.
		switch (op) {
		case "+":
			System.out.println(num1 + op + num2 + "의 계산 결과는 " + (num1+num2));
			break;
		case "-":
			System.out.println(num1 + op + num2 + "의 계산 결과는 " + (num1-num2));
			break;
		case "*":
			System.out.println(num1 + op + num2 + "의 계산 결과는 " + (num1*num2));
			break;
		case "/":
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
				System.out.println(num1 + op + num2 + "의 계산 결과는 " + (num1+num2));
			}
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
		}
	}
}
