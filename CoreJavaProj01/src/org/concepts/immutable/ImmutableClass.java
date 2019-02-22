package org.concepts.immutable;

import java.util.ArrayList;

public final class ImmutableClass {
	
	private final int id;
	
	private final String name;
	
	private final ArrayList<String> list;
	
	public ImmutableClass(int id , String name , ArrayList<String> lis)
	{
		this.id = id;
		this.name = name;
		
		ArrayList<String> tempList = new ArrayList<String>();
		for(String str:lis)
			{
				tempList.add(str);
			}
		this.list = tempList;
	}
	
	public int getid()
	{
		return this.id;
	}

	public String getname()
	{
		return this.name;
	}
	
	public ArrayList<String> getlist()
	{
		return (ArrayList<String>) this.list.clone();
	}
}
