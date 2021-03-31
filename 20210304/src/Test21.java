
//if 조건문 연습문제1

public class Test21 {

	public static void main(String[] args) {
		
		//문자열을 저장할 myJob1이라는 변수 선언 및 "홍길동" 저장
		
		String myJob1 = "홍길동";
		
		//문자열을 저장할 myJob2 변수 선언 및 "이순신" 저장
		
		String myJob2 = "이순신";
		
		//문자열을 저장할 myJob3 변수 선언 및 "이성계" 저장
		String myJob3 = "이성계";
		
		//문자열을 저장할 myJob4 변수 선언 및 "정도전" 저장
		String myJob4 = "정도전";
		
		//myJob1 저장된값이 "홍길동"과 같으면?
		
		if(myJob1=="홍길동") {
				System.out.println("홍길동은 의적");
			
			//"홍길동은 의적"
			
		}else if(myJob2=="이순신") {
			System.out.println("이순신은 장군");
			
			//myJob2 "이순신"과 같으면?
			//"이순신은 장군"
		}else if(myJob3=="이성계"){
			System.out.println("이성계는 왕" );
			//myJob3 "이성계" 와 같으면?
			//"이성계는 왕"
			
			
		}else {
			System.out.println("정도전은 책사");	
		}//위 조건식들이 모두 만족하지 않으면?
		//"정도전은 책사"
		
	/*
	 결론: "이순신" ,"이성계", "정도전" 은 출력되지 않는다
	 else if 문은 이전문장이 false 이고 현재문장이 true라면? 이라는 의미이기 때문이다.
	 
	 
	 */
		
		
		
	}

}
