package ch1.���ǹ�;

import java.util.Scanner;

/*
0. ���������� ���� 
   ----------------------------------------------
      ���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���
      ö�� >> ����
      ���� >> ��
      ö���� �̰���ϴ�.
   ----------------------------------------------
*/
public class OpenChallenge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >> ");
		String user1 = scan.next();
		System.out.print("���� >> ");
		String user2 = scan.next();

		//if��
		if(user1.equals(user2)) {
			System.out.println("�����ϴ�.");
		} else if(user1.equals("����") && user2.equals("��") 
				|| user1.equals("����") && user2.equals("����") 
				|| user1.equals("��") && user2.equals("����")) {
			System.out.println("ö���� �̰���ϴ�.");
		} else {
			System.out.println("���� �̰���ϴ�.");
		}
		
		//switch�� 
		switch (user1) {
		case "����":
			switch (user2) {
			case "����":
				System.out.println("�����ϴ�.");
				break;
			case "����":
				System.out.println("���� �̰���ϴ�.");
				break;
			case "��":
				System.out.println("ö���� �̰���ϴ�.");
				break;
			}
			break;
		
		case "����":
			switch (user2) {
			case "����":
				System.out.println("ö���� �̰���ϴ�.");
				break;
			case "����":
				System.out.println("�����ϴ�.");
				break;
			case "��":
				System.out.println("���� �̰���ϴ�.");
				break;
			}
			break;
			
		case "��":
			switch (user2) {
			case "����":
				System.out.println("���� �̰���ϴ�.");
				break;
			case "����":
				System.out.println("ö���� �̰���ϴ�.");
				break;
			case "��":
				System.out.println("�����ϴ�.");
				break;
			}
			break;

		default:
			System.out.println("��ȿ���� ���� ����Դϴ�.");
		}
	}
}
