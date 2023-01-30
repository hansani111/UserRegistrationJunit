package com.bridgelabz.registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userValidation = new UserRegistration();

	/* Test cases to validate First Name */
	@Test
	public void givenFirstName_whenValid_shouldReturnTrue() {

		boolean result;
		try {
			result = userValidation.validateFirstName("Hansani");
			Assert.assertEquals(true, result);
		} catch (Exception e) {
		}

	}

	@Test
	public void givenFirstName_whenInvalid_shouldReturnFalse() {
		boolean result;
		try {
			result = userValidation.validateFirstName("hansani");
			Assert.assertEquals(false, result);
		} catch (Exception e) {
		}

	}

	@Test
	public void givenFirstName_WhenNull_ShouldThrowUserValidationException() {
		try {
			userValidation.validateFirstName(null);
		} catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, e.type);
		}

	}

	@Test
	public void givenFirstName_WhenEmpty_ShouldThrowUserValidationException() {

		UserRegistration userValidator = new UserRegistration();
		try {
			userValidation.validateFirstName("  ");
		} catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, e.type);
		}

	}

	/* Test cases to validate Last Name */
	@Test
	public void givenLastName_whenValid_shouldReturnTrue() {
		boolean result;
		try {
			result = userValidation.validateLastName("Deshmukh");
			Assert.assertEquals(true, result);
		} catch (UserRegistrationException e) {
		}

	}

	@Test
	public void givenLastName_whenInvalid_shouldReturnFalse() {
		boolean result;
		try {
			result = userValidation.validateLastName("deshmukh");
			Assert.assertEquals(false, result);
		} catch (UserRegistrationException e) {
		}

	}

	@Test
	public void givenLastName_WhenNull_ShouldThrowUserValidationException() {
		try {
			userValidation.validateLastName(null);
		} catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, e.type);
		}

	}

	@Test
	public void givenLastName_WhenEmpty_ShouldThrowUserValidationException() {

		UserRegistration userValidator = new UserRegistration();
		try {
			userValidation.validateLastName("  ");
		} catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, e.type);
		}

	}

	/* Test cases to validate Email */

	@Test
	public void givenEmail_whenValid_shouldReturnTrue() {
		boolean result;
		try {
			result = userValidation.validateEmail("hansani.deshj@gmail.com.vj");
			Assert.assertEquals(true, result);
		} catch (UserRegistrationException e) {
		}

	}

	@Test
	public void givenEmail_whenInvalid_shouldReturnFalse() {
		boolean result;
		try {
			result = userValidation.validateEmail("deshmukhhsd.@gmail.com");
			Assert.assertEquals(false, result);
		} catch (UserRegistrationException e) {
		}

	}

	@Test
	public void givenEmail_WhenNull_ShouldThrowUserValidationException() {
		try {
			userValidation.validateEmail(null);
		} catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, e.type);
		}

	}

	@Test
	public void givenEmail_WhenEmpty_ShouldThrowUserValidationException() {

		UserRegistration userValidator = new UserRegistration();
		try {
			userValidation.validateEmail("  ");
		} catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, e.type);
		}

	}

	/* Test cases to validate MobileNumber */

	@Test
	public void givenMobileNumber_whenValid_shouldReturnTrue() {
		boolean result;
		try {
			result = userValidation.validateMobileNumber("+91 9876543210");
			Assert.assertEquals(true, result);
		} catch (UserRegistrationException e) {
		}

	}

	@Test
	public void givenMobileNumber_whenInvalid_shouldReturnFalse() {
		boolean result;
		try {
			result = userValidation.validateMobileNumber("+919876543210");
			Assert.assertEquals(false, result);
		} catch (UserRegistrationException e) {
		}

	}

	@Test
	public void givenMobileNumber_WhenNull_ShouldThrowUserValidationException() {
		try {
			userValidation.validateMobileNumber(null);
		} catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, e.type);
		}

	}

	@Test
	public void givenMobileNumber_WhenEmpty_ShouldThrowUserValidationException() {

		UserRegistration userValidator = new UserRegistration();
		try {
			userValidation.validateMobileNumber("  ");
		} catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, e.type);
		}

	}

	/* Test cases to validate Password */
	@Test
	public void givenPassword_whenValid_shouldReturnTrue() {
		boolean result;
		try {
			result = userValidation.validatePassword("Ab@cd123");
			Assert.assertEquals(true, result);
		} catch (UserRegistrationException e) {
		}

	}

	@Test
	public void givenPassword_whenInvalid_shouldReturnFalse() {
		boolean result;
		try {
			result = userValidation.validatePassword("ab@cd123");
			Assert.assertEquals(false, result);
		} catch (UserRegistrationException e) {
		}

	}

	@Test
	public void givenPassword_WhenNull_ShouldThrowUserValidationException() {
		try {
			userValidation.validatePassword(null);
		} catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, e.type);
		}

	}

	@Test
	public void givePasswordr_WhenEmpty_ShouldThrowUserValidationException() {

		UserRegistration userValidator = new UserRegistration();
		try {
			userValidation.validatePassword("  ");
		} catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, e.type);
		}

	}

}