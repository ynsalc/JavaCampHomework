package javaKampOdev;

public class Main {

	public static void main(String[] args) 
	{
		Student s1 = new Student(3,"Engin Demiroð","Java Yazýlým geliþtiricisi yetiþtirme kampý");
		s1.setName("Yunus Alýcý");
		
		Student s2 = new Student(3,"Engin Demiroð","Java Yazýlým geliþtiricisi yetiþtirme kampý");
		s2.setName("Murat Varlý");
		
		Student[] students = {s1,s2};
		
		Instructor i1 = new Instructor("Java Yazýlým geliþtiricisi yetiþtirme kampý",1,"15","Java,C#");
		i1.setName("Engin Demiroð");
		
		Instructor[] instructor = {i1};
		
		InstructorManager im = new InstructorManager();
		im.addMultiple(instructor);
		im.getDetail(i1);
		
		StudentManager sm = new StudentManager();
		sm.addMultiple(students);
		sm.getDetail(s1);
		sm.getDetail(s2);
	}

}
