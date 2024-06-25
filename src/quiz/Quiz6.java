package quiz;

public class Quiz6 {

	public static void main(String[] args) {

		int a= 7 % 2;
		boolean oddResult = (a == 1);			// 7을 2로 나누어 나머지 수가 1인가? 판별(홀수)
		System.out.println("7은 홀수인가요? : " + oddResult);
		
		int b = 10 % 2;
		boolean evenResult = (b == 0); 		// 10을 2로 나누어 나머지 수가 0인가? 판별(짝수)
		System.out.println("10은 짝수인가요? : " +  evenResult);
		
	}

}
