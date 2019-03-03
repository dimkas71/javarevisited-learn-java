package ua.compserv.javarevisited;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("How to check if string is not null and empty in Java")
class CheckIfStringIsNotNullAndEmptyTest {
	
	@Test
	@DisplayName("check if empty string then false")
	void emptyChecking() {
		assertFalse(StringExtensions.isNotNullAndEmptyThroughIsEmpty(""), () -> "String should be false");
		assertFalse(StringExtensions.isNotNullAndEmptyThroughIsEmpty2(""), () -> "String should be false");
		assertFalse(StringExtensions.isNotNullAndEmptyThroughLength(""), () -> "String should be false");
	}

	@Test
	@DisplayName("check if null then false") 
	void nonNullChecking() {
		assertFalse(StringExtensions.isNotNullAndEmptyThroughIsEmpty(null), () -> "Should be false");
		assertFalse(StringExtensions.isNotNullAndEmptyThroughIsEmpty2(null), () -> "Should be false");
		assertFalse(StringExtensions.isNotNullAndEmptyThroughLength(null), () -> "Should be false");
	}
	
	@Test
	@DisplayName("string with one space should be considered as empty")
	void checkIfStringWithSpackeIsEmpty() {
		assertFalse(StringExtensions.isNotNullAndEmptyThroughIsEmpty(" "), () -> "Should be false for non empty string with spaces...");
		assertFalse(StringExtensions.isNotNullAndEmptyThroughIsEmpty2(" "), () -> "Should be false for non empty string with spaces...");
		assertFalse(StringExtensions.isNotNullAndEmptyThroughLength(" "), () -> "Should be false for non empty string with spaces...");
	}
	
}


class StringExtensions {
	public static boolean isNotNullAndEmptyThroughIsEmpty(String checked) {
		
		return checked != null ? !checked.replaceAll(" ", "").isEmpty() : false;
	}
	
	public static boolean isNotNullAndEmptyThroughIsEmpty2(String checked) {
		return (checked != null) && (!checked.replaceAll(" ", "").isEmpty());
	}
	
	public static boolean isNotNullAndEmptyThroughLength(String checked) {
		return checked != null ? checked.replaceAll(" ", "").length() > 0 : false;
	}
	
}