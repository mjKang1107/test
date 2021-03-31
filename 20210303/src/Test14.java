/*
 
  연산자 문제1:
  아래의 코드는 사과를 담는데 필요한 바구니의 수를 구하는 코드이다.
  만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을수 있다면, 
  13의 바구니가 필요할 것이다.  (   )에 알맞은 코드를 넣으시오.
  

  */
public class Test14 {

	public static void main(String[] args) {
		// 사과개수 저장
		int numOfApples = 123;
		
		//하나의 바구니에 담을 수 있는 사과의 개수 저장
		int sizeOfBucket = 10;
		
		//모든 사과를 담는데 필요한 바구니수 구하기
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples % sizeOfBucket>0 ?  1 : 0);
	/*
	
	해설 : 사과의 개수 (numOfApples)를 바구니의 크기(sizeOfBucket)으로 나눗셈연산(/)을 하면 사과를 담는데 
	필요한 바구니의 수(numOfBucket)을 구할수 있다.
	정수간의 나눗셈 연산의 특징은 반올림하지 않고 버림을 한다는 것
	예를 들어 125/ 10의 결과는 13이 아니라 12가 된다.
	게다가 int와 int간의 이항연산의 결과는 int이기 때문
	12.5와 같은 실수값이 나오지않는다
	사과의 개수를 바구니의 크기로 나눴을때 나머지가 있으면 하나의 바구니가 더 필요하다.
	나머지 연산자(%)를 이용한다.

	  */	
		
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
	}

}
