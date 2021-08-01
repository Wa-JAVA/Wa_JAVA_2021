import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Player player = new Player();
        Dealer dealer = new Dealer();

        int dealerScore=dealer.addCardScore();
        int playerScore= player.addCardScore();
        boolean finishDealer=false;
        boolean finishPlayer=false;
        Scanner scanner = new Scanner(System.in);

        Card.split();
        dealer.init();
        player.init();

        while(true){
            if(dealerScore<17){
                System.out.println("딜러가 한 장 뽑았습니다.");
                dealer.getCard();
                dealerScore=dealer.addCardScore();
            }
            else{
                System.out.println("딜러의 턴 종료!");
                finishDealer=true;
            }

            player.openCard();
            if(playerScore<=21) {
                System.out.println("카드를 뽑으시겠습니까? Y/N");
                char answer = scanner.next().charAt(0);

                if (answer == 'Y' || answer == 'y') {
                    player.getCard();
                    finishPlayer = false;
                    playerScore = player.addCardScore();
                } else {
                    System.out.println("플레이어 턴 종료");
                    finishPlayer = true;
                }
            }
            else {
                System.out.println("플레이어 턴 종료");
                finishPlayer = true;
            }

            if(finishDealer&&finishPlayer){
                System.out.println("=====게임 종료=====");
                System.out.println("-----딜러 카드-----");
                dealer.openCard();
                System.out.println("딜러 :"+dealerScore);
                System.out.println("-----플레이어 카드-----");
                player.openCard();
                System.out.println("플레이어: "+playerScore);
                break;
            }

        }

        if(dealerScore>21){
            if(playerScore==21)
                System.out.println("플레이어 블랙잭!!");
            if(playerScore<=21)
                System.out.println("플레이어 승리");
            else
                System.out.println("무승부 둘다 21점을 초과했습니다");
        }
        else if(playerScore>21){
            if (dealerScore==21)
                System.out.println("딜러 블랙잭!!");
            System.out.println("딜러 승리");
        }
        else{
            if(dealerScore>playerScore){
                System.out.println("딜러 승리");
            }
            else if(playerScore>dealerScore){
                System.out.println("플레이어 승리");
            }
            else{
                System.out.println("무승부! 동점입니다.");
            }
        }

    }
}
