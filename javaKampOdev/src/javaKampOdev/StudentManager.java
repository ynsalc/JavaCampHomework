package javaKampOdev;

public class StudentManager 
{
	void add(Student student) 
	{
		System.out.println(student.getName()+ " Sisteme eklendi.");
	}
	
	void getDetail(Student student)
	{
		System.out.println(student.getName());
		System.out.println(student.getCourseName());
		System.out.println(student.getCourseInstructor());
	}
	
	public void addMultiple(Student[] students)
	{
		for(Student student : students)
		{
			add(student);
		}
	}
}
