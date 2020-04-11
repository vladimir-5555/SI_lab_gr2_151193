import java.util.List;
import java.util.ArrayList;

class Student {
	String index;
	String firstName;
	String lastName;
	
	List<Integer> grades = new ArrayList();

	public Student() {

	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String value) {
		index = value;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String value) {
		firstName = value;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String value) {
		lastName = value;
	}

	public double getAverage() {
		double sum = 0;
		for (int grade : grades) {
			sum += grade;
		}

		if (sum == 0)
			return 0;

		return sum / grades.size();
	}

	public int ECTSCredits() {
		return grades.size() * 6;
	}
}
