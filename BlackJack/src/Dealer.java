public class Dealer {
    private int [] dealerCard = new int[26];
    private int count = 0;

    public void openCard(){
        int i;
        for (i=0; i<count; i++){
            Card.show(dealerCard[i]);
        }
    }

    public void getCard(){
        dealerCard[count]=Card.putCard();
        count++;
    }

    public void init(){
        getCard();
        getCard();
    }

    public int addCardScore(){
        int score=0;
        for (int i=0; i<count; i++){
            if((dealerCard[i]%13)>10||(dealerCard[i]%13==0))
                score+=10;
            else
                score+=dealerCard[i]%13;
        }
        return score;
    }

}
