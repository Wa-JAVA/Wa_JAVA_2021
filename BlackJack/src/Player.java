public class Player {
    private int [] playerCard = new int[26];
    private int count = 0;

    public void openCard(){
        int i;
        for (i=0; i<count; i++){
            Card.show(playerCard[i]);
        }
    }

    public void getCard(){
        playerCard[count]=Card.putCard();
        count++;
    }

    public void init(){
        getCard();
        getCard();
    }

    public int addCardScore(){
        int score=0;
        for (int i=0; i<count; i++){
            if((playerCard[i]%13)>10||(playerCard[i]%13==0))
                score+=10;
            else
                score+=playerCard[i]%13;
        }
        return score;
    }
}
