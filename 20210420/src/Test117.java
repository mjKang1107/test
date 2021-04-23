
/*
 Object클래스 내부에 만들어져 있는 
 boolean equals(Object obj)메소드
 -> 매개변수obj로 전달받는 객체와 현재 객체에 저장된 데이터(내용)을 비교해서 같으면 true리턴
  
 
 */

public class Test117 {
	public static void main(String[] args) {
		//String클래스를 이용해 객체 생성
		String a = new String("안녕");
		String b = a;
		
		if(a == b) {//참조변수 a가 참조할 수 있는 객체메모리의 주소와
					//참조변수 b가 참조할수 있는 객체메모리의 주소를 비교
			
			System.out.println("a,b 두참조변수는 하나의 String객체 메모리를 참조한다");
			
		}else {
			System.out.println("a,b 두참조변수는 서로다른 String객체 메모리를 참조한다");
		}
		
		System.out.println("--------------------------------------------------");
		
		//두개의 String객체를 생성하여 String객체 내부에 저장되는 문자열 데이터를 비교
		String c = new String("hello");
		String d = new String("hello");
		
		if(c.equals(d)) {//c참조변수가 참조할 수 있는 String객체 내부의 "hello"문자열 데이터와 
						//d참조변수가 참조할 수 있는 String객체 내부에 저장된 "hello"문자열 데이터 비교시
						//equal(Object obj)메소드를 사용
			System.out.println("두 참조변수 a,b가 참조하고 있는 " + "각각의 String객체 내부에 저장된 문자열은 같다");
		}else {
			System.out.println("두 참조변수 a,b가 참조하고 있는" + "각각의 String객체 내부에 저장된 문자열은 다르다");
		}
		//참고 :
		//String 클래스 내부에는 Object클래스의 equals메소드가 
		//두 String객체에 저장된 문자열 데이터를 비교할 수 있게 끔
		//메소드 오버라이딩(재정의) 되어 있기 때문에.. 두 String객체 내부의 문자열 데이터를 비교할 수 있다.
	}

}
