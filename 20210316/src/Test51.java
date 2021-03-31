
//사용자 정의 메소드 만들기 연습
public class Test51 {
	
	// 메소드 이름 : hiEveryone
	// 매개변수 X , 리턴값 X
	// 기능 : "출근 Start!" 출력
	public static void hiEveryone() {
		System.out.println("출근 Start!");
		
	}
	
	// 메소드 이름 : hiEveryoneend
	// 매개변수 X , 리턴값 X
	// 기능 : "동료와 마주쳤습니다." 출력
	public static void hiEveryoneend() {
		System.out.println("동료와 마주쳤습니다.");
		
	}
	
	// 메소드 이름 : hiEveryone
	// 매개변수 o  -> 정수형 age
	// 리턴값 X
	// 기능 : "좋은 아침입니다." 
	// "제 나이는 13세 입니다."
	// " 잘 부탁드립니다." 출력
	public static void hiEveryone(int age) {
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("잘 부탁드립니다.");
		
	}
	
	//메소드 이름 : byEveryone
	//매개변수 X
	//기능 : "오늘도 수고많으셨습니다." 출력
	//리턴할 값 0 ->" 다음에 뵙겠습니다"
	public static String byEveryone() {
		System.out.println("오늘 수고 많으셨습니다.");
		return "다음에 뵙겠습니다.";
	} 
	
	public static void main(String[] args) {
	
		/*출력결과
		출근 Start!
		동료와 마주쳤습니다.
		좋은 아침입니다.
		제 나이는 13세 입니다.
		잘 부탁드립니다.
		오늘 수고 많으셨습니다.
		다음에 뵙겠습니다.*/
		
		hiEveryone(); //호출!!
		hiEveryoneend();
		hiEveryone(13);
		System.out.println(byEveryone()); 
		//String value = byEveryone(); // 리턴구문도 반환받아 value 변수에 저장
		//System.out.println(value);
		// 리턴할때 괄호안쓰고 한칸 띄움 // 리턴구문 메인안에서 출력 // 리턴구문 아닐때 메인 위에 출력
		
		
	}
	
}
