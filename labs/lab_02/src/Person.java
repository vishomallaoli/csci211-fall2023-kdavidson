
public class Person {
	private String name;
	private int birthMonth;
	private int birthDay;



	// TODO:  Add constructor
	public Person(String name, int birthMonth, int birthDay) {
		this.name = name;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
	}

	// TODO:  Add getters/setters

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public int getBirthDay() {
		return birthDay;
	}

	// TODO:  Add toString method
	public String toString(){
		return getName() + " " + getBirthMonth() + "/" + getBirthDay();
	}
}
