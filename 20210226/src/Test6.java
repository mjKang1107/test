
public class Test6 {

	public static void main(String[] args) {
		/* 자동 형변환, 강제 형변환 연습 */
		/*
			byte 1바이트(-128 ~ 127)
			short 2바이트(-32768 ~ 32767)
			int 4바이트(-2147483648 ~ 2147483647)
			long 8바이트(-922경 ~ 922경)

		 */
		
		//1바이트 크기의 정수 127을 저장시킬 b라는 이름의 변수 말기 (선언)
		byte b = 127; // 저장가능
		
		//4바이트 크기의 정수를 저장시킬 i 변수 선언 후 100을 저장
		int i = 100; // 저장가능
		
		//b변수에 저장되어 있는값 + i변수에 저장되어 있는 값의 결과 합 출력
		System.out.println(b + i ); // + 연산 전에 b변수에 저장된 int타입으로 자동 형변환
									//i 변수에 저장된 int값과 + 연산하게 됨
		
		System.out.println(10 / 4); // 2(몫만 나타냄/나머지x)
		
		System.out.println(10.0 / 4); // 10.0 / 4.0 = 실수값이 크기때문에 큰걸로 맞춰줌 = 2.5
		
		//65 아스키코드값을 char형의 문자로 강제 형변환 하여 출력
		System.out.println((char)65);
		
		//2.9 + 1.8 = 3.8
		System.out.println((int)2.9 + 1.8); //3.8 
		//2.9를 소수점자리 없애는 정수 2로 강제 형변환 해주면된다->캐스팅
		
		//2.9 + 1.8의 합의 결과가 4가 되도록 출력
		System.out.println( (int)(2.9 + 1.8) ); //4
		
		
		//2.9 + 1.8의 합의 결과가 3이 되도록 출력
		System.out.println((int)2.9 +(int)1.8); //3

	}

}
