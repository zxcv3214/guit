package ex06_2_method;

public class MethodExample10 {
	public static void main(String[] args) {
		int num = 20;
		char data = '*';
		print(num, data);
	}

	public static void print(int p_num, char p_data) {
		for (int i = 0; i < p_num; i++) {
			System.out.print(p_data);
		}
	}
}

//	public static void print(char p) {
//		for (int i=1; i<=20; i++) {
//			System.out.print(p);
//		}
//	}