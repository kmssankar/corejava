package org.corejava.override;

public class OverrideMain {

	public static void main(String[] args) {
		ChildClass childInst = new ChildClass(12,"Cognizant " ,"Technolgy and Outsourcing");
		childInst.privatedetails();
		childInst.showDetails(12);
		childInst.showDetails();
	}
}

/*OUTPUT
Private Show Details : 12 . Cognizant  is of type Technolgy and Outsourcing
Base Show Details : 12 . Cognizant  is of type Technolgy and Outsourcing
Private Show Details : 12 . Cognizant  is of type Technolgy and Outsourcing
 Child Show Details : 12 . Cognizant  is of type Technolgy and Outsourcing
Base Show Details : 12 . Cognizant  is of type Technolgy and Outsourcing
Private Show Details : 12 . Cognizant  is of type Technolgy and Outsourcing
 Child Show Details : 12 . Cognizant  is of type Technolgy and Outsourcing*/