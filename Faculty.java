import java.util.List;
import java.util.ArrayList;

public class Faculty {
	String facultyName;

	List<Student> students;

	public Faculty() {
		students = new ArrayList<>();
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String value) {
		facultyName = value;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void studentStudent(Student student) {
		students.remove(student);
	}

	public double getAverageGrade() {
		double averages = 0;
		for (Student student : students) {
			averages += student.getAverage();
		}

		if (averages == 0)
			return 0;

		return averages / students.size();
	}
}