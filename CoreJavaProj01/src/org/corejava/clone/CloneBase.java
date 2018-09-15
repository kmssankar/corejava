package org.corejava.clone;

public class CloneBase implements Cloneable {
	
	int id;
	String Name;
	
	public CloneBase(int id, String name) {
		super();
		System.out.println("Clone Base Called !!");
		this.id = id;
		Name = name;
	}

	public Object clone()
	{
		Object Obj =null;
		try
			{
				if (Obj==null)
						{
							Obj= super.clone();
						}
				
			} catch (CloneNotSupportedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		return Obj;
	}
}
