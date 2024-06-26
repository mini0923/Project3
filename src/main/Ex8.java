package main;

public class Ex8 {

	public static void main(String[] args) {

		// 삼항연산자를 사용해서 부모님의 나이 비교하기
		int motherAge = 47;
		int fatherAge = 50;
		
		// motherAge > fatherAge  해당 조건은 틀리므로, false 값에 해당하는 "아빠" 출력
		String str = (motherAge > fatherAge ) ?  "엄마" : "아빠";	
		System.out.println("누가 나이가 많나요? :" + str);
		
		char ch = (motherAge > fatherAge) ? 'm' : 'f';
		System.out.println(ch);
		
		int i = (motherAge > fatherAge) ? 1 : 2	 ;
		System.out.println(i);
		
		boolean bool = (motherAge > fatherAge) ? true : false;
		System.out.println(bool);
		
	}

}
