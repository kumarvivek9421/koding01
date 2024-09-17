package forInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableClass {

	private final int intValue;
	private final String stringValue;
	private final List<String> listValue;
	
	// Constructor to initialize immutable fields
	public ImmutableClass(int intValue, String stringValue, List<String> listValue) {
		this.intValue = intValue;
		this.stringValue = stringValue;
//		this.listValue = listValue;
		
		// Create a defensive copy of the list to ensure immutability
		this.listValue = Collections.unmodifiableList(new ArrayList<>(listValue));
	}

	// Methods to access immutable fields
	public int getIntValue() {
		return intValue;
	}


	public String getStringValue() {
		return stringValue;
	}


	public List<String> getListValue() {
//		return listValue;
		
		// Return a defensive copy of the list to prevent modification of the original list
		return new ArrayList<>(listValue);
		
	}
	
	@Override
	public String toString() {
		return "ImmutableClass [intValue=" + intValue + ", stringValue=" + stringValue + ", listValue=" + listValue
				+ "]";
	}

	public void display() {
		System.out.println(this.intValue);
		System.out.println(this.stringValue);
		System.out.println(this.listValue);
	}
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("raman");
		list.add("sonu");
		ImmutableClass immutableClass = new ImmutableClass(101, "vivek", list);
		immutableClass.display();;
		System.out.println(immutableClass);
	}
}

