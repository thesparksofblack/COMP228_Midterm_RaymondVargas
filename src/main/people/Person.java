package main.people;

public abstract class Person {
	
	// This is the unique ID for each person
	protected final int personId;
	
	// The two lines below is basic personal info
	protected String name;
	protected String phoneNumber;
	
	
	// static counter used to track the total number of Person objects that was created
	protected static int personCount = 0;
	
	public Person(int personId, String name, String phoneNumber) {
		this.personId = personId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		personCount++;
	}
	
	public static int getPersonCount() {
		return personCount;
	}
	
	public void displayBasicDetails() {
        System.out.println("ID: " + personId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
	}
	
	public abstract String getRoleDescription();
	
	@Override
	public String toString() {
		return name + " (" + getRoleDescription() + ")";
	}
}
