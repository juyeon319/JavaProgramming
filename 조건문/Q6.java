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
		System.out.print("1~99������ ������ �Է��Ͻÿ�>>");
		int num = scan.nextInt();
		int ten = num/10;
		int one = num%10;
		
		if(num>=1 && num<=99) {
			if(ten%3==0 && one%3==0) {
				System.out.println("�ڼ�¦¦");
			}else if(ten%3==0 || one%3==0) {
				System.out.println("�ڼ�¦");
			}
		}
	}
}