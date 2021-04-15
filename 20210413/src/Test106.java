//추상클래스 연습

//문제: 추상클래스(Animal)내부에는 추상메소드 speak가 존재한다.
//     추상클래스(Animal)을 상속하여 Dog클래스와 Cat클래스를 정의한 후 
//     각 동물의 울음소리를 출력 시키시오.

//추상클래스(Animal)만들기

abstract class Animal{
	
	//동물의 소리내기 기능을 하는 추상메소드 speak선언
	abstract String speak();
	
}//A 끝

// Animal상속받는 Dog자식클래스 만들기

class Dog extends Animal{

	@Override
	String speak() {
		
		return "멍멍멍 멍멍";
		
	}
	
	//오버라이딩 강제로 
	//내용 -> "멍멍멍 멍멍" 반환 리턴
	
	
}

//Animal상속받는 Cat자식클래스 만들기
class Cat extends Animal{

	@Override
	String speak() {
		return "냐옹 냐옹";
		
	}
//오버라이딩 강제로 
	//내용 -> "냐옹 냐옹" 반환 리턴
	
}	

public class Test106 {

	public static void main(String[] args) {
		
		
		//업캐스팅 하지않은 출력결과
		//냐옹 냐옹
		//멍멍멍 멍멍
		Cat cat = new Cat();
		System.out.println(cat.speak());
		Dog dog = new Dog();
		System.out.println(dog.speak());
		
		
		
		//업캐스팅한 출력결과
		//냐옹 냐옹
		//멍멍멍 멍멍
		Animal animal;
		animal = new Cat();
		System.out.println(animal.speak());
		animal = new Dog();
		System.out.println(animal.speak());
		
		

	}

}
