
//제네릭 메소드
// -> 한번에 서로 다른 데이터형식을 출력 해주는 기능의 메소드

public class Test139 {
/*
	//사용자정의 printArray메소드 만들기
	public static void printArray(Object[] objArray) {
									//위와 같이..
									//1. Object타입의 매개변수로 모든 자식 배열을 받아야한다.
									//2. 아래의 향상된 for문에서도 마찬가지로
									//   Object타입으로 바꿔주어야한다.
		//Object최고부모클래스타입의 문제점
		//Object타입의 메모리 공간은  모든 클래스타입의 최고 부모클래스이므로
		//Object공간이 더크므로 메모리 낭비가 된다.
		//그래서 제네릭 메소드를 만들어서 사용합니다!
		
		*/
		
		//매개변수 intArray로 전달받은 Integer배열에 저장된 Integer객체의 갯수만큼 반복해서 
		//꺼내와 출력 -> 향상된 for문 사용
//		for(/*배열의 각 인덱스 위치에서 꺼내온 객체를 저장할 참조변수 선언*/Object element : /*배열*/objArray) {
//			System.out.printf("%s " , element);
//			
//		}
//			
//	}
//
	
	//제네릭 메소드란
	//매개변수로 전달받은 데이터가 Integer배열이든 Character배열이든 상관없이
	//매개변수로 전달 받은 데이터를 그대로 전달 받아 동적으로 실행하는 메소드
	
	//<> 의 뜻 -> 객체를 생성할때 전달받을 타입을 지정하는 오브 기호! 아직 결정되지 않았다...

	//사용자 정의 제네릭 printArray메소드 만들기
	//-> 제네릭 E타입으로 printArray메소드를 만들겠다 
	//제네릭으로 만드는 이유? 매개변수로 전달 받은 데이터가 뭐가 되든지 간에 
	//매개변수로 전달받은 데이터 타입에 맞게 자동으로 E가 변환되어 모든 배열을 매개변수로 받을수 있다.
	public static <E>void printArray(E[] allArray) {
		//        1번                 2번   
		//매개변수로 전달 받은 배열의 타입에 맞게 for조건식의 변수 또한 자동으로 바뀌어서..
		//자동으로 바뀐 클래스타입의 참조변수에 allArray매개변수에 저장된 전체 배열의 객체들을 꺼내어서 저장할수있다.
		for(E element : allArray){
			//3번 순서대로 바뀐다
			
			System.out.printf("%s  ", element);
		}

	}

	
	public static void main(String[] args) {
	
		//Integer객체들을 저장시킬 배열
		Integer[] intArray= {new Integer(1),2,3,4,5};
		//							0		,1,2,3,4
		
		//for문을 이용해서 위 Integer배열에 저장된 Integer객체들을 반복해서 꺼내와 출력해도 되지만
		//사용자정의 printArray메소드를 하나 만들어서 main메소드 내부에서 
		//printArray메소드를 호출 해 보자
		printArray(intArray);//->위 메소드 호출시 .. Integer배열 전달
		
		//Character객체들을 저장시킬 배열 선언과 생성
		Character[] charArray = {'A',new Character('B'),'C'};
		
		printArray(charArray);
		
		
		
	}

}
