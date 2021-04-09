//5. Service 클래스들이 다음과 같이 선언되어 있습니다. 4번의 Controller객체를 생성하고 
//setService()메소드를 호출한뒤 , service.login() 메소드를 호출하면 어떤 내용이 출력되는지 빈칸에 기술해보세요.
class Service{
	
	public void login() {
		System.out.println("로그인");
		
	}

}

class MemberService extends Service{
	public void login() {
		System.out.println("멤버 로그인");
	}
	
	
}

class AService extends MemberService{
	public void login() {
		System.out.println("A 로그인");
	}
	
	
}


public class exam05 {

	public static void main(String[] args) {
		
		
		//Controller controller = new Controller();
		MemberService m = new MemberService();
		//-> 컴파일에러 발생으로 변경
		
		//controller.setService(new MemberService());
		//controller.service.login();
	    m.login(); // 출력결과
		
	    AService a = new AService();
	   //-> 컴파일에러 발생으로 변경
	    
		//controller.setService(new AService());
	    //controller.service.login();
		a.login(); // 출력결과
		
		/*
		 		출력결과 :
				멤버 로그인
				A 로그인
				
				Controller ?? 이게 뭔지 모르겠어요.. 강사님... 풀이 시간 되면 해주세요..
	
		 */

		
		
		
	}

}
