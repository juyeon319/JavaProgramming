package ch1.���ǹ�;

import java.util.Scanner;

/*
3. Scanner Ŭ������ �̿��Ͽ� ������ �� ���� �׼��� �Է¹޾� ���� ����, ������, õ�� ��, 500��¥�� ����, 100��¥�� ����,
   50��¥�� ����, 10��¥�� ����, 1��¥�� ���� �� �� ���� ��ȯ�Ǵ��� ����϶�.
   
   ====================
     �ݾ��� �Է��Ͻÿ�>>65376
     �������� 1��
     ������ 1��
     õ���� 5��
     ��� 3��
     ���ʿ� 1��
     �ʿ� 2��
     �Ͽ� 6��
  ====================
*/
public class Q3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scan.nextInt();
		
		System.out.println("�������� " + money/50000 + "��");
		money%=50000;
		System.out.println("������ " + money/10000 + "��");
		money%=10000;
		System.out.println("õ���� " + money/1000 + "��");
		money%=1000;
		System.out.println("��� " + money/100 + "��");
		money%=100;
		System.out.println("�ʿ� " + money/10 + "��");
		money%=10;
		System.out.println("�Ͽ� " + money/1 + "��");
		money%=1;
	}
}
