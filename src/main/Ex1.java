package main;

public class Ex1 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = -20;
		
		// 부호 그대로 유지
		System.out.println(+num1);		// 10
		System.out.println(+num2);		//-20
		
		//부호를 반대로 바꾸기
		System.out.println(-num1);		//-10
		System.out.println(-num2);		//20
		
		// 부호연산자는 값 자체를 바꾸지 않고, 값을 카피해서 사용한다.
		System.out.println(num1);			//10
		System.out.println(num2);			//-20
		
	}

}