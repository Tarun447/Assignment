package com.cap.org.TestAssignment_3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import javax.naming.InsufficientResourcesException;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testwithdraw() {
		BankAccount a = new BankAccount();
		assertThrows(InsufficientFundException.class, ()-> a.Withdraw(20000),"An Exception may be occurred" );
	}
	
	
	@Test
	void testwithdraw1() throws InsufficientFundException {
		BankAccount a1 = new BankAccount();
		String expected = "wait for a momment";
		assertEquals(expected, a1.Withdraw(19999));
	}
}

