import java.util.Random;

public class Card {

    private static int cardCount = 0;
    private static final int SIZE = 52;
    private static int [] deck = new int[SIZE];

    public static void split(){
        int i, j;
        Random random = new Random();
        for(i=0; i<SIZE; i++){
            deck[i]=random.nextInt(52)+1;
            for(j=0;j<i; j++){
                if(deck[i]==deck[j]){
                    i--;
                }
            }
        }
    }

    public static void show(int card){
        switch (card/13){
            case 0:{
                if(card%13==1)
                    System.out.println("♠A");
                else if(card%13==11)
                    System.out.println("♠J");
                else if(card%13==12)
                    System.out.println("♠Q");
                else
                    System.out.println("♠"+card%13);
                break;
            }
            case 1:{
                if(card%13==1)
                    System.out.println("♣A");
                else if(card%13==11)
                    System.out.println("♣J");
                else if(card%13==12)
                    System.out.println("♣Q");
                else if(card%13==0)
                    System.out.println("♠K");
                else
                    System.out.println("♣"+card%13);
                break;
            }
            case 2:{
                if(card%13==1)
                    System.out.println("♥A");
                else if(card%13==11)
                    System.out.println("♥J");
                else if(card%13==12)
                    System.out.println("♥Q");
                else if(card%13==0)
                    System.out.println("♣K");
                else
                    System.out.println("♥"+card%13);
                break;
            }
            case 3:{
                if(card%13==1)
                    System.out.println("◆A");
                else if(card%13==11)
                    System.out.println("◆J");
                else if(card%13==12)
                    System.out.println("◆Q");
                else if(card%13==0)
                    System.out.println("♥K");
                else
                    System.out.println("◆"+card%13);
                break;
            }
            default:{
                System.out.println("◆K");
                break;
            }
        }
    }

    public static int putCard(){
        cardCount++;
        return deck[cardCount-1];
    }
}
