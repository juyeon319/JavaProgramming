package ch1.���ǹ�;

import java.util.Scanner;

/*
5. Scanner�� �̿��Ͽ� �ﰢ���� ���� ���̸� ��Ÿ���� ������ 3�� �Է¹ް� 
     �� 3���� ���� �ﰢ���� ���� �� �ִ��� �Ǻ��϶�. 
     �ﰢ���� �Ƿ��� �� ���� ���� �ٸ� �� ���� �պ��� Ŀ�� �Ѵ�.
   
   ------------------------
     ���� 3���� �Է��Ͻÿ�>>4 3 5
     �ﰢ���� �˴ϴ�
   ------------------------
*/
public class Q5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1+num2<num3 || num1+num3<num2 || num2+num3<num1) {
			System.out.println("�ﰢ���� ���� �ʽ��ϴ�");
		}else {
			System.out.println("�ﰢ���� �˴ϴ�");
		}
		
	}
}
