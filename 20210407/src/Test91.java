import javax.management.remote.SubjectDelegationPermission;

//연습2
/*
 
  A클래스 만들기
  
  	기본생성자 만들기
  	출력 " 기본생성자A "
  	
  	매개변수x 하나가 존재하는 생성자 만들기
  	출력 "매개변수x를 받는 생성자A = " + x
  	
  	B클래스 만들기 (A클래스 상속받기)
  	
  	기본생성자 만들기
  	부모A클래스의 매개변수x 하나가 존재하는 생성자 호출시 30 전달!
  	
  	매개변수x
  	출력  "매개변수x를 받는 생성자B = " + x
 
 */

class A{
	
	public A() {
		System.out.println("기본생성자A");
	}
	
	public A(int x) {
		System.out.println("매개변수 x를 받는 생성자A = " +  x);
	}
	
	
	
}

class B extends A{
	
	public B() {
		super(30);
	}
	
	public B(int x) {
		System.out.println("매개변수 x를 받는 생성자B = " + x);
	}
	
	
}


public class Test91 {

	public static void main(String[] args) {
		// B클래스로부터 객체 생성! 기본생성자 호출! 참조변수 이름 b
		B b = new B();
		//출력결과를 아래에 복사하여 붙여 넣기 하시오.
		//----------------------------
		// 매개변수 x를 받는 생성자A = + 30
		//----------------------------
		
		//호출 순서 상세히 적으시오
		//순서1. public B()기본생성자 호출됨
		//순서2. super(30)을 통해 부모객체A의 매개변수x를 받는 생성자 호출! 호출시 30을 전달
		//순서3. 부모객체A의 매개변수 x가 존재하는 부모생성자가
		//System.out.println("매개변수 x를 받는 생성자A = " +  x)으로 출력된다.
		//순서4. B객체 생성후 b참조변수에 객체의 주소값 저장
		
		//어떤 경우 super()를 사용하는지..한줄로 적으시오
		//->부모의 생성자를 명시적으로 호출하려 할때 super()키워드 사용
		
	}

}
