import java.util.ArrayList;

class Course {

	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	/** Add student to list */
	public void addStudent(String student) {
		students.add(student);
	}

	/** Display list of students as string array */
	public String[] getStudents() {
		String [] list = students.toArray(new String[students.size()]);
		return list;
	}

	/** Return the number of students in the list */
	public int getNumberOfStudents() {
		numberOfStudents = students.size();
		return numberOfStudents;
	}  

	/** Return course name */
	public String getCourseName() {
		return courseName;
	}  

	/** Remove student from the list */
	public void dropStudent(String student) {
		students.remove(student);
	}

	/** Remove all students from the list */
	public void clear() {
		students.removeAll(students);
	}
}
