package TestClassesTest;

import TestClasses.EmailValidator;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailValidatorTest {

    @Test
    public void testIsValidEmail() {
        EmailValidator validator = new EmailValidator();
        assertTrue(validator.isValidEmail("user@example.com"));
        assertTrue(validator.isValidEmail("john.doe123@test.co"));
        assertFalse(validator.isValidEmail("invalid_email"));
        assertFalse(validator.isValidEmail("user@invalid@domain.com"));
        assertFalse(validator.isValidEmail(null));
    }

    @Test
    public void testIsCorporateEmail() {
        EmailValidator validator = new EmailValidator();
        assertFalse(validator.isCorporateEmail("user@example.com"));
        assertTrue(validator.isCorporateEmail("employee@company.com"));
        assertFalse(validator.isCorporateEmail("john.doe@gmail.com"));
        assertFalse(validator.isCorporateEmail("invalid_email"));
        assertFalse(validator.isCorporateEmail(null));
    }
}
