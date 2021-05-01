package javaKampOdev;

public class InstructorManager 
{
	void add(Instructor instructor) 
	{
		System.out.println(instructor.getName()+" Sisteme Eklendi.");
	}
	
	void addMultiple(Instructor[] instructors) 
	{
		for(Instructor instructor : instructors) 
		{
			add(instructor);
		}
	}
	
	void getDetail(Instructor instructor)
	{
		System.out.println(instructor.getName());
		System.out.println(instructor.getExperianceYear());
		System.out.println(instructor.getExpertiseArea());
		System.out.println(instructor.getGivenCourses());
	}
}
