package Day37_Inheritances;

public class GradeActivity {
	
	private double score;
	
	public double getScore() {
		return score;
		
	}
	public void setScore(double score) {
		this.score=score;
		
	}
	public char getGrade() {
		char lettreGrade = 0;
		
		if(score>=90) {
			lettreGrade='A';
			
		}else if(score>=80) {
			lettreGrade='B';
			
		}else if(score>=70) {
			lettreGrade='C';
			
		}else if(score>=60) {
			lettreGrade='D';
			
		}else if(score>=50) {
			lettreGrade='F';
			
		}
		return lettreGrade;
		
	}

}
