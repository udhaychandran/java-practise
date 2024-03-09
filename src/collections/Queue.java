package collections;

import java.util.*;

class StringLength implements Comparator<String>
{

	@Override
	public int compare(String animal1, String animal2) {
		// TODO Auto-generated method stub
		return Integer.compare(animal1.length(), animal2.length());
	}
	
}
public class Queue {

	public static void main(String[] args) {
		
		PriorityQueue<String> animals = new PriorityQueue<String>(new StringLength());
		animals.offer("Monkey");
		animals.offer("Zebra");
		animals.offer("Deer");
		animals.offer("Cat");
		animals.offer("Mice");
		System.out.println("The animal names after sorting: "+animals);
		animals.poll();
		animals.poll();
		System.out.println("The animal names after poll: "+animals);
		
		
	}
}
