//게시판 로직에 활용

package ex05_2_switch;

import java.io.InputStream;
import java.util.Scanner;

public class Homework_4 {
	public static void main(String[] args) {
		
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		
		System.out.print("정수를 입력하세요?");
		int num = sc.nextInt();
		int num2 = (num-1)/10;
		
		System.out.println(num2*10+1);
		
		sc.close();
			
		}

	}
