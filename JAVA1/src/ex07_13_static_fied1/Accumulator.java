/*정적 필드가 있는 클래스
 * total 필드는 객채마다 따로 생기지만
 * grandTotal 필드는 특정 객체에 상관없음
 * */
package ex07_13_static_fied1;
public class Accumulator {
	int total=0;
	static int grandTotal=0;
	
	void accymylate(int amount) {
		total += amount;
		
		//정적 필드에 amount 파라미터 값을 더하는 대입문
		grandTotal += amount;
	}
}
