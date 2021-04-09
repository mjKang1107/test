
// 주제 : 자식 클래스 내부에서 부모클래스의 메소드를 재구현(오버라이딩) 했을때..
//  	 상속되지 않고 은닉된 부모클래스의 메소드를 호출하는 방법
//-> 오버라이딩을 통해 상속되진 않지만 사용하고 싶을때 super.키워드로 메소드를 호출할수있다!!!!!!!!!!!

class P1{
	
	public void p1() {
		System.out.println("부모P1클래스의 p1메소드");
	}
	
	
}

class C1 extends P1{
	
	
	//메소드 오버라이딩
	@Override
	public void p1() {
		//메소드의 구현부 재정의 -> p1() 상속안됨
		
		super.p1(); // super키워드로 호출은 가능하다!! 
		
		System.out.println("자식C1클래스에서 재정의된 p1메소드");
	}

	public void c1() {
		System.out.println("자식C1클래스의 c1메소드");
	}
	
	
}


public class Test99 {

	public static void main(String[] args) {
		C1 c = new C1();
		
		c.p1();//오버라이딩된 p1()메소드 호출!
		//부모P1클래스의 p1메소드 <- super.은닉된 부모객체의 p1()메소드 호출
		//자식C1클래스에서 재정의된 p1 <- 오버라이딩된 메소드 내부에서 재정의된 코드 출력문
	}

}
