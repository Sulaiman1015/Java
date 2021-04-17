package Day14_Method;

public class Task66 {

	public static void main(String[] args) {
		
		int d=Distance(50,2);
		System.out.println(Distance(123,1));
		
		if(d>130) {
			System.out.println("speed too mach");
		}else {
			System.out.println("speed is ok");
		}

	}
	public static int Distance(int speed,int time) {
		int Distance;
		Distance=speed*time;
		return Distance;
	}

}
