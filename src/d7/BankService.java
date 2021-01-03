package d7;

public class BankService {

	int balance;
	
	// 입금 메서드
	public void deposit( int money ) {
		balance = balance + money;
	}
 	
	// 출금 메서드
	public int withdraw() {
		int result;
		
		result = balance;
		
		balance = 0;
		
		return result;
	}
	
	
}
