
public class TriangleDriver {

	public static void main(String[] args) {
	}
	private static Triangle createTriangle() {
		return new Triangle("red", 4, 3);
	}
	
	private static void  testGetters() {
		Triangle t = createTriangle();
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("Test getHeight, expected: 4.0 recieved: %.1f\n", t.getHeight() ));
		sb.append(String.format("Test getBase, expected: 3.0 recieved: %.1f\n", t.getBase() ));
		sb.append(String.format("Test getColor, expected: red recieved: %s\n", t.getColor() ));
		
		System.out.println(sb);
	}
	
	private static void testGetArea() {
		Triangle t = createTriangle();
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("Test getArea, expected: 6.0 recieved: %.1f\n", t.getArea() ));
		
		System.out.println(sb);
	}
	
	private static void testGetHypotenuse() {
		Triangle t = createTriangle();
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("Test getHypotenuse, expected: 5.0 recieved: %.1f \n", t.getHypotenuse() ));
		
		System.out.println(sb);
	}
}
