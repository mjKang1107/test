import java.awt.print.Printable;

// 클래스변수 인스턴스변수 클래스메소드 인스턴스메소드 만들기 연습

//상품클래스 Product만들기
class Product{
	//상품명을 문자열로 저장할 클래스변수 modelName만들기
		static String modelName;
	//상품의 단가를 정수로 저장할 클래스변수 unitPrice만들기
		static int unitPrice;
	//상품명과 단가를 하나의 문자열로 만들어서 출력할 기능의 클래스메소드 print 만들기
		public static void print() {
			System.out.println(modelName + ","+ unitPrice);
			
		}
}
//고객클래스 Customer만들기
class Customer{
	//고객명을 문자열로 저장시킬 인스턴스변수 name만들기
	String name;
	//고객의 나이를 정수로 저장시킬 인스턴스변수 age만들기
	int age;
	//기본생성자 만들기(아무런일도 하지않음, 비워두자)
public Customer() {
	
}
	//새로운 고객명만 매개변수로 전달 받아 위 인스턴스변수에 초기화할 생성자 만들기
public Customer(String name) {
	this.name = name;
	
}
	//새로운 고객나이만 매개변수로 전달받아 위 인스턴스변수에 초기화할 생성자 만들기
public Customer(int age) {
	this.age = age;
	
}
	//인스턴스변수 name과 인스턴스변수 age에 저장된 고객의 이름과 고객의 나이를 
public String print() {
	
	return name+age;
	
}

	//하나의 문자열로 만들어서 반환 할 인스턴스 메소드 print만들기

}

public class Test73 {

	public static void main(String[] args) {
		

	}

}
