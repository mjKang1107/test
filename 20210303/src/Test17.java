/*

	연산자문제4)
	
	아래의 코드의 문제점을 수정해서 [실행결과]와 같은 결과를 얻으시오.
	
	[실행결과]
	c = 30
	ch = C
	f = 1.5
	l = 27000000000
	result = true
 */

public class Test17 {
	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b); 
		System.out.println(c);	
		//이유 : a변수값과 b변수값은 byte타입이므로 이항 연산인 덧셈연산을 하기전에 int로 자동형변환된다.
		//(byte)로 캐스팅해줘야한다.
		
		char ch = 'A';  
		ch = (char)(ch + 2); //  (char) 캐스팅 해줘야한다.
		System.out.println(ch);
		//이유: char타입이 덧셈연산의 과정을 거치면서 int타입으로 변환되므로
			//char타입의 변수 ch에 저장하기 위해서는 (char)타입으로 형변환해줘야함.
		
		float f = 3 / 2f; 
		System.out.println(f);
		//이유: int정수값으로 계산됨 결과 1
		//연산결과를 실수값으로 얻고 싶으면, 적어도 두 피연산자 중 한쪽이 실수타입(float와 double중의 하나여야함
		
		long l = 3000*3000*300L; 
		System.out.println(l);
		//이유: int * int * int 결과는 int타입의 최대값인 약 2*10의 9제곱을 넘는 결과는 오버플로우가 발생하여 다른 값을 얻음
		// 피연산자 중 적어도 한 값은 long타입이여야 최종결과를 long타입의 값으로 얻기 때문에 접미사 L을 붙여서 long 타입의 리터럴로 만들어줘야함
		
		float f2 = 0.1f;
		double d = 0.1;
		
		//boolean result = d == f2;
		boolean result = (float)d == f2;
	    System.out.println(result);
		//이유: 비교 연산자도 이항연산자이므로 연산 시에 두 피연산자의 타입을 맞추기 위해 형변환이 발생한다.
	    //실수는 정수와 달리 근사값으로 표현을 하기 때문에 float를 double로 형변환 했을때 오차가 발생할수 있다.
	    //그래서 float값을 double로 형변환 하는것 보다는 유효자리수가 적은 float로 형변환해서 비교하는것이 정확한 결과를 얻을수있다.
	}

}
