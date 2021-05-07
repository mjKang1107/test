/*
  예외 : 프로그램 실행되는 도중에 발생하는 예기치 않은 에러
  
  예외처리 :
  프로그램 실행도중 예외가 발생하여 프로그램이 중단되는것을 미리 예방 하는것.
  예외가 발생한 부분은 어쩔수 없어도 이외의 영역은 끝까지 수행될 수 있도록 하기 위함.
  
  자바에서 처리 가능한 예외의 종류
  - 정수를 0으로 나눌 경우 
  - 배열의 범위를 벗어나서 배열에 접근한 잘못된 경우
  - 파일 입출력 예외
  
  주제 : 어떤 데이터를 0으로 나누어 고의적으로 예외를 발생시킨 프로그램을..
  예외가 발생될것이 예상되는 부분은 if문을 이용한 예외처리 하기.
  
 */
public class Test128 {
	public static void main(String[] args) {
		
		int a = 10;
		int b01 = 0;
		int b02 = 2;
		int c = 10;
		
		//a변수에 저장된 값을 b02변수에 저장된값으로 나누기 위하여 예외가 발생 예상되는 부분
		//조건검사해주기
		if(b02 == 0) {
			System.out.println("예외 상황이 발생됩니다.");
		}else {
			c = a / b02; //b02 변수에 저장된 값이 0이 아닐때만 나누자
			System.out.println("c->" + c);
		}
		
		if(b01 == 0) {
			System.out.println("예외 상황이 발생됩니다.");
		}else {
			c = a / b01; //b01변수에 저장된 값이 0이 아닐떄만 나누자
			System.out.println("c->" + c);
		}
		
		
		System.out.println("프로그램코드 끝까지 실행 후 종료");
		
		/*
		 	결론 : 조건문 if문으로 예외 처리를 할수도 있지만
		 		 소스 길이상 번거로운 일이 될 수 있으므로
		 		 자바에서는 예외를 검사하고 처리하는 try-catch구문을 제공함
		 */
	
		
	}

}
