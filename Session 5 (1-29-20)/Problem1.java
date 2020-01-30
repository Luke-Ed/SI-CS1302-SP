
public class Problem1 {

	public static void main(String[] args) {
		String username = "l_E6";
		boolean isValid = true;
		if(!Character.isLetter(username.charAt(0))) {
			isValid = false;
		}
		if(Character.isLetter(username.charAt(1))){
			if(!Character.isUpperCase(username.charAt(1))){
				isValid = false;
			}
		}
		boolean containsNum = false;
		for(int i = 0; i<username.length(); i++) {
			if(Character.isDigit(username.charAt(i))) {
				containsNum = true;
			}
		}
		boolean containsSymbol = false;
		for(int i = 0; i<username.length(); i++) {
			if(!Character.isLetterOrDigit(username.charAt(i))) {
				containsNum = true;
			}
		}
		if(!containsNum) {
			isValid=false;
		}
		if(!containsSymbol) {
			isValid=false;
		}
		System.out.println("Username " + username+ " isValid " + isValid);
	}

}
