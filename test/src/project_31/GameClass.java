package project_31;

import java.util.Scanner;

public class GameClass {
	
	public void game() {
		
	Scanner scanner = new Scanner(System.in);
	ComClass comclass = new ComClass();
	
	int num = 0; // ���� ��
	int user_num; // ����� ���� ��
	
	while(true) {
		while(true) {
			System.out.print("1~3 ������ ���ڸ� �Է��ϼ��� : ");
			user_num = scanner.nextInt();
			
			if(user_num <1 || user_num > 3)
				System.out.println("�߸��Է��ϼ̽��ϴ�");
			else
				break;
		}
		
		for(int i = 0; i < user_num; i++) {
			num = num  + 1;
			System.out.print(num + " ");
			
			if(num == 31) {
				System.out.println("\n\n�й��ϼ̽��ϴ�\n");
				break;
			}		
		}
		
		if(num == 31)
			break;
		
		System.out.println("\n");
		
		System.out.println("��ǻ���� ��");
		if(num >= 27)
			comclass.win(num);
		else
			comclass.set_num();
		for(int i = 0; i < comclass.num_com; i++) {
			num = num  + 1;
			System.out.print(num + " ");
			
			if(num == 31) {
				System.out.print("\n\n�¸��ϼ̽��ϴ�");
				break;
			}	
		}
		System.out.println("\n");
		
		if(num == 31) 
			break;
	 }
   }
 }
