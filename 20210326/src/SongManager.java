
public class SongManager {
	public static void main(String args[]) {
		String[] composer = {"Benny Andersson" , "Bjorn Ulvaeus"};
		//ABBA의 "Dancint Queen" 노래를 Song객체로 생성하고
		Song s = new Song("Dancing Queen", "ABBA","Arrival", composer, 1977, 2);
		
		
		
		//show()를 이용하여 이노래의 정보를 출력하는 프로그램을 작성하라.
		s.show();
		
	}
}
