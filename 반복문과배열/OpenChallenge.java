package ch2.�ݺ������迭;

import java.util.Random;
import java.util.Scanner;

/*
ī�� ���߱� ���� 
*/
public class OpenChallenge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rd = new Random();	//Random ��ü ����
		
		while(true) {
			int rdNum = rd.nextInt(100);	//0~99 ���� �� ����
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");
			int count = 1, min = 0, max = 99;
			String str = "";
			
			while(true) {
				System.out.println(min + "-" + max);
				System.out.print(count + ">>");
				int user = scan.nextInt();
				
				if(user<rdNum) {
					System.out.println("�� ����");
					min = user;					//min�� user�� ����
				} else if(user>rdNum) {
					System.out.println("�� ����");
					max = user;					//max�� user�� ����
				} else {
					System.out.println("�¾ҽ��ϴ�.");
					break;
				}
				count++;
			}
			System.out.print("�ٽ� �Ͻðڽ��ϱ�?(y/n)>>");
			str = scan.next();
			
			if(str.equals("y")) {
				continue;
			} else {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
}
