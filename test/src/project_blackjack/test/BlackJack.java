package project_blackjack.test;

import java.util.Scanner;

public class BlackJack {

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	String ch1;
	int ch2 = 1; //딜러 카드 뽑기
	
	int gamer_score;
	int dealer_score;
	
	Deck deck = new Deck();
	Rule rule = new Rule();
	
	//플레이어 생성
	Player gamer = new Player();
	Player dealer = new Player();
	
	//참가자 이름 설정
	gamer.set_name();
	dealer.set_name();
	
	System.out.printf("%s는 게이머, %s는 딜러입니다\n\n",gamer.get_name(), dealer.get_name());
	
	//처음 두 장의 카드를 받는다
	System.out.println("두 장씩 카드를 받습니다");
	gamer.first_card(deck.pick_card(), deck.pick_card());
	dealer.first_card(deck.pick_card(), deck.pick_card());
	
	while(true) {
		//게이머의 카드만 확인
		System.out.printf("\n%s의 카드 ", gamer.get_name());
		gamer.open_card();
		
		//카드 추가 뽑기
		if(rule.cal_score(dealer.return_card()) <= 16) {
			System.out.println("\n딜러가 16점 이하로 카드를 뽑습니다");
			dealer.add_card(deck.pick_card());
		}
		else {
			System.out.println("\n딜러가 17점 이상으로 카드를 뽑지 않습니다");
			ch2 = 2;
		}
				
		//참가자 카드 추가 뽑기 여부
		System.out.printf("%s님 카드를 추가로 뽑으시겠습니까? (y/n)",gamer.get_name());
		ch1 = scanner.next();
		if(ch1.equals("y"))
			gamer.add_card(deck.pick_card());
		
		if(ch1.equals("n") && ch2 == 2) //전체 참가자 카드 뽑기 없을 시 중단
			break;
	}
	
	//카드 오픈
	System.out.printf("\n%s의 카드를 오픈합니다 ", gamer.get_name());
	gamer.open_card();
	System.out.printf("%s의 카드를 오픈합니다 ", dealer.get_name());
	dealer.open_card();
	
	//점수 계산
	gamer_score = rule.cal_score(gamer.return_card());
	dealer_score = rule.cal_score(dealer.return_card());
	System.out.printf("\n각 참가자의 점수는 %d %d입니다\n", gamer_score,dealer_score);
	
	//승패 판단
	rule.result_game(gamer.get_name(),dealer.get_name(),gamer_score,dealer_score);
  }
}
