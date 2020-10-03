package day4_Assigment;

public class question5 {

	public static void main(String[] args) {

		int hours,minutes,seconds;
		
		int inputSeconds=3695;
		
		seconds = inputSeconds % 60;
		
		minutes = (inputSeconds % 3600)/60;
		
		hours = inputSeconds / 3600;
		
		System.out.println("inputSecond is "+inputSeconds);
		
		System.out.println(hours + " hours, " + minutes+ " minutes, " + seconds + " seconds");
		
	}

}
