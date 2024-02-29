package ex21_4_4_DAO1;

import java.util.ArrayList;

public class Select_CRUD_main {
	// CRUD:컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능
	// C(Create-insert), R(Read-select)
	// U(Update-update), D(Delete-delete)
	static String menus[] = { "사원번호", "사원이름", "직급", "매니저", "입사일자", "급여", "커미션", "부서번호", "종료" };

	public static void main(String[] args) {
		selectAll();
	}

	private static void selectAll() {
		Emp_DAO1 dao = new Emp_DAO1();
		ArrayList<Emp> 	list = dao.selectAll();

		if (list.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.printf("%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\t%s\t\n", menus[0], menus[1], menus[2], menus[3],
					menus[4], menus[5], menus[6], menus[7]);
			for(int i=0;i<=80;i++)
			 System.out.print("=");
			
			System.out.println();
			
			for (Emp s : list) {
				System.out.println(s.toString());
			}
		}
	}
}