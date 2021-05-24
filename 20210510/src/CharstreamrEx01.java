import java.io.InputStream;
import java.io.InputStreamReader;

/*문자스트림 방식으로 입출력
  문자스트림 방식의 최고 부모클래스
  - Reader추상클래스
  - Writer추상클래스
  
  문자스트림 방식을 사용하는 이유?
  - 키보드로부터 한글 입력시 .. 인코딩이 되지 않는데.. 바이트스트림에서는 1바이트씩 처리 했다
  한글은 2바이트이기떄문에 그래서 한글이 깨졌다.
  그러나? 문자스트림 방식으로 데이터를 주고 받으면 문자스트림 방식은 2바이트씩 처리 하기 떄문에 
  자유롭게 데이터를 읽어 들이거나 내보내는 과정의 속도가 빠르다.
   
  */


public class CharstreamrEx01 {

	//바이트 스트림의 최고 조상 InputStream 클래스 타입의 참조변수 (매개변수)로 받아야함 
	public static void streamTest(InputStream is) {
			
		//바이트 스트림 방식을 문자스트림 방식으로 바꾸는 이유?
		//-> 1바이트 단위로 데이터를 읽어 들일게 아니라 2바이트(한문자) 단위로 데이터를 읽어들일수 있게 하기 위해 
		//장점 : 영문뿐만아니라 한글도 읽어 들일 수 있다.
		
		//InputStream객체를 InputStreamReader객체 생성시 생성자로 전달 해 저장(포장)
	 InputStreamReader isr = new InputStreamReader(is);
	 //InputStream 클래스의 주요 메소드
	 //Int read() : 한문자씩 데이터를 읽어 들이는 메소드
	 
	 try {
		//매개변수로 전달 받아 포장한 InputStreamReader스트림 객체를 이용하여
		 //키보드로부터 입력받은 데이터를 한문자 (2바이트)단위로 반복해서 읽어 들여 출력
		 while (true) {
			//키보드로부터 한문자(2바이트)단위로 반복해서 읽어 들이자
			int i = isr.read();
			//만약 키보드로 부터 입력받은 데이터중 읽어들일 데이터가 존재하지않으면
			//더이상 읽어 들이지 않고 while반복문을 빠져나감
			if(i==-1) {
				break;
			}
			//키보드로부터 입력받은 한문자 (2바이트)단위로 출력
			System.out.print((char)i);
			
		}
		 
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		
	}
	
	public static void main(String[] args) {
		//메소드 호출시.. 바이트방식으로 데이터를 주고 받을 수 있게 InputStream객체 전달
		streamTest(System.in);

		
		
	}

}
