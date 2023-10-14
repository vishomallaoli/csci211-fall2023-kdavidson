
public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	
    // Insert constructor accepting two parameters: first name and last name, respectively
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Insert getters and setters for the instance variables
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Include a compareTo method that:
	//     returns 0  if "this" person and the parameter have the same first and last names
	//     returns the result of "compareTo" of the last names (if they are not the same)
	//     returns the result of "compareTo" of the first names if the last names are the same
	@Override
	public int compareTo(Person o) {
		int lastNameComparision = this.lastName.compareTo(o.firstName);

		if (lastNameComparision == 0){
			return this.firstName.compareTo(o.firstName);
		}
		else {
			return lastNameComparision;
		}
    }

    // Include a toString method.  The default from Source/Generate toString() is fine.
	@Override
	public String toString() {
		return "Person{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}

}