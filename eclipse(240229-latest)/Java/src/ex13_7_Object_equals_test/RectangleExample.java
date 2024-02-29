package ex13_7_Object_equals_test;

public class RectangleExample {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 30);
		Rectangle r2 = new Rectangle(10, 30);

		System.out.println(r1);	//참조변수 단일로 출력하면 오버라이드된 toString() 메소드가 자동으로 호출된다.
		System.out.println(r2);

		if (r1 == r2)
			System.out.println("r1==r2 같음");
		else
			System.out.println("r1==r2 다름");

		if (r1.equals(r2))
			System.out.println("r1.equals(r2) 같음");
		else
			System.out.println("r1.equals(r2) 다름");
	}
}