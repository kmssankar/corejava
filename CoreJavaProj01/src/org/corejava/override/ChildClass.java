package org.corejava.override;

public class ChildClass extends BaseClass {
	
	public ChildClass(int id, String company, String indusType) {
		super(id, company, indusType);
	}

	public void showDetails(int i)
	{
		super.showDetails();
		System.out.println(" Child Show Details : "+ id + " . " +company + " is of type " + indusType);
	}
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println(" Child Show Details : "+ id + " . " +company + " is of type " + indusType);
	}
	
	protected void privatedetails()
	{
		System.out.println("Private Show Details : "+ id + " . " +company + " is of type " + indusType);
	}
}
