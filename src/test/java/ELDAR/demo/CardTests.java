package ELDAR.demo;

import ELDAR.demo.Domain.Card.VISA;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

@SpringBootTest
public class CardTests {

	VISA visa;

	@Before
	public void prelude() {
		visa = new VISA();
		visa.setCardNumber("1111222233334444");
		visa.setCardholder("FRANCISCO PEDUTO");
		visa.setExpirationDate(LocalDateTime.of(2025,1,1,1,1,1));
	}

	@Test
	public void cardInformationTest() {
		assertEquals("Card Number: 1111222233334444\n" +
						"Card Holder: FRANCISCO PEDUTO\n" +
						"Expiration Date: " + LocalDateTime.of(2025,1,1,1,1,1).toString(),
				visa.cardInformation());
	}

	@Test
	public void validOperationTest() {
		assertTrue(visa.validOperation((float) 1000));
	}

	@Test
	public void validCardTest() {
		assertTrue(visa.validCard());
	}

	@Test
	public void differentCardsTest() {
		assertFalse(visa.isDifferentTo(visa));
	}

	@Test
	public void interestRateTest() {
		assertEquals("VISA: 2.3" , visa.getBrand() + ": " + visa.interestRate().toString());
	}

}
