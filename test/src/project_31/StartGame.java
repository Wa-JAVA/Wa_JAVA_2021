package project_31;

import java.util.Scanner;

public class StartGame {
	
	public static int ctrl;
	public void print() {
		System.out.println("����Ų��� 31!");
		System.out.println("========================");
		System.out.println("1. ���� ����");
		System.out.println("2. ���� ����");
		System.out.println("========================");
	}
	public void input() {
		Scanner scanner = new Scanner(System.in);
			
		while(true) {
			System.out.print("�Է� : ");
			ctrl = scanner.nextInt();
			
			if(ctrl == 1 || ctrl == 2)
				break;
			
			else
				System.out.print("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
	}
  }
}
