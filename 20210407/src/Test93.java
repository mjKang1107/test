/*
 
 	다형성 : 여러가지 형태를 가질수 있는 능력을 의미.
 	
 	객체 지향 개념 자바에서의 다형성 : 
 	하나의 클래스 타입의 참조변수로 여러클래스타입으로 생성 객체들을 참조할수 있도록 하는 것.
 
 	구체적인 자바의 다형성 : 
 	-> 부모클래스 타입의 참조변수로 자식클래스를 이용해 생성한 객체 메모리를 참조할 수 있도록 하는 것.
 
 */

//예)
class TV{
	
	boolean power;//전원상태 on/off를 저장할 변수
	int channel; //채널값을 저장할 변수
	
	//TV의 전원을 on 또는 off시키는 기능의 메소드
	void power() {
		power = !power;	
	}
	//채녈을 1증가시키는 기능의 메소드
	void channelUp() {
		++channel;
		
	}
	//채널을 1감소시키는 기능의 메소드
	void channelDown() {
		--channel;		
	}
}

//TV기능 + 캡션기능을 추가시킨 CaptionTV클래스 만들기
class CaptionTV extends TV{
	
	//캡션을 보여주기 위한 문자열이 저장될 변수
	String text;
	void caption() {
		System.out.println("캡션기능이 추가된 TV");
		
	}
	
}


public class Test93 {

	public static void main(String[] args) {
		TV tv = new TV();
		CaptionTV c = new CaptionTV();
		//CaptionTV c1 = new CaptionTV();
		//CaptionTV c2 = new CaptionTV();
		//CaptionTV c3 = new CaptionTV();
		
		//그러나 TV클래스와 CaptionTV클래스가 상속관계에 있을 경우
		//부모클래스 타입의 참조변수에 저장된 객체의 주소를 이용하여
		//자식객체 메모리의 멤버를 참조하도록 하는 것도 가능합니다.
		
		//부모클래스 타입의 참조변수에 자식객체를 생성해서 그 주소를 저장!
		TV ti = new CaptionTV();//자식객체1 <--업캐스팅 일어남(다형성특징)
//		   ti = new CaptionTV();//자식객체2 <--업캐스팅 일어남(다형성특징)
//		   ti = new CaptionTV();//자식객체3 <--업캐스팅 일어남(다형성특징)
		   //부모클래스TV의 참조변수 t1은 하나다
		   
		//-> int a = 1;
		//		   = 2;
		//		   = 3;
		   
		   //객체를 생성하여 같은 클래스 타입의 참조변수에 객체메모리의 주소값을 저장하는 것과..
		   //객체를 생성하여 부모 클래스 타입의 참조변수에 객체메모리의 주소값을 저장하는 것의 차이
		   
		   //1. 객체를 생성하여 같은 클래스 타입의 참조변수에 객체메모리의 주소값 저장
		   CaptionTV c1 = new CaptionTV();
		   //1. 의 경우 c1참조변수로 참조할수 있는 멤버에 접근 해보자
		   c1.power = true;
		   c1.channel = 0;
		   c1.power();
		   c1.channelUp();
		   c1.channelDown();
		   c1.text ="캡션TV";
		   c1.caption();
		   
		   //2. 객체를 생성하여 부모클래스 타입의 참조변수에 객체메모리의 주소값 저장
		   TV t2 = new CaptionTV();
		   //2. 의 경우 TV(부모클래스타입)의 t2참조변수로 참조할수 있는 멤버접근 해보자
		   t2.power = true;
		   t2.channel = 0;
		   t2.power();
		   t2.channelUp();
		   t2.channelDown();
		  // t2.text ="캡션TV"; 참조 불가능- 부모클래스안에 없음
		  // t2.caption(); 참조 불가능- 부모클래스안에 없음
		   
		   /*
		    실제 생성한 객체 메모리가 new CaptionTV()객체일지라도
		    참조변수 t2로는 new CaptionTV()객체메모리에 저장된 모든 멤버를 사용할 수 없습니다.
		    이유는 TV클래스 타입의 참조변수로는 CaptionTV객체 메모리의 멤버들중에서 
		    TV클래스 내부에 만들어 놓은 멤버들만 사용할수 있기때문이다.
		    
		    */
		   
		   //----------------------------------------------------------------
		   
		   //반대로 자식클래스 타입의 참조변수에 부모클래스의 객체를 생성해서 저장 가능? 불가능함!!!!
		   //CaptionTV c2 = new TV(); 컴파일 에러 발생
		   //이유: 실제 TV객체 멤버의 개수보다 CaptionTV클래스타입(자식)의 참조변수 c2가 사용할수 있는 
		   //	 멤버의 갯수가 더 많기 때문이다.
		   //이유요약 : CaptionTV클래스타입의 c2참조변수가 참조 하고 있는 객체는 TV객체이고
		   //   	 TV객체에는 text변수와 caption()메소드가 존재하지 않기 때문이다.
		   
		   //----------------------------------------------------------------
		   /*
		    결론 : 
		    - 자식클래스타입의 참조변수로 부모객체를 참조하는 것은?
		      존재하지 않는 멤버를 사용하고자 할 가능성이 있으므로 허용하지 않는다.
		    - 참조변수가 사용할 수 있는 멤버의 갯수는 객체메모리의 멤버 갯수보다 같거나 작아야한다.
		    
		    */
	}

}
