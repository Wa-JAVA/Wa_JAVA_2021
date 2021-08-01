package GAME;
import java.util.Scanner;           // scanner 이용하기 위해서

public class BR31GAME {

    public static void main (String[] args){

        BR31GAME();                 //BR31GAME 객체를 만들어 진행
    }

    public static void BR31GAME(){
        int num=0;
        Scanner s = new Scanner(System.in);         //BR31GAME에서 모두 쓰이기 때문에 위로 빼서 진행
        System.out.println("게임을 시작하겠습니다.");

        while(true) {               //전체에 큰 반복문을 씌워 게임이 플레이어와 컴퓨터를 계속 돌아가며 실행될수있게 함
            int playernum=1;        //플레이어가 입력하는 값을 받을 변수 "playernum"이라 정의
            while(true) {
                System.out.println("1~3 중 숫자를 입력해 주십시오: ");
                playernum = s.nextInt();    // 받은 값을 playernum에 저장

                if(1<=playernum && playernum<=3){       // 받은 값이 1~3 사이의 값이라면 while 반복문 break
                    break;
                }
                else
                    System.out.println("숫자를 다시 확인해주십시오.");      //아니라면 숫자를 다시 확인하고 다시 숫자를 입력받게 함
            }

            for(int i=(num+1) ; i<=num+playernum; i ++){        //num=0이라 정의해 +1을 해준 처음 값부터 사용자가 입력한 값까지를 for문을 활용해 출력
                if(i>31){
                    break;
                }
                System.out.println(i+"!");
            }
            num+=playernum;             //사용자가 입력한 값을 num에 더해 다음 순서로 입력 받을 숫자의 min(제일 작은 값)을 수정

            if(num>=31){
                System.out.println("플레이어의 패배입니다.");         //31이 넘으면 플레이어의 패배
                break;
            }

            System.out.println("--------------------");

            System.out.println("컴퓨터 차례");                   //컴퓨터의 차례
            int connum=0;                                      //컴퓨터가 입력하는 값을 받을 변수 "connum"이라 정의

            if(num==27)                         //필승 공식 이용
                connum=3;
            else if(num==28)
                connum=2;
            else if(num==29)
                connum=1;
            else if(num==30) {
                System.out.println("어이쿠!");
                connum = 0;
            }
            else
                connum=(int)(Math.random()*3)+1;  // 필승공식을 따르지 않을 경우에는 random()을 이용해 1~3까지의 값을 지정

            for(int i=num+1 ; i<=num+connum; i ++){         //이어진 값부터 컴퓨터가 입력한 값까지를 for문을 활용해 출력
                if(i>31){
                    break;
                }
                System.out.println(i+"!");
            }
            num+=connum;                        //컴퓨터가 입력한 값을 num에 더해 다음 순서로 입력 받을 숫자의 min(제일 작은 값)을 수정
            if(num>=31){                                //31이 넘으면 컴퓨터의 패배
                System.out.println("컴퓨터의 패배입니다.");
                break;
            }

        }

    }
}
