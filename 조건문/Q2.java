package ch1.���ǹ�;

import java.util.Scanner;

/*
2. Scanner Ŭ������ �̿��Ͽ� 2�ڸ��� ����(10~99����)�� �Է¹ް�, ���� �ڸ��� 1�� �ڸ��� ������ �Ǻ��Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.

   ==================================
   2�ڸ��� ���� �Է�(10~99)>>77
   Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.
   ==================================
*/
public class Q2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("2�ڸ��� �����Է�(10~99)>>");
		int num = scan.nextInt();
		
		int ten = num/10;
		int one = num%10;
		
		if(num>=10 && num<=99) {
			if(ten==one) {
				System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
			}else {
				System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
			}
		}
	}
}
