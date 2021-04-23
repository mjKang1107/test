
class A{
	int val = 10;
	void method1(int num) {
		num +=10;
		
	}
	void method2(A a) {
		a.val +=10;
		
	}
	
}


public class Ex {

	public static void main(String[] args) {
		A a = new A();
		a.method1(a.val);
		System.out.println(a.val);
		
		a.method2(a);
		System.out.println(a.val);
	}

}
