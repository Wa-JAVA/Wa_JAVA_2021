package project_31;

public class ComClass {
	public int num_com;
	public void set_num() {
		num_com = (int)(Math.random()*3 + 1);
	}
	public void win(int present) {
		if(present == 27)
			num_com = 3;
		
		else if(present == 28)
			num_com = 2;
		
		else if(present == 29)
			num_com = 1;
	}
}