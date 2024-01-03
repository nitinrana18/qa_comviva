package TestClassesTest;

import TestClasses.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void testReverse() {
        StringUtils utils = new StringUtils();
        assertEquals("olleh", utils.reverse("hello"));
        assertEquals("", utils.reverse(""));
        assertEquals("12345", utils.reverse("54321"));
    }

    @Test
    public void testIsPalindrome() {
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPalindrome("radar"));
        assertFalse(utils.isPalindrome("hello"));
        assertTrue(utils.isPalindrome(""));
    }

    @Test
    public void testConcatenate() {
        StringUtils utils = new StringUtils();
        assertEquals("HelloWorld", utils.concatenate("Hello", "World"));
        assertEquals("abc123", utils.concatenate("abc", "123"));
        assertEquals("test", utils.concatenate("test", ""));
        assertEquals("test", utils.concatenate("", "test"));
    }

    @Test
    public void testCountOccurrences() {
        StringUtils utils = new StringUtils();
        assertEquals(2, utils.countOccurrences("hello", 'l'));
        assertEquals(0, utils.countOccurrences("world", 'z'));
        assertEquals(2, utils.countOccurrences("programming", 'm'));
        assertEquals(0, utils.countOccurrences("", 'a'));
    }
}
