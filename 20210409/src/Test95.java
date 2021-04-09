
/*
 	다운 캐스팅?
 	- 업캐스팅으로 인하여 부모클래스 타입의 참조변수로 
 	  자식객체의 모든 멤버에 접근 하는 것이 불가능하여(업캐스팅의 단점)
 	  다운 캐스팅이라는 개념이 나옴
 	- ***다운 캐스팅이란? 
 	  자식클래스 타입의 참조변수에 부모클래스의 참조변수에 저장된 자식객체의 주소를
 	  저장 하는 형태
 	
 	
 */

class Parent1{
	public void parentPrn() {
		System.out.println("부모클래스 : parentPrn메소드");

	}
		
}

class Child1 extends Parent1{
	public void childPrn() {
		System.out.println("자식클래스 : childPrn메소드");
	}
	
}



public class Test95 {

	public static void main(String[] args) {
		/* - 다운 캐스팅이란? 
		   자식클래스 타입의 참조변수에 부모클래스의 참조변수에 저장된 자식객체의 주소를
		   저장 하는 형태 */
		   
		  // 부모클래스 타입의 참조변수를 선언하고 참조변수에 부모객체 생성하여 주소 저장
		  Parent1 p1 = new Parent1();
		   
		  // 자식클래스 타입의 참조변수 선언
		  Child1 c1;
		  
		  // 다운캐스팅
		  //c1 = p1; // 자동형변환 안됨! 에러!
		  //c1은 참조할수 있는 멤버가 두개 (parentPrn();,childPrn();)
		  //p1은 참조할수 있는 멤버가 한개 (ParentPrn();)
		  c1 = (Child1)p1; // 강제 형변환 -> 자식클래스 타입으로 다운캐스팅 해줘야함
		  
		  Child1 c2 = (Child1)new Parent1();
		  // 위의 내용은 잘 못된 예이며 업캐스팅 다음에 다운캐스팅 해줘야함 
		  //https://m.blog.naver.com/dbsgp535/221518611852
		  
		  
		  
		  
		  
	}

}
