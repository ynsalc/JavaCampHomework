package javaKampOdev;

public class Main {

	public static void main(String[] args) 
	{
		Student s1 = new Student(3,"Engin Demiro�","Java Yaz�l�m geli�tiricisi yeti�tirme kamp�");
		s1.setName("Yunus Al�c�");
		
		Student s2 = new Student(3,"Engin Demiro�","Java Yaz�l�m geli�tiricisi yeti�tirme kamp�");
		s2.setName("Murat Varl�");
		
		Student[] students = {s1,s2};
		
		Instructor i1 = new Instructor("Java Yaz�l�m geli�tiricisi yeti�tirme kamp�",1,"15","Java,C#");
		i1.setName("Engin Demiro�");
		
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
