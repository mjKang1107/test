
public class Test7 {

	public static void main(String[] args) {
		// 문제1. 자바의 기본 데이터 타입이 아닌 것은 ? 3>
		//  1>byte
		//	2>double
		//	3>String
		//	4>boolean
		
		
		// 문제2. 값이 365인 YEAR, 30인 MONTH, 7인 WEEK 정수 (int)타입의 상수로 선언 하라!
		final int YEAR = 365;
		final int MONTH = 30;
		final int WEEK = 7;
		
		// 문제3. 다음 중 byte타입 변수에 대입 할 수 없는 값은? 1>
		//	1> 256
		//	2> 127
		//	3> 0
		//	4> -99
		
		// 문제4. 다음 수식의 결과 값은?
		//(byte)128 + (byte)128 + (int)22.9
		
		System.out.println((byte)128 + (byte)128 + (int)22.9);
		
		// 문제5. 다음 각 항목이 나타내는 변수를 선언해라.
		//(1) int형 변수 age
		int age = 0;
		
		//(2) 0.25로 값이 초기화된 float형 변수 f
		float f = 0.25f;
		
		//(3) age값과 f값을 더한 값으로 초기화된 double형 변수 d
		double d = age + f;
	
		//(4) 문자 'a' 유니코드로 초기화된 char형 변수 c
		char c = '\u0061';
		
		//(5) 자신의 이름으로 초기화된 문자열 변수 name
		String name = "강민정";
		
		
		// 문제6. 다음 중 식별자 사용이 잘못된 경우를 모두 골라라
		/*
		
			int _i; (가능)
			
			int %j; (X)
			
			char 안녕; (변수 한글도 가능)
			
			double 1var; (X)
			
			char stundent_ID; (가능)
			
			final int abcdefghklmnopqrstyvwxyz; (가능은하지만 대문자로 사용하는것이 좋음)
		
		*/
		
		// 문제7. b라는 정수형 변수의 값과 100을 더해서 다시 b변수에 대입하는 자바문자을 작성해라.
		int b = 0;
			b = b + 100;
		
		
		// 문제8. 자바의 기본데이터 타입을 모두 나열하고 각 타입의 크기를 설명하라.
			
//			boolean- 1byte
//			 * char-2
//			 * byte-1
//			 * shrt-2
//			 * int-4
//			 * long-8
//			 * float-4
//			 * double-8
		// ctrl+shift+c = 한줄 주석 처리됨
			
	   // 문제9. 다음 수식의 결과 값과 타입은?
			//(1) 67 + 12.8
			//=67.0+12.8=79.8
					//=double
			//(2)'c' + 1
			//=99+1=100 (아스키코드 참고)
					//int
			//(3) 10/3
			//=3
				//int
			//(4) 10.0 / 3
			//=10.0/3.0
			//=3.333333333333335 
				//double
			
		
	}

}
