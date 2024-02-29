/*
 * Set 인터페이스
 * 		- HashSet (상속받은 클래스) : 내부적으로 HashMap을 이용해서 만들어졌으며
 * 		- HashSet이란 이름은 해싱을 이용해서 구현했기 때문에 붙여진 것입니다.
 * 		- TreeSet은 이전 검색 트리(binary search tree)라는 자료구조의 형태로
 * 		  데이터를 저장하는 컬렉션 클래스입니다. 정렬이 됩니다.
 * 		1. 여러가지 자료형(기본자료형, 참조형 모두)의 Data를 모두 저장할 수 있습니다.
 * 			ex)int, double, char, boolean, String etc
 * 		2.순서 없이 입, 출력 합니다.
 * 		3.중복된 Data를 저장하지 못합니다.
 * 			예)로또 번호6개를 중복 되지 않게 하는 프로그램시 이용
 * 
 * */

package ex15_6_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2_Generics_add_print {

	public static void main(String[] args) {
		//HashSet 객체 생성
		HashSet<String> set = new HashSet<>();
		//데이터 저장
		set.add("자바");
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");
		System.out.println("저장된 데이터의 수 = "+ set.size());
		
		//set 객체가 보관하고 있는 데이터 객체 출력
		System.out.println(set);
		
		//iterator() : set에 있는 데이터를 모두 가져옵니다.
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str= iterator.next();
			System.out.println(str);
		}
	}
}
