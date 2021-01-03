package d7;

public class Memo {
	// 컨텐츠(데이터) 가지려고 만듬
	
	// 변수 선언
	public String content;
	
	// 생성자
	public Memo(String content) {
		super();
		this.content = content;
	}
	
	// toString
	@Override
	public String toString() {
		return "Memo [content=" + content + "]";
	}

	public boolean showResult() {
		// TODO Auto-generated method stub
		return this.content.equals("O");        // equals 는 == (문자비교)
	}
	
	// 인스턴스 메소드를 만들지 말지 판단.
	
	
	
}
