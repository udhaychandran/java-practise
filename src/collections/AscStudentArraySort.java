package collections;

import java.util.Comparator;

public class AscStudentArraySort implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(), student2.getId());
		
	}

}
