package Day20_StringIndexOf;

public class IndexOf {

	public static void main(String[] args) {
		
		String word="github";
		System.out.println(word.indexOf("g"));
		System.out.println(word.indexOf("th"));
		System.out.println(word.indexOf("hub"));
		
		System.out.println(word.indexOf("java"));//no exist:-1
		
		String url="www.okta.com";
		int i=url.indexOf(".");
		System.out.println("pos of "+i);
		System.out.println(url.charAt(i+2));
		
		//find position of '-' and check if space is on rigt and left side
		String title="Java - Google Search";
		int dash=title.indexOf('-');
		System.out.println(title.charAt(dash+1));
		System.out.println(title.charAt(dash-1));
		System.out.println("aa");
		
		String country="United States of America";
		int states=country.indexOf("States");
		System.out.println("position of states: "+ states);
		
		String word1="java, c++, python, tomcat, eclipse";
		//check if c++ is in the word1
		if(word1.contains("c++")) {
			System.out.println("c++ is in there");
		}else {
			System.out.println("c++ is not there");
		}
		if (word1.indexOf("c++")>-1) {
			System.out.println("c++ is in there");
		}else {
			System.out.println("c++ is not there");
		}
		
		
	}
	

}
