package ch1.���ǹ�;

import java.util.Scanner;

/*
1. Scanner Ŭ������ �̿��Ͽ� ��ȭ�� �Է¹޾� �޷��� �ٲپ� ���� ���ÿ� ���� ����ϴ� ���α׷��� �ۼ��϶�.
   $1=1100������ �����ϰ� ����϶�.
   
   --------------------------------
     ��ȭ�� �Է��ϼ���(���� ��)>>3300
   3300���� $3.0�Դϴ�.
   --------------------------------
*/
public class Q1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int won = scan.nextInt();
		double dollar = won/1100;
		
		System.out.println(won + "���� $" + dollar + "�Դϴ�.");
	}
}
