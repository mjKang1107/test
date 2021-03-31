


//사용자 정의 메소드 만들기 연습
public class Test48 {
	
	//메소드를 만들어 보자 (메인 위에 만들어야함)
		//메소드이름: javaSpeak
		//기능: "쉬운 자바!" 출력 하는 기능
	
	public static void javaSpeak() {
		System.out.println("쉬운 자바!");
		
		
	}
	
		//메소드이름: absTest
		//기능: "절대값을 구하는 메소드" 출력 하는 기능
	
	public static void absTest() {
		System.out.println("절대값을 구하는 메소드");
		
	}
		
		//메소드이름: move
		//기능: "이동하라!" 출력 하는 기능

	public static void move() {
		System.out.println("이동하라!");
		
	}
	
		
	
		public static void main(String[] args) {
			//클래스명.메소드명으로 호출(실행해야함)
			//static이 있을 경우 class명 생략 가능
			
			Test48.javaSpeak();
			
			absTest();
			
			move();
	}

}
