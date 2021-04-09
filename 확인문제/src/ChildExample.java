//5. Parent 클래스를 상속받아 Child클래스를 다음과 같이 작성했습니다.

class Parent{
	
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent()call");
		
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
		
	}
	
	
}

class Child extends Parent{
	
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	
	}
	
	
}


public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		

	}

}


/*
 출력결과 = 실행결과는 부모클래스부터 실행됨
 
Parent(String nation) call
Parent()call
Child(String name) call
Child() call

호출결과는 실행결과와 반대로 자식클래스부터 호출됨 
Child() call
Child(String name) call
Parent()call
Parent(String nation) call

*/