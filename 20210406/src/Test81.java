
//접근제어자 - 데이터 보호를 위해 

//private - 같은 클래스만 가능 / 상속됨
//public - 모두 접근 가능
//default - 변수 앞에 안써주면 디폴트 / 같은 패키지에 속하는 클래스에서만 접근 가능
//protected - 같은 패키지 모두 가능 / 다른패키지의 자식클래스 가능(임포트구문 써주기)

//접근범위 : public>proteted>default>private 

//주제 : 상속관계에서의 private멤버 알아보기

class A{
	public int p;
	
	//private(캡슐화,은닉,보호) 접근 제어자를 이용해 n변수 선언
	private int n;
	
	//위 은닉, 보호된 private 으로 선언된 n변수에 새로운데이터를 저장 하기 위해 
	//public으로 선언한 setN메소드 만들기
	public void setN(int n) {
		this.n = n;
	}
	//위 은닉, 보호된 private 으로 선언된 n변수에 저장된값을 외부클래스에 제공 해주기 위해
	//public으로 선언한 getN메소드 만들기
	public int getN() {
		return n;
	}
	
}// class A

//A클래스를 상속받아 새로 정의 하는 B 클래스 만들기

class B extends A{
	
	//public int p;
	//public void setN(int n){
	//    this.n = n;

	//}
	
	//public int getN() {
	//	return n;
	//}
	
	
	private int m;

	public int getM() {//->private 으로 선언된 m변수의 값을 외부 클래스 영역에 제공
		return m;
	}

	public void setM(int m) {//->private 으로 선언된 m변수의 값을 새로운 값으로 초기화
		this.m = m;
	}
	
	//n인스턴스변수에 저장된 문자열 + m인스턴스변수에 저장된 문자열을 하나의 문자열로 만들어 반환
	public String toString() {
		return "n=" + getN() + " m=" + getM();
		
	}
	
	
}

public class Test81 {

	public static void main(String[] args) {
		A a = new A();
		//p,n, setN() , getN()
		B b = new B();
		//m, setM() ,getM() , toString() / p,n, setN() , getN() -상속받은 멤버들
		
		//생성된 두 객체 A,B내부의 멤버에 (변수, 메소드)접근하기
		a.p = 5;
		//a.n = 5; A객체의 n변수는 private으로 선언되어 있음
		//다른 클래스(Test81)에서 접근 불가능
		//n변수는 캡슐화 되어 있음 
		b.p = 5;
		//b.n = 5; B객체의 상속받은 n변수는 private로 선언되어 있음
		//다른 클래스(Test81)에서 접근 불가능
		//n변수는 캡슐화 되어 있음
		
		b.setN(10); //public 접근제어자로 만들어 놓은 setN메소드 접근 가능
		
		//b.m = 20; m변수는 private멤버이기 떄문에 다른 클래스(Test81)에서 접근 불가능
		b.setM(20); //public접근제어자로 만들어 놓은 setM메소드 이용하여 접근 가능
		
		System.out.println(b.toString()); //n=10 m=20
		
		/* A객체 내부의 접근 가능한 멤버
		  			a.p = 5;
		  			a.setN(0);
		  			a.getN();
		  
		  B객체 내부의 접근 가능한 멤버
		  			b.p = 5;
		 			b.setN(0);
		 			b.getN();
		 			b.setM(0);
		 			b.getM();
		 			b.toString();
		  
		 */
		
		
		
		
		
	}

}
