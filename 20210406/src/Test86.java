
//조합 4가지 중에서..
//조합 2번. 부모클래스에 기본생성자가 없는 경우 
//        자식클래스의 생성자와 부모클래스의 생성자의 조합

class D{//부모클래스 역할을 함
	private int d;
	
	 public D() {
		// TODO Auto-generated constructor stub
	}
	 
	
	//d인스턴스 변수의 값을 초기화할 생성자
	public D(int x) {
		this.d = x;
	}
}

class E extends D{
	public E() {
		System.out.println("생성자E");
	}
	
}

public class Test86 {

	public static void main(String[] args) {
		E e = new E();

	}

}
