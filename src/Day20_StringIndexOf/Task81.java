package Day20_StringIndexOf;

public class Task81 {

	public static void main(String[] args) {
		String time="10/10/2019 14:59:00";
		
		System.out.println(timeStemp(time));

	}
	public static String timeStemp(String time) {
		time=time.replace("/", "").replace(" ", "").replace(":", "");
		return time;

}
}
