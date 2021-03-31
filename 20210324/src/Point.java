
//클래스 설계도
public class Point {
	//변수
	int x,y;
	//기본생성자(매개변수가x)
	Point() {
		System.out.println("Point기본생성자 호출됨");
		x = 2;
		y = 2;
		
	}
	//이름은 같게 매개변수 달리해서 여러개 생성자 생성가능(생성자 오버로딩)
	//x변수의 값을 매개변수로 전달받아 초기화할 생성자
	Point(int n_x) {
		x = n_x;
		
	}
	//x,y 변수의 값을 매개변수로 전달받아 초기화할 생성자
	Point(int n_x , int n_y){
		x = n_x;
		y = n_y;
		
	}
	//x변수의 값을 매개변수로 전달받아 초기화할 메소드(void-리턴받지않는다)
	void setX(int n_x) {
		x = n_x;
		
	}
	//y변수의 값을 매개변수로 전달받아 초기화할 메소드
	void setY(int n_y) {
		y = n_y;
		
		
	}
	//x변수에 저장된 값을 제공(반환, 리턴)해주는 메소드(void가 아니면 return ; 구문있어야함)
	int getX() {
		return x;
	}
	//y변수에 저장된 값을 제공해주는 메소드
	int getY() {
		return y;
	}
	//x변수, y변수에 각각 저장된 값을 출력 해주는 기능의 메소드
	void prn() {
		System.out.println("출력 x , y : " + x + ", "+ y);
		
	}
	
}//Point 클래스 끝
