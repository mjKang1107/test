/*
 Object클래스
 
 1.java.lang.Object
 2.모든 자바클래스의 최상위 클래스(부모클래스)
 3.명시적으로 특정 자식클래스 extends 특정부모클래스를 상속 받지 않으면
   Object클래스를 특정 자식클래스에서 상속 받음
 4.Object클래스 내부에 만들어져 있는 자주 사용되는 생성자와 메소드들	
 	- protected Object clone()메소드 : 현 객체와 똑같은 객체를 복사해서 만들어 리턴하는 메소드
 	
 	- boolean equals(Object obj)메소드 : 
 	매개변수 obj로 전달 받는 객체와 현재 객체를 비교하여 같은 객체이면 true리턴/다르면 false
 	
 	- int hashCode()메소드 : 현 객체 메모리를 식별할 수 있는 정수간인 해시코드값을 리턴하는 메소드
 	
 	- String toString()메소드 : 현 객체메모리의 정보를 문자열 형태로 리턴하는 메소드
 	
 	- protected void finalize()메소드 : 
 	  객체를 더 이상 사용하지 않을때 쓰레기 수집기능 수행 하는 메소드
 
 	- void notify()메소드 : 현 객체에 대해 대기하고 있는 하나의 스레드를 꺠우는 기능의 메소드
 	
 	- void notifyAll()메소드 : 현 객체에 대해 대기하고 있는 모든 스레드를 꺠우는 기능의 메소드
 	
 	- void wait()메소드 : 다른 스레드를 꺠울때까지 현재 스레드를 대기시키는 기능의 메소드
 	
 	- Class getClass()메소드 : 현 객체를 생성 할때 클래스 이름을 Class클래스 타입으로 리턴하는 메소드
 */

class Point /*extends Object*/{
	//설명 : Point클래스는 특정부모클래스를 상속받도록 명시적으로 작성해놓지 않았기때문에 
	//     모든 클래스의 최고 부모클래스인 Object클래스를 상속받는 클래스이다.
	//     따라서 object클래스의 모든 메소드를 Point 클래스 내부에서 접근해서 사용할 수 있다.
	
	
}

public class Test114 {

	public static void main(String[] args) {
		Point obj = new Point();
		//obj참조변수가 참조할 수 있는 Point객체 생성시 사용한 클래스 이름 얻기
		System.out.println(obj.getClass()); //class Point
		
		//obj참조변수가 참조할 수 있는 Point객체 생성시 사용한 클래스이름을 문자열로 변환해서 반환
		System.out.println(obj.getClass().getName()); //Point
		
		//obj참조변수에 저장된 Point객체메모리의 주소값을 10진수 고유코드값 (해시코드)로 반환
		System.out.println(obj.hashCode()); //1404928347
		System.out.println(new Point().hashCode()); //604107971
		
		//obj참조변수에 저장된 Point객체메모리의 정보를 문자열로 만들어서 반환
		//문자열정보 : (클래스이름)@(16진수 형태의 해시코드 값) 반환
		System.out.println(obj.toString()); //Point@53bd815b
		System.out.println(new Point().toString()); //Point@7637f22 ( toString은 object거임..)
	}

}
