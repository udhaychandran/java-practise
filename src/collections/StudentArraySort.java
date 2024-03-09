package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentArraySort {

	public static void main(String[] args)
	{
		List<Student> student = List.of(new Student(3,"Mike"), new Student(2,"Ken"), new Student(1, "Ben"));
		System.out.println(student);
		
		ArrayList<Student> studentAl = new ArrayList<>(student);
		Collections.sort(studentAl);
		System.out.println(studentAl);
	}
	
}
