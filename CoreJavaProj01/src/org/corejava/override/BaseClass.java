package org.corejava.override;

public class BaseClass {
	
	int id;
	String company;
	String indusType;
	
	public BaseClass(int id, String company, String indusType) {
		super();
		this.id = id;
		this.company = company;
		this.indusType = indusType;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getIndusType() {
		return indusType;
	}
	public void setIndusType(String indusType) {
		this.indusType = indusType;
	}
	
	public void showDetails()
	{
		System.out.println("Base Show Details : "+ id + " . " +company + " is of type " + indusType);
		privatedetails();
	}
	public void showDetails(String test)
	{
		System.out.println(test + " Base Show Details : "+ id + " . " +company + " is of type " + indusType);
		privatedetails();
	}
	
	private void privatedetails()
	{
		System.out.println("Base Private Show Details : "+ id + " . " +company + " is of type " + indusType);
	}
}
