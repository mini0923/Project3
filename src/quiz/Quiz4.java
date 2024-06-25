package quiz;

public class Quiz4 {

	public static void main(String[] args) {
		
		int math = 90;
		int english = 70;		
		int korean = 100;
		
		int  totalScore = math + english + korean;
		double avgScore = (totalScore / 3.0);
		
		System.out.println("세 과목의 총점은 : " + totalScore);
		System.out.printf("세 과목의 평균은 : "+ "%.1f" , avgScore);
		
	}

}
