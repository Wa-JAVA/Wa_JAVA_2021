package project_blackjack.test;

import java.util.LinkedList;

public class Rule { 
	public int score;
	public int ch_score = 0;
	
	public int change_char(char ch) { // 문자를 숫자로 변환
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
		case '0': //10의 마지막은 0이고 뒤에 0이 나오는 경우는 10밖에 없음
		case 'J':
		case 'Q':
		case 'K':
			ch_score = 10;
			break;
		}
		return ch_score;
	}
	
	public int cal_score(LinkedList<String> player_list) { //점수 계산 함수
		int size = player_list.size();
		score = 0; // 점수 누적 방지
		
		for(int i=0; i<size; i++) {
			String str = player_list.get(i);
			char c = str.charAt(str.length() -1); // list의 마지막 문자 추출
			score += change_char(c); //추출한 문자로 문자를 숫자로 변환하는 함수 호출
		}
		return score;
	}
	
	public void result_game(String name1, String name2, int score1, int score2) { //승패 판단
		int max;
		
		if(score1 > 21)
			score1 = 0;
		if(score2 > 21)
			score2 = 0;
		
		if(score1 == 0 && score2 == 0 ) // 둘 다 21이 넘어간 경우
			System.out.println("비겼습니다");
		
		else {
			//21에 가장 가까운 수를 찾기위해 음수로 만들고 최대값을 찾는다
			score1 -= 21;
			score2 -= 21;
		
			if(score1 > score2)
				System.out.printf("%s의 승리입니다",name1);
			if(score1 < score2)
				System.out.printf("%s의 승리입니다",name2);
			if(score1 == score2)
				System.out.println("비겼습니다");
		
		}
	}
}
