package chapter03;

public class List3_10 {

	public static void main(String[] args) {
		Account ac = new Account("11111", AccountType.FUTSU);
		ac.print();
	}

}

class Account {
	private String accountNo;
	private int balance;
	private AccountType accountType;
	public Account(String aNo, AccountType aType) {
		this.accountNo = aNo;
		this.accountType = aType;
	}
	public void print() {
		System.out.println(this.accountNo + this.accountType + this.balance);
	}
}

enum AccountType {
	FUTSU,
	TOUZA,
	TEIKI;
}
