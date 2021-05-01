package javaKampOdev;

public class Student extends User
{
	private int courseCount;
	private String courseName;
	private String courseInstructor;
	
	public Student() {}
	
	public Student(int courseCount,String courseName,String courseInstructor) 
	{
		this.courseCount=courseCount;
		this.courseName=courseName;
		this.courseInstructor=courseInstructor;
	}

	public int getCourseCount() {
		return courseCount;
	}

	public void setCourseCount(int courseCount) {
		this.courseCount = courseCount;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}
}
