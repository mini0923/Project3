package quiz;

public class Quiz7 {

	public static void main(String[] args) {

		boolean result1 = (1 == 2) || (1 < 2) ;	// || 연산자는 둘중 하나만 true여도 true  결과값 : true
		boolean result2 = true && false;			// &&연산자는 둘다 true 여야만 true 결과값 : false
		boolean result3 = !false;							// ! 연산자는 반대로 바꾸기에 false -> true 로 변경된다. 결과값 : true  
		
		int x = 1;
		int y= 5;
		boolean result4 = (x < y) || (x == y) ; 	// || 연산자는 둘중 하나만 true여도 true  결과값 : true
	}

}
