
/* 인터페이스를 이용한 다형성
  
  -부모인터페이스 타입의 참조변수에 자식객체 저장(업캐스팅)
  -부모인터페이스 타입의 참조변수에 저장된 자식객체의 주소를 이용하여
   자식객체메모리의 멤버들을 참조할 수 있다.(업캐스팅)
  -인터페이스 타입으로의 형변환도 가능하다. */


interface X{
	
	public abstract void print();

}

class A implements X{
//재구현
	@Override
	public void print() {
		System.out.println("난 A다");
		
	}

}

//인터페이스
interface Parsable{
	//구문분석을 수행하는 기능을 구현할 목적으로  추상메소드 parse(String fileName)정의
	public abstract void parse(String fileName);
	
}

class XMLParser implements Parsable{

	@Override
	public void parse(String fileName) { //"document.xml"
		System.out.println(fileName + "-XML parsing completed.");		
	}

}

class HTMLParser implements Parsable{

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + "-HTML parsing completed");
		
	}
	
}

class ParserManager{
	
	//파일형식을 확인후 ! 그형식에 해당하는 객체를 반환함
	public static Parsable getParsable(String type) {
		
		//만약 파일확장자가 "XML"파일이라면
		if(type.equals("XML")) {
			//String이라서..
			//XMLParser자식객체를 생성하여 메소드를 호출한곳으로 리턴!
			return new XMLParser();
			
		}else { //"XML"확장자가 아니라면
			
			//업캐스팅
			Parsable p= new HTMLParser();
			return p;
			//위 두줄을 한줄로 간단하게 나타내면 return new HTMLParser();
			
		}
	}
	
}

class B implements X{
//재구현
	@Override
	public void print() {
		System.out.println("난 B다");	
	}
	
}
public class Test111 {
	public static void main(String[] args) {
		//X부모 인터페이스 타입의 참조변수에 자식객체 저장(업캐스팅 가능함)
		X x = (X)new A();
		x = new B();
		//--------------------------------------------
		
		//업캐스팅 ***
		//부모 인터페이스 타입(Parsable) 참조변수 parser에 자식객체 저장
		Parsable parser = ParserManager.getParsable("XML"); //new XMLParser();
				//new XMLParser().parse("document.xml);
				parser.parse("document.xml");
				
		//업캐스팅
				parser = ParserManager.getParsable("HTML");//new HTMLParser();
				//new HTMLParser().parse("document.html");
				parser.parse("document2.html");
		
	}

}
