package d7;

public class Quiz {

	// 도표 먼저 그리고 시작하기
	String text;
	
	Quiz yes;
	
	Quiz no;

	public Quiz(String str) {
		this.text = str;
	}
	
	public String toString() {
		return this.text;
	}
}
