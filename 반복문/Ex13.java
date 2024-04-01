package ch2.반복문;

/*
13. 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우를 순서대로 화면에 출력해보자.
 	1부터 시작하며 99까지만 한다. 
*/
public class Ex13 {
	public static void main(String[] args) {
		
		for(int i=0; i<100; i++) {
			int tenNum = i/10;
			int oneNum = i%10;
			
			if((tenNum==3 || tenNum==6 || tenNum==9) && (oneNum==3 || oneNum==6 || oneNum==9)) {
				System.out.println(i + " 박수 짝짝");
			} else if((tenNum==3 || tenNum==6 || tenNum==9) || (oneNum==3 || oneNum==6 || oneNum==9)) {
				System.out.println(i + " 박수 짝");
			}
		}
	}
}
