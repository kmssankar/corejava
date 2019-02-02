package org.corejava.arrays;

import java.util.Arrays;

public class ComparableMain {

	public static void main(String[] args) {
		
		Course[] courseArr = new Course[3];
		courseArr[0] = new Course(2,"Computer science",5);
		courseArr[1] = new Course(3,"Mechanical Engg",2);
		courseArr[2] = new Course(1,"Information Technology",1);
		System.out.println("Using Comparable !! ");
		Arrays.sort(courseArr);
		for(Course eachCourse :  courseArr)
			{
				System.out.println(eachCourse);
			}
		System.out.println("Using Comparator !! ");
		Arrays.sort(courseArr,new CourseComparator());
		for(Course eachCourse :  courseArr)
			{
				System.out.println(eachCourse);
			}
	}
}

/*OUTPUT:
	Course [courseId=1, courseName=Information Technology, allocated=1]
			Course [courseId=2, courseName=Computer science, allocated=5]
			Course [courseId=3, courseName=Mechanical Engg, allocated=2]
			Course [courseId=2, courseName=Computer science, allocated=5]
			Course [courseId=1, courseName=Information Technology, allocated=1]
			Course [courseId=3, courseName=Mechanical Engg, allocated=2]*/
	
