package ch1.���ǹ�;

import java.util.Scanner;

/*
6. 369������ ������ �ۼ��غ���. 1~99������ ������ �Է¹ް� ������ 3, 6, 9 �� �ϳ��� 
     �ִ� ���� "�ڼ�¦"�� ����ϰ� �� �� �ִ� ���� "�ڼ�¦¦"�� ����ϴ� ���α׷��� �ۼ��϶�.
	
   -----------------------------	
   1~99 ������ ������ �Է��Ͻÿ�>>36
     �ڼ�¦¦
   -----------------------------	
*/
public class Q6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num = scan.nextInt();
		
		if(num>=1 && num <=99) {
			int tensPlace = num/10;
			int onesPlace = num%10;
		
			if((tensPlace==3 || tensPlace==6 || tensPlace==9) 
					&& (onesPlace==3 || onesPlace==6 || onesPlace==9)) {
				System.out.println("�ڼ�¦¦");
			}else if ((tensPlace==3 || tensPlace==6 || tensPlace==9) 
					|| (onesPlace==3 || onesPlace==6 || onesPlace==9)) {
				System.out.println("�ڼ�¦");
			}else {
				System.out.println("�ڼ�����");
			}
		}
	}
}