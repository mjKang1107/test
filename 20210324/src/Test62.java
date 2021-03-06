import java.util.jar.Attributes.Name;

//Animal클래스 만들기
class Animal{
	String name;
	int age;
//동물의 이름을 문자열로 저장시킬 name변수 선언
//동물의 나이를 정수로 저장시킬 age변수 선언
	
 Animal(){
	name = "개";
	age = 3;
//기본생성자
	//name변수에 "개"저장
	//age변수에 3저장
 }	
 Animal(String n_name){
	name = n_name;
	age = 1;
//동물의 이름을 n_name매개변수로 전달받아 name변수에 저장할 생성자
//name변수에 n_name매개변수로 전달 받은 이름을 저장
	//age변수에 1저장	
 }	
 Animal(int n_age){
	name = "동물";
	age = n_age;
	
 }
//동물의 나이를 n_age매개변수로 전달받아 age변수에 저장할 생성자
//name변수에 "동물"저장
//age변수에 n_age매개변수로 전달 받은 나이 저장 
 Animal(String n_name, int n_age){
	name = n_name;
	age = n_age;
		
 }
//동물의 이름과 나이를 매개변수로 전달 받아 name변수와 age변수에 각각 저장할 생성자
//name변수에 n_name매개변수로 전달 받은 이름 저장
//age변수에 n_age매개변수로 전달 받은 나이 저장
//=================================================================
//메소드
//name변수에 새로운 값을 저장할 용도의 메소드
 void setName(String n_name) {
	name = n_name;
 }
//age변수에 새로운 값을 저장할 용도의 메소드
 void setAge(int n_age) {
	age = n_age;
 }
//name변수에 저장되어 있는 값을 제공(반환) 해주는 용도의 메소드
 String getName() {
	return name;
 }
//age변수에 저장되어 있는 값을 제공(리턴)해주는 용도의 메소드
 int getAge() {
	return age;
 }
//name변수에 저장된 동물이 뛴다 출력하는 기능의 메소드
 void run() {
	System.out.println(name + " 뛴다.");
 }

}// Animal클래스 끝!


public class Test62 {

	public static void main(String[] args) {
		//출력할 내용
		/*
		 개 뛴다.
		 고양이 뛴다.
		 사자뛴다.
		 10
		 
		 토끼 뛴다.
		 2
		 기린뛴다.
		 4
		  */
		
		Animal a = new Animal();
		
		a.run();
		a.name = "고양이";
		a.run();
		//setName메소드 이용하기
		a.setName("사자");
		a.setAge(10);
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println("==================================");
		
		Animal a2 = new Animal("토끼");
		a2.run();
		
		Animal a3 = new Animal(2);
		System.out.println(a3.getAge());

		Animal a4 = new Animal("기린", 4);
		a4.run();
		System.out.println(a4.getAge());

	}

}
