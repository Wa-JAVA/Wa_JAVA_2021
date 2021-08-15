package project_blackjack;

import java.util.LinkedList;

public class Rule { 
	public int score;
	public int ch_score = 0;
	
	public int change_char(char ch) { // ���ڸ� ���ڷ� ��ȯ
		switch(ch) {
		case 'A':
			ch_score = 1;
			break;
		case '2':
			ch_score = 2;
			break;
		case '3':
			ch_score = 3;
			break;
		case '4':
			ch_score = 4;
			break;
		case '5':
			ch_score = 5;
			break;
		case '6':
			ch_score = 6;
			break;
		case '7':
			ch_score = 7;
			break;
		case '8':
			ch_score = 8;
			break;
		case '9':
			ch_score = 9;
			break;
		case '0': //10�� �������� 0�̰� �ڿ� 0�� ������ ���� 10�ۿ� ����
		case 'J':
		case 'Q':
		case 'K':
			ch_score = 10;
			break;
		}
		return ch_score;
	}
	
	public int cal_score(LinkedList<String> player_list) { //���� ��� �Լ�
		int size = player_list.size();
		score = 0; // ���� ���� ����
		
		for(int i=0; i<size; i++) {
			String str = player_list.get(i);
			char c = str.charAt(str.length() -1); // list�� ������ ���� ����
			score += change_char(c); //������ ���ڷ� ���ڸ� ���ڷ� ��ȯ�ϴ� �Լ� ȣ��
		}
		return score;
	}
	
	public void result_game(String name1, String name2, int score1, int score2) { //���� �Ǵ�
		int max;
		
		if(score1 > 21)
			score1 = 0;
		if(score2 > 21)
			score2 = 0;
		
		if(score1 == 0 && score2 == 0 ) // �� �� 21�� �Ѿ ���
			System.out.println("�����ϴ�");
		
		else {
			//21�� ���� ����� ���� ã������ ������ ����� �ִ밪�� ã�´�
			score1 -= 21;
			score2 -= 21;
		
			if(score1 > score2)
				System.out.printf("%s�� �¸��Դϴ�",name1);
			if(score1 < score2)
				System.out.printf("%s�� �¸��Դϴ�",name2);
			if(score1 == score2)
				System.out.println("�����ϴ�");
		
		}
	}
}
