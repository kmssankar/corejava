package org.corejava.clone;

public class CloneChild extends CloneBase{

	String descr;
	public CloneChild(int id, String name,String descr) {
		super(id, name);
		System.out.println("Clone Child Called !!");
		this.descr = descr;
	}
	
	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Override
	public String toString() {
		return "CloneChild [descr=" + descr + ", id=" + id + ", Name=" + Name + "]";
	}
}
