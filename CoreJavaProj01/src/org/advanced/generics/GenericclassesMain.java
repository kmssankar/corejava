package org.advanced.generics;

public class GenericclassesMain {

	

	public static void main(String[] args) {
		
		User UserInst = new User(0, "Test User");
		GenericColl<User> userColl = new GenericColl<User>(UserInst);
		userColl.display();
		userColl.addElem(new User(13,"Einstein"));
		userColl.addElem(new User(13,"Marie Curie"));
		userColl.addElem(new User(13,"James Rutherford"));
		userColl.showList();
		
		
		Course CourseInst = new Course(0, "Test Course");
		GenericColl<Course> CourseColl = new GenericColl<Course>(CourseInst);
		CourseColl.display();
		CourseColl.addElem(new Course(01,"Theoritcal Physics"));
		CourseColl.addElem(new Course(01,"Radiology"));
		CourseColl.addElem(new Course(01,"Atomic Physics"));
		CourseColl.showList();
		
	}

}

/*OUTPUT
User [id=0, Name=Test User]
Displaying the List
User [id=13, Name=Einstein]
User [id=13, Name=Marie Curie]
User [id=13, Name=James Rutherford]
Course [id=0, Name=Test Course]
Displaying the List
Course [id=1, Name=Theoritcal Physics]
Course [id=1, Name=Radiology]
Course [id=1, Name=Atomic Physics]*/