//switch 조건문 연습문제2
public class Test27 {

	public static void main(String[] args) {
		// Math클래스 내부에 있는 random함수를 호출하여
		//1~10사이의 랜덤한 값 하나를 정수로 얻어 int score변수에 저장
		
		int score = (int)(Math.random()*10)+1;
		System.out.println(score);
		
		//문자열 저장할 String 타입의 msg변수 선언하고 ""초기화
		
		String msg ="";
		
		//score = score * 100; 다른표기법으로 작성
		
		score *= 100;
		
		msg ="당신의 점수는 " + score + "이고, 상품은";
				
		switch (score) {
		case 1000:
			msg += "자전거";
		
		case 900:
			msg += " TV ";
		
		case 800:
			msg += "노트북 컴퓨터";

		case 700:
			msg += "자전거";
			
		default:
			msg += "볼펜";
			break;
}							
/*
  switch 문을 이용하여
  1000점일 경우 msg변수에 "자전거, "누적
  900점일 경우 변수에 " TV , "
  800점일 경우 " 노트북 컴퓨터, " 
  700점일 경우 "자전거,"
  위의 모든 점수에 만족하지 않을때 "볼펜"
 */
		System.out.println(msg + "입니다.");
		
		
		
		
		
		
	}

}
