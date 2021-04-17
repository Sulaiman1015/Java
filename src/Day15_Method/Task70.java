package Day15_Method;

public class Task70 {

	public static void main(String[] args) {
		
		int x=calculateHighScorePostion(800);
		
		
		
		displayHighScorePostion("Mike",x);
		
		displayHighScorePostion("Tom",calculateHighScorePostion(1200));
		
	}
	public static void displayHighScorePostion(String name,int scoreposition) {
		System.out.println(name+" managed to get into position "+ scoreposition +", on the high score table");
		
		
	}
	public static int calculateHighScorePostion(int score) {
		
		if(score>=1000) {
			
			return 1;
			
		}else if(score>=500 && score<1000) {
			
			return 2;
		}else if(score>100 && score<500){
			
			return 3;
		}else{
			
			return 4;
		}
		
	}

}
