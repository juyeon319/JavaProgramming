package ch1.���ǹ�;

import java.util.Scanner;

/*
9. ���� �߽��� ��Ÿ���� �� ���� �������� �Ǽ� ������ �Է¹޾ƶ�. �׸��� �Ǽ� ������ 
     �ٸ� �� (x, y)�� �Է¹޾� �� ���� ���� ���ο� �ִ��� �Ǻ��Ͽ� ����϶�.
     
   ---------------------------------
      ���� �߽ɰ� ������ �Է�>> 10 10 6.5
      �� �Է�>> 13 13
      �� (13.0, 13.0)�� �� �ȿ� �ִ�.
   ---------------------------------
*/
public class Q9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double p1 = scan.nextDouble();
		double p2 = scan.nextDouble();
		double r = scan.nextDouble();
		
		System.out.print("�� �Է�>>");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		double result = Math.sqrt((x-p1)*(x-p1)+(y-p2)*(y-p2));
		if(result<=r) {
			System.out.println("�� (" + x + ", " + y + ")�� �� �ȿ� �ִ�.");
		}else {
			System.out.println("�� (" + x + ", " + y + ")�� �� �ȿ� ����.");
		}
	}
}
