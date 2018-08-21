package org.advanced.generics;

public class GenericClassObjMain {

	public static void main(String[] args) {
		
		BUUser BUUserInst = getInstance( BUUser.class);
		System.out.println(BUUserInst);

	}
	
	public static <T> T getInstance(Class<T> theclass)
	{
		T Inst = null;
		try
			{
				Inst = theclass.newInstance();
				
			} catch (InstantiationException | IllegalAccessException e)
			{
				e.printStackTrace();
			}
		return(Inst);
	}

}

class BUUser
{
	int id;
	String type;
	String role;
	
	BUUser()
	{
		this.id =12;
		this.role = "Business User";
		this.type = "Manufacturing Plant";
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", type=" + type + ", role=" + role + "]";
	}
}