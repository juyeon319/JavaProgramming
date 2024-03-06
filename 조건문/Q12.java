package ch1.���ǹ�;

import java.util.Scanner;

/*
12. ��Ģ ������ �Է¹޾� ����ϴ� ���α׷��� �ۼ��ϰ��� �Ѵ�. �����ڴ� +, -, *, /�� �� ������ �ϰ�
       �ǿ����ڴ� ��� �Ǽ��� �Ѵ�. �ǿ����ڿ� �����ڴ� ���� ��ʿ� ���� �� ĭ���� �и��Ͽ� �Է��Ѵ�.
    0���� ������ �� "0���� ���� �� �����ϴ�."�� ����ϰ� �����Ѵ�.
    
    ---------------------------
       ����>>2 + 4
    2+4�� ��� ����� 6
    ---------------------------
*/
public class Q12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����>>");
		int num1 = scan.nextInt();
		String op = scan.next();
		int num2 = scan.nextInt();
		
		//(1)���� ���� ������ �� if-else ���� �̿��Ͽ� ���α׷��� �ۼ��϶�.
		if(op.equals("+")) {
			System.out.println(num1 + op + num2 + "�� ��� ����� " + (num1+num2));
		}else if(op.equals("-")) {
			System.out.println(num1 + op + num2 + "�� ��� ����� " + (num1-num2));
		}else if(op.equals("*")) {
			System.out.println(num1 + op + num2 + "�� ��� ����� " + (num1*num2));
		}else if(op.equals("/")) {
			if(num2==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}else {
				System.out.println(num1 + op + num2 + "�� ��� ����� " + (num1/num2));
			}
		}else {
			System.out.println("�߸��� ������ �Դϴ�.");
		}
		
		//(2)���� ���� ������ �� switch ���� �̿��Ͽ� ���α׷��� �ۼ��϶�.
		switch (op) {
		case "+":
			System.out.println(num1 + op + num2 + "�� ��� ����� " + (num1+num2));
			break;
		case "-":
			System.out.println(num1 + op + num2 + "�� ��� ����� " + (num1-num2));
			break;
		case "*":
			System.out.println(num1 + op + num2 + "�� ��� ����� " + (num1*num2));
			break;
		case "/":
			if(num2==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}else {
				System.out.println(num1 + op + num2 + "�� ��� ����� " + (num1+num2));
			}
			break;
		default:
			System.out.println("�߸��� ������ �Դϴ�.");
		}
	}
}
