
public class Test20 {

	public static void main(String[] args) {
		
		//if   else if   else 조건문을 이용한 예제
	
		//학생점수를 저장할 변수 score 선언 후 45점 저장
		
		int score = 45;
		
		//학생점수에 따른 학점을 저장할 grade변수 선언 후 기본값으로 초기화
		char grade = '\u0000';
		
	
		// 조건식 학생점수가 90점 ㅇㅣ상이면? 
		if(score>=90) {	
			grade = 'A';
			
		// 학생점수가 80점 이상이면?	
	}else if(score>=80) {
			grade = 'B';
		
			//나머지 점수라면
	}else {
		grade ='C';
		
	}	
		System.out.println("당신의 학점은"+ grade+"입니다.");
	

		// 위 if else if else 조건문은 삼항조건연산자로 변경
		
		grade = (90<=score? 'A' : (80<=score? 'B' : 'C'));
		
				System.out.println("당신의 학점은"+ grade+"입니다.");
		
		
		
		
	}
	
}