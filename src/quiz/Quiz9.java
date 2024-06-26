package quiz;

public class Quiz9 {

	public static void main(String[] args) {
	
		char ch = (5 >	3) ? '오': '삼' ;
		
		System.out.println(ch);
	
		
		// 다음 코드를 보고 풀이과정과 예상결과값을 주석으로 작성하세요
		
		int x = 10;	
		int y = 20;
		int result = (x > 10) ? y+10 : y -10;	// x 는 10보다 크지 않으므로 (false), y-10 수행이된다. 
		System.out.println(result);		// y = 10

	}

}
