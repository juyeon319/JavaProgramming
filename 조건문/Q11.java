package ch1.���ǹ�;

import java.util.Scanner;

/*
11. ���ڸ� �Է¹޾� 3~5�� "��", 6~8�� "����", 9~11�� "����", 12, 1, 2�� ��� "�ܿ�"��,
       �� ���� ���ڸ� �Է��� ��� "�߸��Է�"�� ����ϴ� ���α׷��� �ۼ��϶�.
       
    ------------------------
        ���� �Է��ϼ���(1~12)>>9
        ����
    ------------------------
*/
public class Q11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int month = scan.nextInt();
		
		//(1)if-else ���� �̿��Ͽ� ���α׷��� �ۼ��϶�.
		if(month>=3 && month<=5) {
			System.out.println("��");
		}else if(month>=6 && month<=8) {
			System.out.println("����");
		}else if(month>=9 && month<=11) {
			System.out.println("����");
		}else if(month==12 || month==1 || month==2) {
			System.out.println("�ܿ�");
		}else {
			System.out.println("�߸��Է�");
		}
		
		//(2)switch ���� �̿��Ͽ� ���α׷��� �ۼ��϶�.
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("��");
			break;
		case 6: case 7: case 8:
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		case 12: case 1: case 2:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("�߸��Է�");
		}
	}
}
