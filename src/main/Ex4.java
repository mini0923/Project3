package main;

public class Ex4 {

	public static void main(String[] args) {

		int mathScore = 93;
		int engScore = 70;
		
		int totalScore = mathScore + engScore ;

		// 평균 점수 계산
		// 1. int 형 변수에 결과를 저장하고 2로 나누기. 
		int avgScore = totalScore / 2;			// int / int
		System.out.println(avgScore);     // 81

		// 2. double 형 변수에 결과 저장하고 2로 나누기
		double avgScore2 = totalScore / 2;		// int / int
		System.out.println(avgScore2);				// 81.0
		
		// 3. double 형 변수에 결과 저장하고 2.0으로 나누기
		double avgScore3 = totalScore / 2.0;	// int / double -> double 형 변환
		System.out.println(avgScore3);				// 81.5
		
		
		
	}

}
