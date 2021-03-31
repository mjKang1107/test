/*
 
 	제어문이란?
 
 	- 자바프로그램이 원하는 결과를 얻기 위해서는 프로그램의 순차적인 흐름을 제어할때 사용하는 명령문
 	
 	제어문의 종류
 	1. 조건문
 	2. 반복문
 	
 1. 조건문
 	-조건문은 주어진 조건식의 결과값에 따라 별도의 명령을 수행하도록 제어하는 명령문
 	-조건문의 종류
 		1-1. if
 		1-2. if else
 		1-3. if else if else
 		1-4. switch
 		
 	1-1. if
 	 -if문은 조건식 결과값이 참이면 주어진 명령문을 실행하며,
 	 	거짓이면 아무것도 실행하지않음
 
 	-문법
 		if(조건식){
 				조건식의 결과가 참일때 실행하고자하는 명령문;
 		
 		}
 
 */

public class Test19 {

	public static void main(String[] args) {
		
		//예제. if문을 사용하여, 해당 문자가 영문 소문자인지를 확인하는 예제.
		
		char ch = 'j';
		
		if('a'<= ch && ch<= 'z') {
			System.out.println("해당문자는 영문 소문자입니다.");
		}

		System.out.println("----------------------------------");
		
		int visitCount = 0;
		
		//visitCount 변수에 저장되어 있는 값이 1보다 작으면?
		if (visitCount < 1) { // <--- 조건식의 결과가 참일때 {} 중괄호 내부에 있는 명령어를 실행함
			//명령어
			System.out.println("처음 오셨군요, 방문해 주셔서 감사합니다.");
			
		}
		
	/*
	  
		1-2. if else	
		
		문법 if(조건식){
			조건식의 연산결과가 참일때 수행될 명령어;
		
		} else{
			조건식의 연산결과가 거짓일때 수행될 명령어;
		
		}
		
			설명 : if조건식의 연산결과가 거짓일때만 else{} 중괄호 블럭내의 명령어가 실행됨.


	 */
		
		visitCount = 5; //홈페이지 방문횟수
		
		//visitCount변수에 저장되어 있는 값이(홈페이지에 방문한 방문횟수가)
		//1보다 작으면 (한번도 방문하지 않았다면)
		if (visitCount<1) {
			System.out.println("처음 오셨군요, 방문을 환영합니다");
		} else {// 홈페이지에 한번이라도 방문했다면
			System.out.println("다시 방문해 주셔서 감사합니다.");
		}
		
		System.out.println("방문횟수는"+ ++visitCount + "번 입니다.");
		
	
	/*
	 
	 
	 1-3. if    else if     else	
	 
	 	문법
	 	
	 		if(조건식1){
	 			조건식 1의 결과가 참일때 실행하고자 하는 명령문;
	 				
	 		}else if(조건식2){
	 				조건식2의 결과가 참일때 실행하고자 하는 명령문;
	 
	 		}else{
	 			조건식 1의 결과도 거짓이고, 조건식 2의 결과도 거짓일때 실행하고자 하는 명령문;
	 			
	 		}
	 
	 
	 
	 */
		
		//예제. if else if else 문을 사용하여 ch변수에 저장된 문자가 
		//영문 소문자인지 대문자인지 아니면 영문자가 아닌지를 확인하는 예제
		
		//char ch = 'j';
		
		if ('a'<=ch && ch <='z') {
			System.out.println("해당 문자는 영문 소문자입니다.");
			
		} else if('A'<=ch && ch<='Z') {
			System.out.println("해당 문자는 영문 대문자입니다.");
		
		} else {
			System.out.println("해당 문자는 영문자가 아닙니다.");
			
		}
		
		
		
		
	}
	
	
}
