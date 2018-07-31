package org.designpattern.creational.Prototype;

public abstract class Vehicle implements Cloneable {

	String Type;
	String Manufactuer;
	abstract void showDetails();
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getManufactuer() {
		return Manufactuer;
	}
	public void setManufactuer(String manufactuer) {
		Manufactuer = manufactuer;
	}
	
	public Object clone()
	{
		Object Clone = null;
		try
		{
			Clone=super.clone();
		}
		catch(CloneNotSupportedException CE)
		{
			CE.printStackTrace();
		}
		
		return Clone;
	}
	
}
