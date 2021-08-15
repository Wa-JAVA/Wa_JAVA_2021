package project_blackjack.test;

import java.util.LinkedList;

public class Deck {
	private int i=0; // 카드 삭제 시 시도 횟수 누적
	Card card = new Card();
	
	public LinkedList<String> cardlist = new LinkedList<String>();
	
	public Deck() {
		for(int i=0; i<4; i++) 
			for(int j=0; j< 13; j++) 
				cardlist.add(card.pattern[i] + " " + card.number[j]);
    } 
	
	public String pick_card() { //카드가 삭제되서 size가 줄어든다
		int rand = (int)(Math.random()*(51-i)); 
		i++;
		return cardlist.remove(rand); //카드 문자열로 반환
	}
}