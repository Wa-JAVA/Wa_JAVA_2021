package project_blackjack;

import java.util.LinkedList;
import java.util.Scanner;

public class Player { 
	
	Scanner scanner = new Scanner(System.in);
	
	private String name;
	public LinkedList<String> playercard = new LinkedList<String>();
	
	public void set_name() {
		System.out.print("�������� �̸��� �Է����ּ��� : ");
		name = scanner.next();
	}
	
	public String get_name() {
		return name;
	}
	
	public void first_card(String player_card1, String player_card2) { //ī�� �� �� �޴´�.
		playercard.add(player_card1); 
		playercard.add(player_card2);
	}
	
	public void add_card(String player_card) { //ī��� �߰��� �̾��� �� ����� �����ϰ� �ϴ� �Լ�
		playercard.add(player_card);
	}
	
	public LinkedList<String> return_card() { // ī�� �迭 ��ȯ
		return playercard;
	}
	
	public void open_card() { // ī�� ����
		System.out.println(playercard);
	}
}
