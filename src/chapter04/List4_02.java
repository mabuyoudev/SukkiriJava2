// 銀行口座クラスのequals()をオーバーライド

package chapter04;

public class List4_02 {

	public static void main(String[] args) {
		Account a1 = new Account("1111");
		Account a2 = new Account("1112");
		System.out.println(a1.equals(a2));
	}

}

class Account {
	String accountNo;	
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null) return false;
		if(!(o instanceof Account)) return false;
		Account r = (Account) o;
		if(!this.accountNo.trim().equals(r.accountNo.trim())) {
			return false;
		}
		return true;
	}
}
