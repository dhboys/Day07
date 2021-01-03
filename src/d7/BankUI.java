package d7;

import java.util.Scanner;

public class BankUI {

	// 공유
	Scanner scanner;
	// 조력자
	BankService service;

	// 생성자
	public BankUI() {

		scanner = new Scanner(System.in);
		service = new BankService();
	}

	// 입금 출금 선택 메서드

	public void choice() {

		while (true) {

			System.out.println("입금은 1, 출금은 2를 입력해주세요: ");
			int oper = Integer.parseInt(scanner.nextLine());

			if (oper == 1) {
				inputDeposit();
			} else if (oper == 2) {
				confirmWithdraw();
			}

		}
	}

	// 입금 입력 메서드
	public void inputDeposit() {
		System.out.println("입급할 금액을 입력하세요: ");
		int money = Integer.parseInt(scanner.nextLine());
		service.deposit(money);
		System.out.println("입금이 완료되었습니다.");
	}

	public void confirmWithdraw() {
		int total = service.withdraw();
		System.out.println(total);
	}

}
