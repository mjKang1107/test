//문제2
/*배열의 인덱스가 범위를 벗어날 떄 발생하는..
 * ArrayIndexOutOfBoundsException을 처리하는 프로그램을 작성하라.
 */

public class Test2 {
	public static void main(String[] args) {
		//정수형(4) intArray 배열 만들기 크기 5
		int[] intArray = new int[5];
		
		//0번째 인덱스 0으로 초기화
		intArray[0] = 0;
		
		//try-catch 단축키 -> 영역지정 후 Alt+Shift+z  y
		
		try {
			for(int i=0; i<5; i++) {
				//i변수값이 4일때.. ArrayIndexOutOfBoundsException예외 발생 
				//-> 인덱스4까지밖에 없는데 5가 되므로 배열의 범위 넘어감
				intArray[i+1] = i+1 + intArray[i]; 
				System.out.println("intArray[" + i + "]=" + intArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어 났습니다.");
			e.printStackTrace();
		} 
		
//출력결과
//		intArray[0]=0
//		intArray[1]=1
//		intArray[2]=3
//		intArray[3]=6
//		배열의 인덱스가 범위를 벗어 났습니다.
/*java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at Test2.main(Test2.java:19)*/		
		
	}

}

