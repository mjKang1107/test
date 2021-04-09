//메소드 오버라이딩 연습
//오버라이딩해주면 상속할 수 없다!!!!!!


//도형을 나타내는 DObject 클래스 만들기
class Dobject{
	Dobject next;
// DObject클래스 타입의 참조변수 next선언
//기본생성자 -> next변수의 값을 null이라는 값으로 초기화
	
public Dobject(/*안에 아무것도 없어야 기본생성자 기억하기!*/) {
	 next = null;
}

//그리는 기능을 출력하는 메소드 draw()메소드 만들기

public void draw() {
	System.out.println("Dobject draw");
}

//출력 "Dobject draw"
}//부모클래스 끝!

//DObject 클래스를 상속받는 선을 그리기 위한 Line자식 클래스 만들기
class Line extends Dobject{
	//DObject클래스 내부에 만들어져 있는 draw메소드 오버라이딩(재정의)시키지
		//재구현할 내용
		//출력 "Line"
	
	@Override
	public void draw() {
		System.out.println("Line");
	}
	//위 오버라이딩된 draw()메소드에 대한 설명
	//->부모클래스에 있는 draw()메소드를 오버라이딩 하면
	//Line클래스를 이용해 생성된 객체는 부모클래스의 draw메소드가 은닉되어 
	//상속받지 못하게 된다.
	 
}
//----------------------------------------------------

//DObject 클래스를 상속받는 선을 그리기 위한 Circle자식 클래스 만들기
class Circle extends Dobject{

	@Override
	public void draw() {
		System.out.println("Circle");
		
	}

	//DObject클래스 내부에 만들어져 있는 draw메소드 오버라이딩(재정의)시키지
	//재구현할 내용
	//출력 "Circle" 
}
//---------------------------------------------------------
public class Test98 {

	public static void main(String[] args) {
		//주제 : 오버라이딩된 메소드들 호출 해보기
		
		//Line객체 생성 ! 참조변수이름 a
		Line a = new Line();
		//a참조변수를 이용해 오버라이딩된 draw()메소드 호출!
		//(참고. 곧바로 Line객체 내부에 있는 오버라이딩된 draw()메소드가 호출됨)
		a.draw();
		//업캐스팅!
		//부모클래스DObject 타입의 참조변수p선언 후 자식객체 new Line(); 생성하여 객체주소저장
		Dobject p = new Line();
		//업캐스팅 이후 부모클래스 DObject 타입의 참조변수 p로 draw()메소드 호출
		//(참고. p참조변수에는 실제로 저장된 객체는 자식객체인? new Line()객체가 저장되어 있으므로
		
		p.draw(); //Line객체의 draw()메소드의 실행결과가 출력된다.
		
		//부모클래스DObject타입의 참조변수 p로 draw() 메소드 호출시
		//참조변수 p는 DObject클래스타입이므로
		//1. 먼저 은닉된 부모의 draw()메소드를 찾고..
		//2. 부모의 draw()와 같은 이름의 메소드가 자식클래스에 있는지 찾아서 
		//   동적으로 바인딩되어 오버라이딩된 자식클래스의 draw()메소드가 호출되어 실행되게 된다.
		
		
	}

}
