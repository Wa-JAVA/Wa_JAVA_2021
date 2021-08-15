package project_blackjack.test;

import java.util.Scanner;

public class BlackJack {

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	String ch1;
	int ch2 = 1; //���� ī�� �̱�
	
	int gamer_score;
	int dealer_score;
	
	Deck deck = new Deck();
	Rule rule = new Rule();
	
	//�÷��̾� ����
	Player gamer = new Player();
	Player dealer = new Player();
	
	//������ �̸� ����
	gamer.set_name();
	dealer.set_name();
	
	System.out.printf("%s�� ���̸�, %s�� �����Դϴ�\n\n",gamer.get_name(), dealer.get_name());
	
	//ó�� �� ���� ī�带 �޴´�
	System.out.println("�� �徿 ī�带 �޽��ϴ�");
	gamer.first_card(deck.pick_card(), deck.pick_card());
	dealer.first_card(deck.pick_card(), deck.pick_card());
	
	while(true) {
		//���̸��� ī�常 Ȯ��
		System.out.printf("\n%s�� ī�� ", gamer.get_name());
		gamer.open_card();
		
		//ī�� �߰� �̱�
		if(rule.cal_score(dealer.return_card()) <= 16) {
			System.out.println("\n������ 16�� ���Ϸ� ī�带 �̽��ϴ�");
			dealer.add_card(deck.pick_card());
		}
		else {
			System.out.println("\n������ 17�� �̻����� ī�带 ���� �ʽ��ϴ�");
			ch2 = 2;
		}
				
		//������ ī�� �߰� �̱� ����
		System.out.printf("%s�� ī�带 �߰��� �����ðڽ��ϱ�? (y/n)",gamer.get_name());
		ch1 = scanner.next();
		if(ch1.equals("y"))
			gamer.add_card(deck.pick_card());
		
		if(ch1.equals("n") && ch2 == 2) //��ü ������ ī�� �̱� ���� �� �ߴ�
			break;
	}
	
	//ī�� ����
	System.out.printf("\n%s�� ī�带 �����մϴ� ", gamer.get_name());
	gamer.open_card();
	System.out.printf("%s�� ī�带 �����մϴ� ", dealer.get_name());
	dealer.open_card();
	
	//���� ���
	gamer_score = rule.cal_score(gamer.return_card());
	dealer_score = rule.cal_score(dealer.return_card());
	System.out.printf("\n�� �������� ������ %d %d�Դϴ�\n", gamer_score,dealer_score);
	
	//���� �Ǵ�
	rule.result_game(gamer.get_name(),dealer.get_name(),gamer_score,dealer_score);
  }
}
