package d7;

import java.util.Scanner;

public class SaveUI {
	  //공유
	  Scanner scanner;
	  //조력자/의존성
	  SaveService service;
	  
	  // 생성자
	  public SaveUI(){
	     scanner = new Scanner(System.in);
		 service = new SaveService();
	  }

	  //입금인지 출금 
	  public void init() {
	     //while
	    System.out.println("입금 1, 출금 2");
		int oper = Integer.parseInt(scanner.nextLine());
		
		if(oper == 1){
			inputDeposit();
		}else if(oper == 2) {
			confirmWithdraw();
		}
		
	  }
	  
	  //입금 
	  public void inputDeposit() {
	      int money = Integer.parseInt(scanner.nextLine());
		  service.deposit(money);
	  }
	  //출금
	  public void confirmWithdraw() {
	      System.out.println("진짜 배따실라고?");
		  int total = service.withdraw(); // 메소드의 리턴값을 복사해서 담는다.
		  System.out.println(total);
	  }  
}