import java.awt.print.Printable;

//주제 : 같은 패키지내부에서 접근 하는 접근제어자 연습

class Super{
	
	//접근제어자 public , 4바이트 크기의 정수를 저장할 num1변수 선언 후 10 초기화
	
	public int num1 = 10;
	
	//접근제어자 protected, 4바이트 크기의 정수를 저장할 num2변수 선언 후 20 초기화
	
	protected int num2 = 20;
	
	//접근제어자 default,4바이트 크기의 정수를 저장할 num3 변수 선언 후 30 초기화
	
	int num3 = 30;
	
	//접근제어자 private, 4바이트 크기의 정수를 저장할 num4 변수 선언 후 40초기화
	
	private int num4 = 40;
	
	//private선언된 num4변수의 값을 반환하는 getNum4메소드 선언(접근제어자publix)
	
	public int getNum4() {
		return num4;
		
	}
}	
	//Super클래스를 상속받아 새롭게 정의하는 Sub클래스 만들기
	
class Sub extends Super{
	
	//접근제어자 private 4바이트 크기의 정수를 저장할 num5변수 선언
	private int num5;
	
	//접근제어자 public, 리턴하지 않음 print메소드 선언
	
	public void print() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(getNum4());
		System.out.println(num5);
		
		
	}
	

	
	
	
	/* 출력할 내용
	 num1변수값 출력
	 num2변수값 출력
	 num3변수값 출력
	 num4변수값 출력
	 num5변수값 출력
	 */
	
}	
	
	
public class Test83 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.print();
		
		/*출력 결과
		 10
		 20
		 30
		 40
		 0
		 */

	}

}
