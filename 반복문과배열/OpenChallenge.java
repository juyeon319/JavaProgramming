package ch2.반복문과배열;

import java.util.Random;
import java.util.Scanner;

/*
카드 맞추기 게임 
*/
public class OpenChallenge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rd = new Random();	//Random 객체 생성
		
		while(true) {
			int rdNum = rd.nextInt(100);	//0~99 랜덤 수 생성
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			int count = 1, min = 0, max = 99;
			String str = "";
			
			while(true) {
				System.out.println(min + "-" + max);
				System.out.print(count + ">>");
				int user = scan.nextInt();
				
				if(user<rdNum) {
					System.out.println("더 높게");
					min = user;					//min에 user값 저장
				} else if(user>rdNum) {
					System.out.println("더 낮게");
					max = user;					//max에 user값 저장
				} else {
					System.out.println("맞았습니다.");
					break;
				}
				count++;
			}
			System.out.print("다시 하시겠습니까?(y/n)>>");
			str = scan.next();
			
			if(str.equals("y")) {
				continue;
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
