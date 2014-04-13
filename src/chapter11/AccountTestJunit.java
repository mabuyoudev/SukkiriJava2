package chapter11;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTestJunit {

	@Test
	public void instantiate() {
		Account a	= new Account("ミナト", 30000);
		assertEquals("ミナト", a.owner);
		assertEquals(30000, a.balance);
	}

	/*@Test
	void transfer() {
		
	}*/
}
