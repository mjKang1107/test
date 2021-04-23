//Test112 업그레이드하기!!!!
//tank, dropship, scv <-기계 유닛 이기때문에
//repairable인터페이스 만들기

interface Repairable{
	//추상메소드 없어도 됨
}


//dropShip을 제외한 나머지 유닛들은 Boardable 인터페이스 구현한다.
interface Boardable{
	
}

//marine, medic은 사람이기 때문에 Healable인터페이스 구현한다.
interface Healable{
	
}

//최고 조상 유닛클래스 만들기 -> 추상클래스로 변경하기
abstract class Unit{
	//유닛의 현재체력을 저장할 변수
	int hitPoint;
	//유닛의 최대체력을 한번만 초기화해서 저장할 상수
	final int MAX_HP;
	//Unit객체 생성시 유닛의 최대체력을 초기화할 생성자
	Unit(int hp) {
		MAX_HP = hp;
	}
	//추상메소드
	//각각의 유닛은 무브사운드와 어택사운드를 가지고 있지만
	//유닛마다 다른 고유소리를 가지고 있기 때문에 
	//미완성 메소드인 추상메소드를 작성해놓자.
	
		//무브사운드 기능의 추상메소드
		public abstract void move_sound();
		//어택사운드 기능의 추상메소드
		public abstract void attack_sound();
	
	//일반메소드
		//모두 같은 ok사운드는 그냥 일반메소드에 구현해준다
		//상속받아서 다 같아져도 상관 없다고 판단하여..
	public void ok_sound() {
		System.out.println("OK!!!");
	}
	
}//Unit 추상클래스 끝!

//지상유닛 GroundUnit클래스 부분부터 삭제함!!

//마린클래스 만들기(Unit추상클래스 상속받고
			//사람이기떄문에 Healable 인터페이스 구현 받고,
			//dropShip을 제외한 나머지 유닛이기 때문에 Boardable인터페이스 구현 받는다.)

class Marine extends Unit implements Healable,Boardable{
	
	//인터페이스는 , 로 다중구현 받을수 있음!
		//마린의 최대 체력을 40으로 저장
		Marine() {
			super(40);
			//인터페이스를 구현받았을때 추상메소드 오버라이딩 안하면 에러남-> 오버라이딩 해주기
		}		
							@Override
	public void move_sound() {
		System.out.println("go!go!go!");
		
	}

	@Override
	public void attack_sound() {
		System.out.println("fire");
		
	}

	
}

//메딕 클래스 만들기(Unit추상클래스 상속 받고,
//				사람유닛이기때문에 Healable 인터페이스 구현 받고,
//				dropShip유닛을 제외한 나머지 유닛에 해당하므로 Boardable인터페이스 구현)

class Medic extends Unit implements Healable,Boardable{
	
	//메딕의 처음 최대체력을 40으로 초기화 할 생성자
	Medic() {
		super(40);
	}
	// Unit추상클래스의 추상메소드(무브사운드기능의 메소드)를 메딕에 맞게 오버라이딩
	@Override
	public void move_sound() {
		System.out.println("메딕간다");
		
	}
	// Unit추상클래스의 추상메소드(어택사운드기능의 메소드)를 메딕에 맞게 오버라이딩
	@Override
	public void attack_sound() {
		System.out.println("메딕공격한다");
		
	}
	
	//유닛을 치료하는 기능의 일반메소드
	//Healable 인터페이스를 구현한 자식객체들(Marine, Medic)를 매개변수로 전달 받아 치료 
	public void heal(Healable r) {
		
			Unit u = (Unit)r;
			
			while (u.hitPoint != u.MAX_HP) {//처음 최대체력과 같지 않다면
				u.hitPoint++;//유닛의 현재 체력 1증가
				System.out.println("치료중...>" + u.hitPoint);
			}
			
			System.out.println("치료완료");
	}//heal메소드 끝

}//Medic클래스 끝

//SCV클래스 만들기 (Unit추상클래스 상속, dropShip을 제외한 나머지 유닛에 속하므로 Boardable인터페이스 구현,
//				기계유닛이므로 Repairable인터페이스 구현)

