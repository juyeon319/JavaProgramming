package ch2.�ݺ���;

/*
13. �ݺ����� �̿��Ͽ� 369���ӿ��� �ڼ��� �ľ� �ϴ� ��츦 ������� ȭ�鿡 ����غ���.
 	1���� �����ϸ� 99������ �Ѵ�. 
*/
public class Ex13 {
	public static void main(String[] args) {
		
		for(int i=0; i<100; i++) {
			int tenNum = i/10;
			int oneNum = i%10;
			
			if((tenNum==3 || tenNum==6 || tenNum==9) && (oneNum==3 || oneNum==6 || oneNum==9)) {
				System.out.println(i + " �ڼ� ¦¦");
			} else if((tenNum==3 || tenNum==6 || tenNum==9) || (oneNum==3 || oneNum==6 || oneNum==9)) {
				System.out.println(i + " �ڼ� ¦");
			}
		}
	}
}
