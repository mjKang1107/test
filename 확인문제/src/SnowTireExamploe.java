//2. Tire 클래스를 상속받아 SnowTire클래스를 다음과 같이 작성했습니다. 
//SnowTireExample클래스를 실행했을 때 출력 결과는 무엇일까요?

class Tire{
	
	
	public void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
		
	}
}

class SnowTire extends Tire{
	
	
	@Override
	public void run() {
	 System.out.println("스노우 타이어가 굴러갑니다.");	
	
	
	 }
   }
	


public class SnowTireExamploe {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}

}
/*

스노우 타이어가 굴러갑니다.
스노우 타이어가 굴러갑니다.

*/