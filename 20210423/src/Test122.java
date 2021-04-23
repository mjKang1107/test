

/*

 주제 : 자바의 Wrapper역할을 하는 클래스들에 대해서 알아보자.
 
 Wrapper역할을 하는 클래스란? 총 8개(기본형데이터와 같음)
 - 기본자료형의 데이터들을 객체의 변수에 저장하기 위해 사용되는 클래스
 
 Wrapper역할을 하는 클래스들의 종류
 - int     ->	Integer클래스
 - float   ->	Float클래스
 - double  ->	Double클래스
 - boolean ->	Boolean클래스
 - byte	   ->   Byte클래스
		.......
		
예) int a = 1;
   Object obj = 1; 		1은 int데이터이기때문에 		int  -> Integer
   Object obj = 10.1; 	10.1 double데이터이기때문에 	double -> Double   new Double(10.1);
 												float  -> Float
  
 
 기본 자료형의 데이터를 Wrapper클래스에 대한 객체에 저장하는 이유는?
 예)
 	showData(Object obj)메소드를 반드시 활용해야하는 상황

 int -> 7
 int -> Integer래퍼클래스 제공 -> new Integer(7);


 public static void showData(Object obj){
 	
 	//Object클래스의 toString()메소드를 통하여 반환되는 문자열을 출력함.
 	System.out.println(obj.toString());
 	
 }
 
 이 메소드를 통해서 출력해야 하는 데이터가 정수3과 정수 7이다.
 이러한 상황에서 정수 3과 정수 7이 Object클래스를 상속하는 객체형태가 되어야만..
 showData(Object obj)메소드 호출시 전달인자로 전달될 수 있음
 객체의 참조값을 전달 받는 자리에는 기본 자료형 데이터를 전달해야할 경우
 기본자료형의 데이터를 기본자료형의 대응되는 각각의 wrapper클래스들에 대한 객체의 변수에 저장후
 매개변수로 Wrapper역할을 하는 클래스에 객체 자체를 전달해서 사용해야한다.
 
*/

//int데이터를 저장하기 위한 wrapper역할을 하는 Integer클래스 직접 만들어 보기

class IntWrapper extends Object{
	
	//int데이터를 저장할 변수
	private int num;
	
	public IntWrapper(int data) {
		num = data;
	}
	
	//Object클래스의 toString()메소드를 IntWrapper클래스에 맞게 오버라이딩
	@Override
	public String toString() {
		return "" + num;
	}
	
	
}

public class Test122 {
	
	//기본데이터 정수3과 정수7을 Wrapper클래스에 대한 객체를 생성해서 
	//매개변수로 전달 받아 정보를 출력해줄 메소드
	public static void showData(Object obj) {
		System.out.println(obj.toString());
		
	}
	
	public static void main(String[] args) {
		
		IntWrapper intWrapper = new IntWrapper(3); // <- Integer래퍼클래스 역할을 함
		
		//IntWrapper클래스에 대한 intWrapper참조변수에는 기본자료형의 데이터 3을 저장할 수 없다.
		//그래서 int값인 3에 대한 우리가 직접 만든 InWrapper래퍼역할을 하는 클래스에 대한
		//객체 생성시 생성자를 호출해 3을 전달해 new IntWrapper(3)객체에 저장시키고
		//new IntWrapper(3); 객체의 주소값을 intWrapper참조변수에 저장시키자
		
		//new IntWrapper(3);객체에 3이 저장되어 있으므로
		//new IntWrapper(3);객체를 showData메소드 호출시 전달하여 사용할 수 있다.
		Test122.showData(intWrapper);
		
		//정수 7을 showData메소드 호출시 전달하여 "7"문자열 출력하기
		/*Test122.*/showData(new IntWrapper(7));
		
		
		
		

	}

}
