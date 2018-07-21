package com.corejava.serialization;

import java.io.Serializable;

public class Course implements Serializable{
	private static final long serialVersionUID = 1926664713967449865L;
	int id;
	String name;
	String Field;
	public Course(int id, String name, String field) {
		super();
		this.id = id;
		this.name = name;
		Field = field;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", Field=" + Field + "]";
	}
	
	
}
