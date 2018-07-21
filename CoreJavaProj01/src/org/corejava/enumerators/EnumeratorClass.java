package org.corejava.enumerators;

//simple Enumerator
enum AccCntrl
{
	defaultAcc,publicAcc,protectedAcc,PrivateAcc
}

//Enumerator with constructor 
enum Construct
{
  User1("Sankar"),User2("Udhaya"),User3("Rajesh");	
    private String name;
    public String Getname()
    {
    	return this.name;
    }
	Construct(String Name)
	{
		this.name=Name;
	}
}
public class EnumeratorClass {
	
	public static void main(String[] Args)
	{
		// Creating instance of enum <No need to use new Keyword !>
		AccCntrl Acs ;
		// Assign a value to Acs.
		Acs = AccCntrl.publicAcc;
		System.out.println("PublicAcc "+ Acs);
		AccCntrl Acs2 ;
		Acs2 = AccCntrl.defaultAcc;
		AccCntrl Acs3 ;
		Acs3 = AccCntrl.publicAcc;
		
		String Message = (Acs == Acs2 )? "Enum equals Acs1 and Ac2" : " Acs1 and Ac2 Not Equal";
		{
			System.out.println(Message);
		}
		
		if (Acs == Acs3 )
		{
			System.out.println("Enum equals Acs and Ac3");
		}
		//get Enum from constructor
		System.out.println("Enum from constructor :"+Construct.User1.Getname());
		
		//using Values in Enum
		AccCntrl[] EnumVals = AccCntrl.values();
		
		for (AccCntrl x : EnumVals) 
		{
		System.out.println("Enum Vals "+ x);
		}
		
		//using Valueof 
		
		System.out.println("Value of the enum Construct Available "+ Construct.valueOf("User1").Getname());
		
	}
}
