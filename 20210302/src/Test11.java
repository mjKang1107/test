/*
   5. 논리 연산자
	- 주어진 논리식을 판단하여, 참(true) 과 거짓(false)을 결정 하는 연산자
	
	논리 연산자 종류
	
	논리연산자					설명
	&&				논리식이 모두 참이면 참을 반환함(AND연산자)
	||				논리식 중에서 하나라도 참이면 참을 반환함(OR연산자)
	!				논리식의 결과값이 참이면 거짓을, 거짓이면 참을 반환함(NOT연산자)

	논리연산자의 모든 동작의 결과를 보여주는 진리표
	
	A변수		B변수 		A && B		A || B			!A			
	true		true		true		 true			false
	true		false		false		 true			false
	false		true		false		 true			true
	false		false		false		 false			true

 */
public class Test11 {
	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a  &&  b); // false
		System.out.println(a  &&  a); // true
		System.out.println(b  &&  b); // false
		
		System.out.println("-------------------");
		
		System.out.println(a  ||  a); // true
		System.out.println(a  ||  b); // true
		System.out.println(b  ||  b); // false
		
		System.out.println("-------------------");
		
		System.out.println( !a ); // false
		
		System.out.println("-------------------");
		
		/*비교 연산자와 논리 연산자 함께 사용 하기*/

		int x = 10;
		int y = 15;
		
		
		//참고: 비교연산자가 논리연산자보다 연산의 우선순위가 높다
		//따라서 x > 5 를 연산하여 true 값을 구하고..
		//x < 25 를 연산하여 true
		//마지막으로 두개의 피연산자의 값을 &&연산함.
		
		System.out.println(x > 5 && x <25); //true && true -> true
		
		System.out.println(x > 8 && y <10); //true && false -> false
		
		
		
		// x=10;  , y=15;
		System.out.println(x > 15 || x < 25); // false || true -> true
		
		System.out.println(x > 8 || y < 10); // true || false -> true
		
		System.out.println("----------------------------------------");
		
		//예제 주제 : char 형 문자끼리도 그 크기를 서로 비교 할 수 있다.
		
		char ch1 = 'b' , ch2 = 'B';
		
		boolean result1 , result2;
		
		result1 = (ch1 > 'a') && (ch1 < 'z'); //true
				//'b'(98)>97  && 98 < 122
		
		System.out.println("&& 연산자에 의한 결과 : " + result1);
		
		result2 = (ch2 < 'A') || (ch2 > 'Z'); //false || false -> false
				//'B'(66)<65  || 66 > 90
		
		System.out.println("|| 연산자에 의한 결과 : " + result2);
		
		System.out.println("!연산자에 의한 결과: " + !result2); //!false -> true
		
	}

}
