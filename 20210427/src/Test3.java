//문제3
/*문자열을 정수로 변환할떄 발생하는..
 *  NumberFormatException을 처리하는 프로그램을 작성하라.*/
public class Test3 {
	public static void main(String[] args) {

		String[] stringNumber = { "23", "12", "998", "3.141592" };

		try {
			for (int i = 0; i < stringNumber.length; i++) {
					
				//"3.141592"실수형태의 문자열을 정수로 변환 할수 없기때문에 
					//NumberFormatException이 발생함
				
				int j = Integer.parseInt(stringNumber[i]);
				
				System.out.println("숫자로 변환된 값은  " + j);
			}
		} catch (NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다.");
			e.printStackTrace();
		}
		System.out.println("프로그램의 소소코드가 끝까지 수행됨");
	}

}
//실행결과
//숫자로 변환된 값은 23
//숫자로 변환된 값은 12
//숫자로 변환된 값은 998
//정수로 변환할 수 없습니다.
/*java.lang.NumberFormatException: For input string: "3.141592"
at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
at java.base/java.lang.Integer.parseInt(Integer.java:652)
at java.base/java.lang.Integer.parseInt(Integer.java:770)
at Test3.main(Test3.java:12)*/