package org.designpattern.creational.Singleton;

import java.util.Date;

public class SingletonClass {
	
	static SingletonClass obj;
	String Name;
	private SingletonClass(String Str)
	{
		this.Name = Str;
	}
	
	public static SingletonClass getInstance()
	{
		Date Dt = new Date();
		if ( obj==null)
			{
				obj = new SingletonClass("Singleton Initialized @ " + Dt);
			}
		return obj;
	}

	@Override
	public String toString() {
		return "SingletonClass [Name=" + Name + "]";
	}
}
