
public class Test34 {

	public static void main(String[] args) {
		//문제 : 0과 10사이의 짝수들의 합 구하기
		//4바이트 크기의 정수값을 저장할 sum1변수 선언 후 0 저장
		//for반복문 이용하여 초기식 -> int j = 0; 
						//조건식 -> j 10보다 작거나 같냐?
						//증감식 -> j변수에 저장된 값을 2씩 증가
		
		
		int sum1 = 0;
		
		for(int j = 0; j<=10; j+=2) {
			sum1 += j;
			System.out.println(j + " : " + sum1);
			
		}
		
		
		
		/*출력결과
			0 : 0
			2 : 2
			4 : 6
			6 : 12
			8 : 20
		   10 : 30
		 
		 */
		
		System.out.println("--------------------------------");
		
		//문제 : for문을 이용하여 "Hello World" 문자열을 10번 반복해서 출력!
		
		
		
		for(int n=1; n<=10; n++) {
			System.out.println("Hello World");
			
			
		}
		
		
		
		System.out.println("--------------------------------");
		
		
		//문제: for문을 이용하여 1부터 10까지 숫자중 홀수들의 합을 최종적으로 구해 한번만 출력
		
		int sumOn = 0;
		
		for(int i = 1; i<=10; i+=2) {
			sumOn+=i;
			
		}
		System.out.println("홀수의 총 합계는: " + sumOn);
		
		
		System.out.println("--------------------------------");
		
		
		//문제 : 1부터 100까지의 짝수합을(2550)을 출력
		
		int sumEn = 0;
		
		for(int j = 1; j<=100; j++) {
			
			if(j%2 == 0) {
				sumEn+=j;
				
			}
			
		}
		System.out.println("짝수합은 : " + sumEn );
		
		System.out.println("--------------------------------");
		
		/*
		 break문
		 break문은 현재 위치에서 가장 가까운 반복문을 벗어나는데 사용하는 키워드
		 주로 if문과 함께 사용되어 특정 조건식을 만족하면 반복문을 벗어나는데 사용하는 키워드
		 */
		
		//10번 반복하여 i 변수값을 출력하고 i 변수에 저장되는 값이 5가 되면 ,for반복문을 완전히 빠져 나가게 하기
		
		for(int i = 0; i<=10; i++) {
			if(i==5) {
			break;	
				
			}
			System.out.println(i);
			
		}

		System.out.println("--------------------------------");
		
		//문제: for반복문을 이용하여 구구단 출력
		//제목 붙이기 표시
		
		
		
		for(int i =1; i<=9; i++) {
			// 바깥쪽 행(세로)반복
			
			for(int j =2; j<=9; j++) {
				 // 안쪽 열(가로)반복
				//System.out.print(j + "X" +  i + " = " + (j * i)+ "    ");
				System.out.printf("%dX%d=%2d   ",j,i,(j*i));
				//%2d는 정수형으로 2자리까지 나타냄
				//%d <-정수
				//%s <-문자열
			}
			
			//하나의 행이 완성될때 줄바꿈 출력
			System.out.println();
		}
	
		
		
		System.out.println("--------------------------------");
		
		/*
		 문제: 다중 for문 사용하여 아래와 같이 * 출력
		 *
		 **
		 ***
		 ****
		 *****
		 */
		
	
		for(int i =0; i<=5; i++) {
			for(int j =0; j<i; j++) {
				
				System.out.print("*"); //그냥 출력만
		
			}
			System.out.println(); //줄바꿈출력
		
		}
	
		
		
		
	}

}
