package quiz;

public class Quiz8 {

	public static void main(String[] args) {

		// int 형 x 선언 후 80대입
		// 논리연산자를 사용하여 x가 50 < x  < 100 범위에 포함되는지 확인 후 출력
		int x = 80; 
		boolean result1 = (50<x ) && (x<100);	// (true/ true)
		System.out.println("x는 50~100 범위에 포함되나요? : " + result1);
		
		// int 형 y 선언 후 5대입
		// 논리연산자를 사용하여 y가 10보다 작거나 30보다 큰지 확인 후 출력
		int y =5;
		boolean result2 = (y <10) || (y>30);	// (true / false)	
		System.out.println("y가 10보다 작너가 30보다 큰가요? : "+result2);
		
	}

}
