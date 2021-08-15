package project_31;

import java.util.Scanner;

public class StartGame {
	
	public static int ctrl;
	public void print() {
		System.out.println("베스킨라빈스 31!");
		System.out.println("========================");
		System.out.println("1. 게임 시작");
		System.out.println("2. 게임 종료");
		System.out.println("========================");
	}
	public void input() {
		Scanner scanner = new Scanner(System.in);
			
		while(true) {
			System.out.print("입력 : ");
			ctrl = scanner.nextInt();
			
			if(ctrl == 1 || ctrl == 2)
				break;
			
			else
				System.out.print("잘못입력하셨습니다. 다시 입력해주세요");
	}
  }
}
