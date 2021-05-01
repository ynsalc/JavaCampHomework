package javaKampOdev;

public class Instructor extends User
{
	private String givenCourses;
	private int id;
	private String experianceYear;
	private String expertiseArea;
	
	public Instructor() {}
	
	public Instructor(String givenCourses, int id, String experianceYear, String expertiseArea) 
	{
		this.givenCourses = givenCourses;
		this.id = id;
		this.experianceYear = experianceYear;
		this.expertiseArea = expertiseArea;
	}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExperianceYear() {
		return experianceYear;
	}

	public void setExperianceYear(String experianceYear) {
		this.experianceYear = experianceYear;
	}

	public String getExpertiseArea() {
		return expertiseArea;
	}

	public void setExpertiseArea(String expertiseArea) {
		this.expertiseArea = expertiseArea;
	}
}
