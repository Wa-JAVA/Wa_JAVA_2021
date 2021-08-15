package project_31;

import java.util.Scanner;

public class GameClass {
	
	public void game() {
		
	Scanner scanner = new Scanner(System.in);
	ComClass comclass = new ComClass();
	
	int num = 0; // 현재 값
	int user_num; // 사용자 선택 수
	
	while(true) {
		while(true) {
			System.out.print("1~3 사이의 숫자를 입력하세요 : ");
			user_num = scanner.nextInt();
			
			if(user_num <1 || user_num > 3)
				System.out.println("잘못입력하셨습니다");
			else
				break;
		}
		
		for(int i = 0; i < user_num; i++) {
			num = num  + 1;
			System.out.print(num + " ");
			
			if(num == 31) {
				System.out.println("\n\n패배하셨습니다\n");
				break;
			}		
		}
		
		if(num == 31)
			break;
		
		System.out.println("\n");
		
		System.out.println("컴퓨터의 턴");
		if(num >= 27)
			comclass.win(num);
		else
			comclass.set_num();
		for(int i = 0; i < comclass.num_com; i++) {
			num = num  + 1;
			System.out.print(num + " ");
			
			if(num == 31) {
				System.out.print("\n\n승리하셨습니다");
				break;
			}	
		}
		System.out.println("\n");
		
		if(num == 31) 
			break;
	 }
   }
 }
