package org.advanced.generics;

import java.util.ArrayList;
import java.util.List;

class User {
	int id;
	String Name;
	
	public User(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + "]";
	}

}

class Course {
	int id;
	String Name;

	public Course(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", Name=" + Name + "]";
	}

}

class GenericColl<T> {
	private T t;
	List<T> mylist = new ArrayList<T>();
	
	public void addElem(T elem)
	{
		mylist.add(elem);
	}
	
	public void showList()
	{
		System.out.println("Displaying the List");
		for (T eachelm : mylist)
			{
				System.out.println(eachelm);
			}
	}
	
	GenericColl(T Elem) {
		this.t = Elem;
	}

	public void display() {
		System.out.println(t);
	}
}
