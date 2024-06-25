package main;

public class Ex5 {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		
		boolean result1 = (x  > y) ;
		System.out.println("x가 y 보다 큰가요? :" + result1 );
		
		boolean result2 = (x >=y);
		System.out.println("x가 y보다 크거나 같나요? : "+ result2);
		
		boolean result3 = (x  < y) ;
		System.out.println("y가 x보다 큰가요? : " + result3);
		
		boolean result4 = (x <=  y) ;
		System.out.println("y가 x보다 크거나 같나요? : " + result4);
		
		boolean result5 = (x  == y) ;
		System.out.println("x랑 y랑 값이 같나요? : " + result5);
		
		boolean result6 = (x != y) ;
		System.out.println("x랑 y랑 값이 다른가요? : "  + result6);
		
		
	}

}
