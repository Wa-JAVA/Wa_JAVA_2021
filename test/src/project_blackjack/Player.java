package project_blackjack;

import java.util.LinkedList;
import java.util.Scanner;

public class Player { 
	
	Scanner scanner = new Scanner(System.in);
	
	private String name;
	public LinkedList<String> playercard = new LinkedList<String>();
	
	public void set_name() {
		System.out.print("참가자의 이름을 입력해주세요 : ");
		name = scanner.next();
	}
	
	public String get_name() {
		return name;
	}
	
	public void first_card(String player_card1, String player_card2) { //카드 두 장 받는다.
		playercard.add(player_card1); 
		playercard.add(player_card2);
	}
	
	public void add_card(String player_card) { //카드룰 추가로 뽑았을 때 기록을 가능하게 하는 함수
		playercard.add(player_card);
	}
	
	public LinkedList<String> return_card() { // 카드 배열 반환
		return playercard;
	}
	
	public void open_card() { // 카드 오픈
		System.out.println(playercard);
	}
}
