import java.util.Random;
import java.util.Scanner;

public class BaskinRobbins {
    static int count = 0;

    public static void main(String[] args) {
        Computer computer = new Computer();
        Player player = new Player();
        int winner = 0;
        System.out.println("귀엽고 깜찍하게 배스킨라빈스 31!");
        System.out.println("갯수만 입력!!");
        while (count < 31) {
            count = player.start(count);
            if (count == 31) {
                winner = 0;
                break;
            }
            count = computer.start(count);
            if (count == 31) {
                winner = 1;
                break;
            }
        }
        if (winner == 0) {
            System.out.println("컴퓨터 승리!");
        } else {
            System.out.println("플레이어 승리!");
        }
    }
}

class Computer {
    private void showNumber(int num, int count) {
        int start_num = num;
        System.out.print("컴퓨터: ");
        if (num > 26 && num < 30) {
            for (int i = 0; i < 30 - num; i++) {
                start_num = start_num + 1;
                System.out.print(start_num + " ");
            }
        } else if (num == 30) {
            System.out.print((num + 1) + " 아이쿠!");
        } else {
            for (int i = 0; i < count; i++) {
                start_num = start_num + 1;
                System.out.print(start_num + " ");
            }
        }
        System.out.println();
    }

    public int start(int num) {
        int count = 0;
        Random rand = new Random();
        count = rand.nextInt(3) + 1;
        showNumber(num, count);
        if (num > 27 && num < 30) {
            return num + (30 - num);
        } else if (num == 30) return 31;
        else {
            return num + count;
        }
    }
}

class Player {
    private int getNum(int startNum) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("플레이어 입력: ");
        int num = scanner.nextInt();
        while (((num<0)||(num > 3)) || (startNum + num) > 31) {
            System.out.print("플레이어 입력: ");
            num = scanner.nextInt();
        }
        return num;
    }

    private void showNum(int num, int count) {
        System.out.print("플레이어: ");
        for (int i = 0; i < count; i++) {
            num = num + 1;
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int start(int startNum) {
        int count = getNum(startNum);
        showNum(startNum, count);
        return startNum + count;
    }
}