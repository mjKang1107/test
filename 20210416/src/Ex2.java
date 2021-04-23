
class CurrencyConvert{
	static double rate;
	public static double toDollar(double won) {
		return won/rate;
		
	}
	public static double toKWR(double dallar) {
		return dallar*rate;
		
	}
	public static void setRate(double r) {
		rate = r;
	}
}


public class Ex2 {

	public static void main(String[] args) {
		CurrencyConvert.setRate(1121);
System.out.println("백만원은" + (CurrencyConvert.toDollar(1000000))+"달러입니다.");
System.out.println("백달러는" + ( CurrencyConvert.toKWR(100))+"원입니다.");
	}

}
