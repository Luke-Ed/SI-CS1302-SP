
public class prob1 {
	public static void main(String[] args) {
	String name = "Lynn";
	double salary = 40000;
	int salaryInt = 40000;
	String s = String.format("Employee %s makes $%,.2f", name, salary);
	System.out.println(s);
	String s1 = String.format("Employee %s makes $%,f", name, salary);
	System.out.println(s1);
	
	String s2 = String.format("Employee %s makes $%,d", name, salaryInt);
	System.out.println(s2);
	}
}
