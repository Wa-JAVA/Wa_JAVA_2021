package project_31;

public class MainClass {
	public static void main (String[] args) {
		
		GameClass gameclass = new GameClass();
		StartGame start = new StartGame();		
		
		while(true) {
			start.print();
			start.input();
			
			if(start.ctrl == 1)
				gameclass.game();
			
			else {
				System.out.println("\n������ ����Ǿ����ϴ�");
				break;
			}	
		}
	}
}