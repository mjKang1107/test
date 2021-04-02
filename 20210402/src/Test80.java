
/*
 	(x,y)의 한점을 표현하는 Point클래스와
	Point클래스를 상속받아 컬러점을 표현하는 ColorPoint클래스를 새롭게 만들어보자
 */

	// (x,y)의 한점을 표현하는 Point클래스(부모클래스) 선언
	// 한점을 구성하는 x,y인스턴스변수 선언
	// 인스턴스변수 x,y에 데이터를 새롭게 초기화시킬 set메소드 만들기
	// 한점의 좌표"(x,y)" 문자열형태로 출력하는 showPoint메소드 만들기


	class Point{
		int x,y;
		
		public void set(int x, int y) {
			this.x = x;
			this.y =y;
		}

		public void showPoint() {
			System.out.println("("+x+","+y+")");
		}
	}
	

	// Point부모클래스를 상속받아 새롭게 정의하는 ColorPoint클래스(자식클래스)선언
	// 점의 색을 문자열로 저장시킬 인스턴스변수 color 선언
	// 점의 색을 매개변수로 전달받아 새롭게 저장할 setColor메소드 만들기
	// color변수에 저장된 컬러점의 좌표를 출력하는 기능의 showColorPoint메소드 만들기
		// 출력기능
		// 1. color변수의 값 출력
		// 2. 한점의 좌표"(x,y) 문자열형태로 출력

	class ColorPoint extends Point{
		String color;

		public void setColor(String color) {
			this.color = color;
		}

		public void showColorPoint() {
			System.out.print(color);
			showPoint(); // Point 클래스로 상속받은 showPoint메소드 호출가능
		}
	}


// 출력 결과
//red(3,4)
		// 1. ColorPoint객체 생성, 참조변수 이름 cp
		// 2. 부모클래스인 Point클래스로부터 상속받은 set메소드 호출시 3,4 전달
		// 3. ColorPoint객체의 color변수에 "red"문자열 저장하기 위해 메소드 호출
		// 4. 컬러점의 좌표를 출력하는 showColorPoint메소드 호출


public class Test80 {
	public static void main(String[] args) {
		
		ColorPoint cp = new ColorPoint();
		cp.set(3,4);
		cp.setColor("red");
		cp.showColorPoint();
		
	}
}