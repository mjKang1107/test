/*
 
 1-4. switch
 	-switch문은 if else문과 마찬가지로 주어진 조건값의 결과에 따라
 	프로그램이 다른 명령을 수행하도록 하는 조건문.
 	
 
 	-문법
 	
 	switch(조건 값){
 		case 값1:
 				조건값이 값1일때 실행하고자 하는 명령문;
 				break;
 				
 		case 값2:
 				조건값이 값2일때 실행하고자 하는 명령문;
 				break;
 				
 		//케이스유형 무한대 작성가능
 		 
 		default:
 		 		조건값이 어떠한 case에도 해당하지 않을 때 실행하고자 하는 명령문;
 				break;
 	
 	
 	}
 
 */

public class Test24 {
	public static void main(String[] args) {
	

		String myDream = "DBA";
		
		switch (myDream) { //변수에 저장되어 있는 값이~
			case "Programer": //같냐?
				System.out.println("나의 꿈이 아닙니다.");
				break; //그다음 case 유형의 값과 비교하지않고
					//switch 조건문을 완전히 빠져나감
	
			case "Doctor":
				System.out.println("나의 꿈이 아닙니다.");
				break;
			case "DBA":
				System.out.println("저는 데이터베이스 관리자가 되고 싶어요!!");
				break;
			default: // 조건 값이 위에 나열된 어떠한 case절의 값도 해당하지 않을때만
					//명령문을 실행합니다.
				System.out.println("저는 돈많은 백수가 되고싶어요.");
				break;
		}

	}

}
