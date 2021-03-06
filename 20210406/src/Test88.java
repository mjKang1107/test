
//조합 4가지 중에서...
//조합 4번. 자식클래스의 생성자에서 super()키워드를 이용하여
//			부모클래스의 생성자를 명시적으로 선택하여 호출하여 조합

//부모클래스
class H{
	
	public H() {
		System.out.println("기본생성자 H");
	}
	// 매개변수 x로 값을 전달 받을 생성자
	
	public H(int x) {
		System.out.println("매개변수 x가 존재하는 생성자 H");
		
	}
	
}

//자식클래스
class I extends H{
	
	public I() {
		System.out.println("기본생성자 I");
	}
	
	public I(int x) {
		super(x);
		System.out.println("매개변수 x가 존재하는 생성자 I");
		
	}
	
}



public class Test88 {

	public static void main(String[] args) {
			I i = new I(5);
			
			//1. I(int x)생성자가 호출됨
			//2. I(int x)생성자 내부에서 super(x); 부모생성자를 호출하는 구문을 작성해 놓는다면
			//3. 부모클래스H 내부의 두번째 생성자인 H(int x)를 강제로 호출함
			//4. 이때 부모클래스H의 생성자의 매개변수 x에는 5가 전달 됨.
			
			/*
			 
			 super()메소드
			 -this()메소드가 같은 클래스의 다른생성자를 호출할때 사용된다면,
			  super()메소드는 부모클래스의 생성자를 강제로 호출할때 사용됩니다.
			  
			  -자식클래스의 인스턴스를 생성하면, 
			  해당 인스턴스에는 자식클래스의 고유멤버뿐만 아니라
			  부모클래스의 모든 멤버까지도 포함되어 있습니다.
			  따라서 부모클래스의 멤버를 초기화하기 위해서는
			  자식클래스의 생성자에서 부모클래스의 생성자까지 호출해야만 합니다.
			  이러한 부모클래스의 생성자 호출은 모든 클래스의 부모클래스인 Object클래스의
			  생성자까지 계속 거슬러 올라가며 수행됩니다.
			 -따라서 컴파일러는 부모클래스의 생성자를 명시적으로 호출하지 않는 
			  모든 자식클래스의 생성자 첫줄에 자동으로 다음과 같은 명령문을 추가하여 
			  부모클래스의 멤버를 초기화할수 있도록 해줍니다.
			  
			  문법
			  super();
			 
			  */
			
			
	}

}
