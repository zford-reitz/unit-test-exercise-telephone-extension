import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TelephoneNumberUtilsTest {

	@Test
	public void testInvalidNumber() {
		assertEquals("", TelephoneNumberUtils.extractExtension("+490531428239"));
	}

	@Test
	public void testEmptyExtension() {
		assertEquals("", TelephoneNumberUtils.extractExtension("+4912345678"));
	}

	@Test
	public void testTwoDigitExtension() {
		assertEquals("27", TelephoneNumberUtils.extractExtension("+491234567827"));
	}

	@Test
	public void testThreeDigitExtension() {
		assertEquals("372", TelephoneNumberUtils.extractExtension("+4912345678372"));
	}

	@Test
	public void testFourDigitExtension() {
		assertEquals("9999", TelephoneNumberUtils.extractExtension("+49123456789999"));
	}

	@Test
	public void testOneDigitExtensionIsInvalid() {
		assertEquals("", TelephoneNumberUtils.extractExtension("+49123456789"));
	}

	@Test
	public void testFiveDigitExtensionIsInvalid() {
		assertEquals("", TelephoneNumberUtils.extractExtension("+491234567899999"));
	}

	@Test
	public void testTenDigitExtensionIsInvalid() {
		assertEquals("", TelephoneNumberUtils.extractExtension("+49123456789999999999"));
	}

}
