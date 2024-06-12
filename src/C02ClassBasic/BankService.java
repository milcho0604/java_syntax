package C02ClassBasic;

// BankService라는 클래스 생성
//  -> main메서드에서 BackAccount 객체 생성 후 입금 출금 등 테스드
//BankAccount라는 클래스 생성
//- accountNumber(계좌번호), balance(잔액) 변수
//- 생성자 1개 : accountNumber를 초기화
//- getter가 모든 변수에 맞게 존재
//- deposit(예금하기) : balance(잔액) 증가시키는 메서드
//    -> "~원 입금되었습니다."
//- withdraw(출금하기) : balance 감소시키는 메서드
//    -> 가지고 있는 돈보다 잔액이 부족하면 "잔액이 부족합니다."
//    -> 충분하면 "~원 출금되었습니다."

// 1, 계좌개설 2. 입금 3. 출금. 4.계좌 송금

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1. 계좌번호 입력하세요
// 2. 얼마 입금하시겠어요?
// 3. 얼마 출금하시겠어요?
// 4-1. 누구에게 송금하시겠어요?
// 4-2.  얼마를 송금하시겠어요
public class BankService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 계좌와 잔액 추가
        BankAccount account1 = new BankAccount("12345", 10000);
        BankAccount account2 = new BankAccount("67890", 10000);
        BankAccount account3 = new BankAccount("77552", 10000);

        List<BankAccount> bankAccounts = new ArrayList<>();

        while (true) {
            System.out.println("어떤 서비스를 이용하시겠습니까? : 1.계좌개설 2. 입금 3. 출금 4. 송금");
            int number = Integer.parseInt(sc.nextLine());
            if (number == 1) {
                System.out.println("계좌번호를 입력하세요.");
                String ac = sc.nextLine();                      // 생성할 계좌번호
                BankAccount bankAccount = new BankAccount(ac, 0);
                bankAccounts.add(new BankAccount(ac, 0));
            } else if (number == 2) {
                System.out.println("계좌번호를 입력해주세요");
                String ac = sc.nextLine();                      // 찾을 계좌번호
                System.out.println("입금할 금액을 입력해주세요.");
                int money = Integer.parseInt(sc.nextLine());    // 입금 금액
                for (int i = 0; i < bankAccounts.size(); i++) {
                    if (bankAccounts.get(i).getAccountNumber().equals(ac)) {
                        bankAccounts.get(i).deposit(money);
                    }
                }

            } else if (number == 3) {
                System.out.println("계좌번호를 입력해주세요");
                String ac = sc.nextLine();                      // 출금할 계좌번호
                System.out.println("출금할 금액을 입력하세요.");
                int money = Integer.parseInt(sc.nextLine());    // 출금 금액
                for(int i=0; i<bankAccounts.size(); i++){
                    if(bankAccounts.get(i).getAccountNumber().equals(ac)){
                        bankAccounts.get(i).withdraw(money);
                    }
                }
            } else if (number == 4) {
                System.out.println("본인 계좌번호를 입력하세요.");
                String myNumber = sc.nextLine();
                System.out.println("송금할 계좌를 입력해주세요.");
                String yourNumber = sc.nextLine();
                System.out.println("송금할 금액을 입력해주세요.");
                int money = Integer.parseInt(sc.nextLine());
                BankAccount myAccount = null;
                BankAccount yourAccount = null;
                for(int i=0; i<bankAccounts.size(); i++){
                    if(bankAccounts.get(i).getAccountNumber().equals(myNumber)){
                        myAccount = bankAccounts.get(i);
                    }
                    if(bankAccounts.get(i).getAccountNumber().equals(yourNumber)){
                        yourAccount = bankAccounts.get(i);
                    }
                }
                myAccount.transfer(yourAccount, money);
            }
        }

    }
}


class BankAccount {
    private String accountNumber; // 계좌
    private int balance;          // 잔액

    // 별도 생성자
    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    // 송금
    public void deposit(int money) {
        this.balance += money;
        System.out.println(money + "원 입금되었습니다.");
        System.out.println(accountNumber + "님의 현재 잔액은" + balance + "원 입니다.");

    }

    // 출금
    public void withdraw(int money) {
        if (this.balance < money) {
            System.out.println("잔액 부족입니다.");
        } else {
            this.balance -= money;
            System.out.println(money + "원 출금되었습니다.");
            System.out.println(accountNumber + "님의 현재 잔액은" + balance + "원 입니다.");
        }
    }

    // 송금
    public void transfer(BankAccount bankAccount, int money) {
        if (this.balance > money) {
            this.balance -= money;
            bankAccount.deposit(money);
            System.out.println(accountNumber + "님의 현재 잔액은" + balance + "원 입니다.");
        } else {
            System.out.println("잔액이 부족헙니다.");
        }
    }


}

