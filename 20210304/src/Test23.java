/*
 
  중첩 if문이란? if문 블럭 내부에 또 다른 if문을 말함.
  
  
  문법
  	if(조건식1) {
  	
  	//조건식1의 연산결과가 true일때 수행될 문장들 작성
  	 
  	  if(조건식2){
  	  	//조건식1과 조건식2의 연산결과가 모두 true일때 수행될 문장들 작성

  	  while(){
  	  .....
  	  
  	  
  	  }
  	  
  	  
  	  }else{
  	  	// 조건식1은 true이고 , 조건식2는 false일때 수행될 문장들 작성
  	  
  	  }
  	 
  	
  	}else{
  		//조건식1의 연산결과가 false일때 수행될 문장들 작성
  	
  	
  	}
  
 */

public class Test23 {

	public static void main(String[] args) {

		int score = 82; // 학생점수

		String grade = ""; // 빈거로 초기화시킴(학점을 저장할 변수)

		System.out.println("당신의 점수는 " +score + "점 입니다.");

		if (score >= 90) {
			grade = "A";

			// score변수에 저장되어 있는 값이 90보다 크거나 같냐?
			// grade변수에 "A" 문자열 저장

			if (score >= 98) {
				grade = "A" + "+";
				//grade += "+";
				// 90점보다 크거나 같은 점수중에서라도.. 98점보다 크거나 같냐?
				// grade변수에 "+" 기호 누적(+=)

			}
			else if (score < 94) {
				grade = "A" + "-";
				// 90점보다 크거나 같은 점수중에서 94점 미만이라면?
				// grade변수에 "-" 기호 누적(+=)

			}
		} else if (score >= 80) {
			grade = "B";

			// score변수의 값이 80보다 크거나 같냐?
			// grade변수에 "B" 문자열 저장
			if (score >= 88) {
				grade = "B" + "+";
				// 80점 이상중에서 88점 이상은?
				// grade변수에 "+" 누적(+=)

			}
			else if (score < 84) {
				grade = "B" + "-";
				// 80 이상중 84점 미만?
				// grade변수에 "-" 누적(+=)

			}
		} else {
			grade = "C";
			// score변수의 값이 80미만이라면?
			// grade변수에 "C" 문자열 저장

		}

		System.out.println("당신의 학점은 " + grade + " 입니다.");

	}

}
