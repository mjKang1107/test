//박싱 , 언박싱 연습하기
public class Test126 {
	public static void main(String[] args) {
		
		//Integer클래스에 대한 객체를 생성하여 정수10 박싱하기 (저장하기)
		//참조변수 이름 i
		
		//Double클래스에 대한 객체를 생성하여 실수 3.14박싱하기
		//참조변수 이름 d
		
		//출력
		//10
		//3.14
		System.out.println("--박싱하기--");
		Integer i = new Integer(10);
		Double d = new Double(3.14);
		
		System.out.println(i);
		System.out.println(d);
		
		System.out.println("--언박싱하기--");
		//위의 Integer객체에 저장되어 있는 정수값 10 언박싱하기 (얻어오기)
		//얻어와서 int i2변수에 저장
		
		//int i2변수에 저장된 10 출력
		
		//위의 Double객체에 저장되어 있는 실수값 3.14언박싱하기(얻어오기)
		//얻어온 값에 1.2를 더하여 새로운 Double객체의 인스턴스변수에 박싱하기(저장하기)
		//박싱후 d참조변수에 저장
		
		
		int i2 = i.intValue();
		System.out.println(i2);
		
		d = new Double(d.doubleValue() + 1.2);
		System.out.println(d.toString());
		
		
		
		
	}

}