class SCV extends Unit implements Boardable,Repairable{
	//SCV 처음 최대 체력 60으로 초기화할 생성자
	SCV() {
		super(60);
	}
	//메소드 오버라이딩
	@Override
	public void move_sound() {
		System.out.println("wing");
		
	}

	@Override
	public void attack_sound() {
		System.out.println("zizizic");
		
	}
	
	//유닛을 치료하는 기능의 메소드
	public void repair(Repairable r) {
		Unit u = (Unit)r;
		while (u.hitPoint != u.MAX_HP) {
			//치료
			u.hitPoint++;
			System.out.println("수리 중...>" + u.hitPoint);
		}
		//현재 체력이 최대체력과 같아질때..수리완료
		System.out.println("수리완료");	
	}//repair메소드 끝
}//SCV 끝

//Tank클래스 만들기(Unit추상클래스 상속,
//				dropShip을 지외한 나머지 유닛에 속하므로 Boardable인터페이스 구현,
//				기계유닛이기때문에 Repairable인터페이스 구현)
class Tank extends Unit implements Boardable,Repairable{
	//Tank의 처음 최대체력 150
	Tank() {
		super(150);
	}
	//추상메소드 강제 오버라이딩
	@Override
	public void move_sound() {
		System.out.println("yes sir");
		
	}

	@Override
	public void attack_sound() {
		System.out.println("kwang!!!!!!!!!!");
		
	}
	//시저모드 기능의 소리를 나타내는 일반메소드
	public void mode_sound() {
		System.out.println("wung~~~");
		
	}
	
}//Tank 끝!

//DropShip클래스 만들기(Unit 추상클래스 상속,
//					기계유닛에 속하므로 Repairable인터페이스 구현,
//					DropShip을 제외한 다른 유닛들을 태우기 위해 Boardable인터페이스 구현)

class DropShip extends Unit implements Repairable,Boardable{
	//최대 체력 100으로 저장
	DropShip() {
		super(100);
	}

	//추상메소드 강제 오버라이딩
	@Override
	public void move_sound() {
		System.out.println("슝~");
		
	}

	@Override
	public void attack_sound() {
		System.out.println("덜컥!");
		
	}
	//일반메소드 (모드 사운드)
	public void mode_sound() {
		System.out.println("철커덕~");
	}
	//일반메소드 (태우는 기능)
	public void tab(Boardable b) {
		System.out.println("야 타");
	}
	
}//DropShip끝

public class Test113 {

	public static void main(String[] args) {
		
		Marine m = new Marine();
		Tank t = new Tank();
		SCV s = new SCV();
		Medic md = new Medic();
		DropShip d = new DropShip();
		
		System.out.println("마린 : 10데미지 손상!");
		m.hitPoint = 30;//마린의 현재체력 30
		
		System.out.println("메딕으로 마린을 치료해준다.");
		md.heal(m); 
		m.ok_sound();
		m.move_sound();
		System.out.println("-------------------------------------------");
		
		System.out.println("탱크 피해 10데미지 손상!!");
		t.hitPoint = 140;
		
		System.out.println("SCV로 Tank 치료중..");
		s.repair(t);
		t.ok_sound();
		t.move_sound();
		t.mode_sound();
		System.out.println("-------------------------------------------");
		
		System.out.println("SCV의 현재체력은 0이다. SCV객체로 치료");
		s.repair(s);
		s.ok_sound();
		s.attack_sound();
		/*
			  마린 : 10데미지 손상! 
			  메딕으로 마린을 치료해준다. 
			  치료중...>31 
			  치료중...>32 
			  치료중...>33 
			  치료중...>34
			  치료중...>35 
			  치료중...>36 
			  치료중...>37 
			  치료중...>38 
			  치료중...>39 
			  치료중...>40 
			  치료완료
			  OK!!!
			  go!go!go!
		 
		
		    탱크 피해 10데미지 손상!!
			SCV로 Tank 치료중..
			수리 중...>141
			수리 중...>142
			수리 중...>143
			수리 중...>144
			수리 중...>145
			수리 중...>146
			수리 중...>147
			수리 중...>148
			수리 중...>149
			수리 중...>150
			수리완료
			OK!!!
			yes sir
			wung~~~
		 */
		
	}

}
