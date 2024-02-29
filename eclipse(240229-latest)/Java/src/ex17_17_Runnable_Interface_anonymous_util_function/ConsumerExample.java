package ex17_17_Runnable_Interface_anonymous_util_function;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerExample {
/*
 java.util.function 패키지에 일반적으로 자주 쓰이는 형식의 메서드를 함수형 인터페이스로 미리 정의해 놓았다.
 1. Consumer<T>는 1개의 매개변수가 있고 반환값이 없는 함수형 인터페이스
 @FunctionalInterface
 	public interface Consumer<T> {
 		void accept(T t);
 		}
 */
	public static void main(String[] args) {
		
		Consumer<String> a = i -> System.out.println(i);
		a.accept("a:람다식");
		
		Consumer<String> b = System.out::println;
		b.accept("b:메소드 참조 방법");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		
		//void java.util.ArrayList.forEach(Consumer<? super Integer> action)
		/*
		  Consumer<? super Integer>은
		  Integer 타입 또는 상위 클래스를 받아들일 수 있는 Consumer를 나타낸다.
		 */
		
		list.forEach(i -> System.out.println(i));
		list.forEach(System.out::println);
		
	}

}
