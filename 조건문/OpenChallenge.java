package ch1.조건문;

import java.util.Scanner;

/*
0. 가위바위보 게임 
   ----------------------------------------------
      가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요
      철수 >> 가위
      영희 >> 보
      철수가 이겼습니다.
   ----------------------------------------------
*/
public class OpenChallenge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String user1 = scan.next();
		System.out.print("영희 >> ");
		String user2 = scan.next();

		//if문
		if(user1.equals(user2)) {
			System.out.println("비겼습니다.");
		} else if(user1.equals("가위") && user2.equals("보") 
				|| user1.equals("바위") && user2.equals("가위") 
				|| user1.equals("보") && user2.equals("바위")) {
			System.out.println("철수가 이겼습니다.");
		} else {
			System.out.println("영희가 이겼습니다.");
		}
		
		//switch문 
		switch (user1) {
		case "가위":
			switch (user2) {
			case "가위":
				System.out.println("비겼습니다.");
				break;
			case "바위":
				System.out.println("영희가 이겼습니다.");
				break;
			case "보":
				System.out.println("철수가 이겼습니다.");
				break;
			}
			break;
		
		case "바위":
			switch (user2) {
			case "가위":
				System.out.println("철수가 이겼습니다.");
				break;
			case "바위":
				System.out.println("비겼습니다.");
				break;
			case "보":
				System.out.println("영희가 이겼습니다.");
				break;
			}
			break;
			
		case "보":
			switch (user2) {
			case "가위":
				System.out.println("영희가 이겼습니다.");
				break;
			case "바위":
				System.out.println("철수가 이겼습니다.");
				break;
			case "보":
				System.out.println("비겼습니다.");
				break;
			}
			break;

		default:
			System.out.println("유효하지 않은 결과입니다.");
		}
	}
}
