package Day37_Inheritances;

public class FinalExam extends GradeActivity{
	private int numQuest;
	private double pointsEach;
	private int numMissed;
	
	public FinalExam(int numQuest, int numMissed) {
		double numScore;
		
		this.numQuest=numQuest;
		this.numMissed=numMissed;
		
		pointsEach = 100 / numQuest;
		numScore = 100 - (numMissed*pointsEach);
		
		setScore(numScore);
	}
	

}
