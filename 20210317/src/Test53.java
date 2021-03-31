/* 6. 객체 지향 프로그래밍을 하기 위한 3단계 기법*/

//사과나무객체

/* 1단계 - 현실세계에 존재하는 객체를 모델링 하는 단계 (현실 세계의 객체의 데이터, 동작(기능)을 추출)
		
		데이터 - 빨간색 사과, 100살, 사과나무
		동작(기능) - 흔들린다, 사과가 나무에서 떨어진다
		
		 
   2단계 - 자바 프로그램에서의 클래스 설계도 만들기 단계(변수 + 메소드)	 
*/
class Tree{ // 나무 설계도 (나무 class)
	//변수만들기 : 데이터 - 빨간색 사과, 100살, 사과나무 저장용도
	String name;
	String color;
	int age;
	
	//메소드만들기 : 동작(기능) - 흔들린다, 과일이 떨어지다 표현용도
	 void move() {
		System.out.println("흔들린다.");
	}
	
	void down() {
		System.out.println("과일이 떨어지다.");
		
	}
	
}


public class Test53 {
	public static void main(String[] args) {
		//3단계 - 자바 프로그램 측면에서의 클래스설계도를 참조하여 객체 생성 하는 단계 
		//사과나무 객체 메모리 만들기 -> JVM메모리의 힙영영ㄱ에 사과나무 객체 메모리가 올라감
	Tree tree1 = new Tree();
		tree1.name = "사과나무";
		tree1.color = "빨간색사과";
		tree1.age = 100;
		
		tree1.move();
		tree1.down();
		
	//배나무객체 메모리 만들기 (객체의 주소값을 저장할 참조변수 이름 tree2)
	// 저장시킬 데이터 -> 배나무, 파란색 배, 99살 , 
		
		Tree tree2 = new Tree();
			tree2.name="배나무";
			tree2.color="파란색 배";
			tree2.age=99;
			
			tree2.move();
			tree2.down();
			
			
		
		

	}

}
