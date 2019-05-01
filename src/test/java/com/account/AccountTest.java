package com.account;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {
	
	@Test
	public void creatingAccountWithBuilder() {
		Account acc = new Account.Builder(12345)
				.withOwner("fulano")
				.atAgency("147")
				.openingBalance(8001)
				.withAccManutentionTax(2.5)
				.build();
		
		assertEquals(12345, acc.getAccNumber());
		assertEquals("fulano", acc.getOwner());
		assertEquals("147", acc.getAgency());
		assertEquals(8001, acc.getBalance(), 0);
		assertEquals(2.5, acc.getAccManutentionTax(), 0);
	}
}
