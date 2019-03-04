package ua.compserv.javarevisited;

public class StringExtensions {
	public static boolean isNotNullAndEmptyThroughIsEmpty(String checked) {
		
		return checked != null ? !checked.trim().isEmpty() : false;
	}
	
	public static boolean isNotNullAndEmptyThroughIsEmpty2(String checked) {
		return (checked != null) && (!checked.trim().isEmpty());
	}
	
	public static boolean isNotNullAndEmptyThroughLength(String checked) {
		return checked != null ? checked.trim().length() > 0 : false;
	}
}
