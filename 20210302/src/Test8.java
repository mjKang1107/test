/*
 	연산자(operator)
 	- 자바에서는 여러 종류의 연산을 수행하기 위한 다양한 기호.
 	
 	연산자 종류
 		1. 산술 연산자
 		2. 대입 연산자
 		3. 증감 연산자							1     +     3
 		4. 비교 연산자						(피연산자)(연산자)(피연산자)
 		5. 논리 연산자
 		6. 비트 연산자
 		7. 삼항 연산자
 	
 1. 산술 연산자란?
 	-사칙연산을 다루는 연산자
 	
 	산술 연산자의 종류										설명
 		+								왼쪽의 피연산자에 오른쪽의 피연산자를 더하는 연산자 기호.
 		-								왼쪽의 피연산자에서 오른쪽의 피연산자를 빼는 연산자 기호.
 		*								왼쪽의 피연산자에 오른쪽의 피연산자를 곱하는 연산자 기호.
 		/								왼쪽의 피연산자를 오른쪽의 피연산자로 나누는 연산자 기호.
 		%								왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지값을 반환하는 연산자 기호.
 
 
*/
public class Test8 {

	public static void main(String[] args) {
	
		int num1 = 8;
		int num2 = 4;
		
		System.out.println("+ 연산자에 의한 결과 : " + (num1 + num2) );
		System.out.println("- 연산자에 의한 결과 : " + (num1 - num2) );
		System.out.println("* 연산자에 의한 결과 : " + (num1 * num2) );
		System.out.println("/ 연산자에 의한 결과 : " + (num1 / num2) );
		System.out.println("% 연산자에 의한 결과 : " + (num1 % num2) );
		
		System.out.println("-------------------------------------");
		
		System.out.println(10 + 5); // + 덧셈
		System.out.println(5 - 2); // - 뺄셈
		System.out.println(4 * 3); // * 곱셈
		System.out.println(14 / 3); // / 나눗셈
		System.out.println(14 % 3); // % 나눈 나머지
		System.out.println(3.2 / 2); 
		System.out.println(5 % 3);
		
/*

 2. 대입 연산자란?
 	-대입 연산자는 변수에 값을 대입할 때 사용하는 이항 연산자이며, 
 	피연산자들의 결합 방향은 오른쪽에서 왼쪽입니다.
 	
 	= 대입 연산자 기호
 	
 2.1 복합 대입 연산자란?
 	- 대입연산자 = 와 다른 연산자를 결합하여 만든 연산자
 
 	복합 대입 연산자의 종류
 	
 	복합 대입 연산자										설명
 		+=								왼쪽의 피연산자에 오른쪽의 피연산자를 더한 후, 그 결과 값을 왼쪽의 피연산자에 대입하는 기호
 										예) int a = 1;  a += 3;  => 4
 		-=								왼쪽의 피연산자에서 오른쪽의 피연산자를 뺀 후 , 그 결과 값을 왼쪽의 피연산자에 대입
 										예) int a = 0; a = a-1; => -1
 											int b = 10; b= b-5; => 5 (b-=5; 동일) 
 		*=								왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 후, 그 결과값을 왼쪽의 피연산자에 대입
 		/=								왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 결과값을 왼쪽의 피연산자에 대입
 		%=								왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지값을 왼쪽의 피연산자에 대입

 */	

		int num3 = 7, num4 = 7, num5 = 7; // 한줄에 여러개 변수 선언할 때 , 사용하면 됨
		
		num3 = num3 - 3;
		num3 -= 3; //7 - 3 
		
		num4 -= 3;
		//순서1) num4 - 3;
		//순서2) num4 = num4 - 3;
		          //4   =   7 - 3
		        		  
		num5 -= 3;
		//순서1) num5 - 3;
		//순서2) num5 = num5 - 3;
		          
		          int a = 10;
		          int b = a; //변수 a에 저장되어 있는 값 10을 변수 b에 대입한다.
		          System.out.println(b);
		          
		        b += a; //  b = b + a;
		      System.out.println(b); //20
		      
		      //b <- 20, a <- 10
		      
		      b -= a;
		      //b-a -> 20 - 10 =10
		      System.out.println(b); //10
		      
		      //b <- 10, a <- 10
		      
		      b *= a; //b = b * a; // 풀이 : 변수 b에 저장된 값과 변수 a에 저장된 값을 곱한 결과값을
		      						//		변수 b에 저장함.
		      System.out.println(b); //100
		      
		      // b <- 100, a <- 10
		      b /= a; //b = b / a; //풀이 : 변수 b에 저장된 값을 변수 a에 저장된 값으로 나눈 결과값을
		      						// 	   변수 b에 저장함.
		      
		      System.out.println(b); // 10
		      
		      //b <- 10, a <- 10
		      
		      b %= a; // b = b % a; // 풀이 : 변수 b에 저장된 값을 변수 a에 저장된 값으로 나눈 나머지 값을 구한후,
		      						// 		 변수 b에 저장함
		      
	
		      System.out.println(b); // 0
		            
	}

}