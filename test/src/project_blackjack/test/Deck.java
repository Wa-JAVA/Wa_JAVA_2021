package project_blackjack.test;

import java.util.LinkedList;

public class Deck {
	private int i=0; // ī�� ���� �� �õ� Ƚ�� ����
	Card card = new Card();
	
	public LinkedList<String> cardlist = new LinkedList<String>();
	
	public Deck() {
		for(int i=0; i<4; i++) 
			for(int j=0; j< 13; j++) 
				cardlist.add(card.pattern[i] + " " + card.number[j]);
    } 
	
	public String pick_card() { //ī�尡 �����Ǽ� size�� �پ���
		int rand = (int)(Math.random()*(51-i)); 
		i++;
		return cardlist.remove(rand); //ī�� ���ڿ��� ��ȯ
	}
}