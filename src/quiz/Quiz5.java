package quiz;

public class Quiz5 {

	public static void main(String[] args) {
		
		int age = 26;
		
		boolean result1 = age <= 40;
		boolean result2 = age == 40;
		boolean result3 = age != 40;
		
		System.out.println("본인의 나이가 40세 이하인가요? :" + result1);
		System.out.println("본인의 나이가 40세 인가요? :" + result2);
		System.out.println("본인의 나이가 40세가 아닌가요? :" + result3);

	}

}
