
public class Test2 {

	// 자바 프로그램이 시작되는 공간
	// main 메소드(쓰레드) 
	public static void main(String[] args) {
		// 변수 생성 및 변수에 값 저장 ( 변수 선언 및 초기화 ) 연습하기
		
		// 4바이트 크기의 정수 데이터를 저장할 변수 n 만들기
		int n;
		
		// n 변수에 123 저장하기
		n = 123;
		System.out.println(n);
		
		// 4바이트 크기의 실수 데이터를 저장할 변수 f 만들기
		float f;
		
		// f 변수에 3.14 저장하기
		f = 3.14f;
		System.out.println(f);
		
		// 2바이트 크기의 문자를 저장할 변수 c 만들기 및 문자 'A' 초기화
		char c = 'A';
		System.out.println(c);
		
		// 2바이트 크기의 문자를 저장할 변수 c2 선언 및 '홍' 문자 초기화 
		char c2 = '홍';
		System.out.println(c2);
		
		// 1바이트 크기의 논리값을 저장할 변수 b 선언 및 true 초기화
		boolean b = true;
		System.out.println(b);
		
		// 4바이트 크기의 실수값을 저장할 변수 b2 메모리 만들기
		float b2;
		
		// b2 변수에 150.3 저장 
		b2 = 150.3f;
		System.out.println(b2);
		
		
		// 문자열을 저장할 변수 타입 -> String 클래스 타입
		// 예) 홍길동 문자열을 저장할 name 변수 선언
		String name = "홍길동";
		
		// 참고 : java에서 문자열 나타낼 때 "큰 따옴표"로 나타낼 문자열을 감싼다.
		System.out.println(name);
		
		
	}

}
