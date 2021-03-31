//문제 : 상품 하나를 표현하는 클래스 Goods를 작성


	/*출력결과
	상품이름: Nikon
	상품가격: 400000
	재고수량: 30
	팔린수량: 50
	*/

public class Goods {
	//String타입의 name
	String name;
	//int타입의 Price, numberOfStock, sold등 네개의 변수를(필드)갖는다
	int Price, numberOfStock, sold;
	//클래스 안 메인 위에 변수 선언!!!
			
	//Goods클래스 내에 main()메소드를 작성하여 Goods객체를 하나 생성하고 
	public static void main(String[] args) {
		
		//이객체에 대한 참조변수명은 camera로 하라.
		Goods camera = new Goods();
		//그리고 나서 camera상품이름(name)을 "Nikon" 가격 400000, 재고 개수를 30, 팔린개수 50 설정
		camera.name = "Nikon";
		camera.Price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;
		
		// 설정된 이들 값을 화면에 출력하라.
		System.out.println("상품이름: " + camera.name);
		System.out.println("상품가격: " + camera.Price);
		System.out.println("재고수량: " + camera.numberOfStock);
		System.out.println("팔린수량: " + camera.sold );
	
		
		
	}

}
