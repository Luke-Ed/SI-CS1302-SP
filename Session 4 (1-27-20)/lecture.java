
public class lecture {

	private char[] daysMeeting;
	private String time;
	private int roomNum;
	
	public lecture(String input) {
		//input.getDaysMeeting()
		int firstSpace = input.indexOf(" ");
		int secondSpace = input.indexOf(" ", firstSpace+1);
		
		String daysAsString = input.substring(0, firstSpace);
		daysMeeting = new char[daysAsString.length()];
		
		for(int i = 0; i < daysMeeting.length; i++) {
			daysMeeting[i] = daysAsString.charAt(i);
		}
		time = input.substring(firstSpace+1, secondSpace);
		roomNum = Integer.parseInt(input.substring(secondSpace+1));
	}
	public static void main(String[] args) {
		lecture l = new lecture("MTWR 2:00-4:00 2190");

	}

}
