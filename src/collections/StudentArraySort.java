package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentArraySort {

	public static void main(String[] args)
	{
		List<Student> student = List.of(new Student(100,"Mike"), new Student(22,"Ken"), new Student(300, "Ben"));
		
		
		ArrayList<Student> studentAl = new ArrayList<>(student);
		System.out.println(studentAl);
		Collections.sort(studentAl);
		System.out.println("Desc" +studentAl);
		studentAl.sort(new AscStudentArraySort());
		System.out.println("Asc" +studentAl);
	}
	
}
