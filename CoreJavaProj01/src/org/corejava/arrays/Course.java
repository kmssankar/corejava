package org.corejava.arrays;

public class Course implements Comparable<Course>{

	int courseId;
	String courseName;
	int allocated;
	@Override
	public int compareTo(Course course) {
		return this.courseId - course.courseId;
	}
	/**
	 * @param courseId
	 * @param courseName
	 * @param allocated
	 */
	public Course(int courseId, String courseName, int allocated) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.allocated = allocated;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", allocated=" + allocated + "]";
	}
	
}
