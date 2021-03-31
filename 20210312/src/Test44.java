

/*
 	다차원배열(2차원 이상의 배열)
 	- 다차원 배열이란? 
 		2차원 이상의 배열을 의미하며, 배열 요소로 또 다른 배열을 가지는 배열의 의미
 
	2차원 배열 사용하기
	1. 2차원 배열 메모리의 주소값을 저장할 참조변수 선언 문법(2차원 배열 선언)
		타입[][] 참조변수명;
		타입 참조변수명 [][];
 		타입[] 참조변수명[];
 		
 	2. 2차원 배열 메모리 생성	
 		- 행의 크기와 열의 크기를 모두 정하면 정방형의 2차원 배열메모리가 생성
 		- 행 크기만 지정하고 열크기는 동적으로 지정하는 방법으로 배열 메모리를 생성 할 수 있음
 		  행 크기는 반드시 지정 해야합니다.
 		- 문법
 		 	참조변수명 = new 타입[행크기][열크기]; 
 		 	
 	3. 2차원 배열 선언과 동시에 배열 메모리 생성	
 	
 		타입[][] 참조변수명 = new 타입[행크기][열크기]; 
 	 	
 	4. 2차원 배열 메모리의 행의 갯수 알아내는 방법 : 참조변수명.length   중요!!
 	 	2차원 배열 메모리의 행에 대한 열의 갯수를 알아내는 방법 : 참조변수명[행인덱스위치번호].length 중요!! 
 		
  */

public class Test44 {

	public static void main(String[] args) {
		// 예) 3행 2열 크기의 2차원 배열 선언, 생성
		
		int[][] num = new int[3][2]; 
		
		
		// 예) 4바이트 크기의 정수값들을 저장시킬 2차원 배열 메모리 만들기(생성)
		// 단 3개의 행 크기만 지정하고 , 열 크기는 지정하지않으면?
		// 중요! 행크기는 반드시 지정해야함!!
		
		int[][] num1 = new int[3][]; 
		
		// int[][] num2 = new int[][3];  에러남 행크기 반드시 지정!!
		// int[][] num3 = new int[][];		마찬가지임..

		
		// 2행 5열 2차원 int값을 저장할 i 배열 선언 및 생성
		
		int[][] i = new int[2][5];
		
		System.out.println(i.length); // 2차원 배열의 행의 갯수 : 2
		
		//0번째 행의 열의 갯수
		
		System.out.println(i[0].length); // 열의 갯수 : 5
		//1번째 행의 열의 갯수
		System.out.println(i[1].length);
		
		System.out.println("-------------------------------------------");
		
		//배열 선언 및 2차원 배열 생성 연습하기 1
		
		// 2행 5열 크기의 2차원 배열 만들기 (int / intArray)
		
		int[][] intArray = new int[2][5];
		
		//intArray 참조변수에 저장된 2차원 배열의 행의 갯수 얻어 출력
		System.out.println("행의 갯수 : " + intArray.length);
		
		//intArray 참조변수에 저장된 2차원 배열의 1인덱스 위치의 행에 대한 열의 갯수 얻어 출력
		System.out.println("열의 갯수 : " + intArray[1].length);
		
		
		//5행 5열 크기의 2차원 배열 만들기( char/ charArray)
		char[][] charArray = new char[5][5];
		
		//charArray 참조변수에 저장된 2차원 배열의 행의 갯수 얻어 출력
		System.out.println("행의 갯수 : " + charArray.length);
		
		//charArray 참조변수에 저장된 2차원 배열의 0인덱스 위치의 행에 대한 열의 갯수 얻어 출력
		System.out.println("열의 갯수 : " + charArray[0].length);
		
		
		
		
		
	}

}
