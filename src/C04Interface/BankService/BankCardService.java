package C04Interface.BankService;

// 비즈니스 로직이 동작하는 코드가 Service 코드
public class BankCardService implements BankService {
    @Override
    public void deposit(int money, BankAccount bankAccount) {
        int myMoney = bankAccount.getBalance();
        int total = money + money;
        bankAccount.updateBalance(total);
        System.out.println(money + "원 카드로 입금되었습니다.");
        System.out.println("현재 잔액은 " + total);
    }

    @Override
    public void withdraw(int money, BankAccount bankAccount) {
//        int myMoney = bankAccount.getBalance();
        int total = 0;
        if (bankAccount.getBalance() < money) {
            System.out.println("잔액 부족입니다.");
        } else {
            total = bankAccount.getBalance() - money;
            bankAccount.updateBalance(total);
            System.out.println(money + "원 카드로 출금되었습니다.");
        }
        System.out.println("현재 잔액은 " + total);
    }
}

