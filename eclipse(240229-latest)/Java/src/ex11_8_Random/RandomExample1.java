package ex11_8_Random;

import java.util.Random; //Random 클래스는 java.util 패키지에 속함


public class RandomExample1 {
	 public static void main(String[] args) {
		 Random random = new Random(); //파라미터 없는 생성자
		 
		 //0부터 100미만의 정수형 난수 발생-즉, 0부터 99까지의 정수형 난수 발생
		 System.out.println(random.nextInt(100));
		 System.out.println(random.nextInt(100));
		 System.out.println(random.nextInt(100));
		 
		 //1부터 45까지의 난수 발생
		 System.out.println("1~45까지의 난수 발생 : " + (random.nextInt(45)+1));
		 /*
		  * 0 <= random.nextInt(45) <= 44
		  * 0+1 <= random.nextInt(45)+1 <= 44+1
		  * 
		  */
	 }
}
