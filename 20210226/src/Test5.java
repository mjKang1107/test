
public class Test5 {

	public static void main(String[] args) {
		/* 변수, 상수 사용하기 연습 */

		//8바이트 크기의 실수값을 저장할 PI라는 이름의 상수 메모리 선언 후 3.14 저장
		final double PI = 3.14; 
		
		
		//8바이트 크기의 실수값을 저장할 radius라는 이름의 변수 메모리 선언 후 10 저장
		double radius = 10;
		
		
		//8바이트 크기의 실수값을 저장할 circleArea라는 이름의 변수 메모리 선언 후  0 저장
		double circleArea = 0;
		
		
		//원넓이를 계산하여 circleArea변수에 저장
		 circleArea = (radius*radius)*PI;
		 //이미 선언한 변수는 데이터 부분 작성x
		 
		 System.out.println("circleArea = " + circleArea);
		 
		//원넓이 314.0 출력
		//출력형식
		//원 넓이 = 314.0
	
		
	}

}
