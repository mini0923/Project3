package quiz;

public class Quiz2 {

	public static void main(String[] args) {

		int x =10;
		
		int y =20;
		
		int result = (x++) + (--y) ; // x는 ++ 연산자가 뒤에 있어, 라인이 끝나야지 1이 증가한다. 현재 x는 10 
															   // y는 -- 가 앞에 있으므로 먼저 -1값이 감소한다. 현재 y 는 19
															   // 답은 10 + 19 = 29

		System.out.println(result);
	}

}