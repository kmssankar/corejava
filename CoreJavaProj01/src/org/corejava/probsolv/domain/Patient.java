package org.corejava.probsolv.domain;

import java.util.Date;

public class Patient {

	String name;
	String mrnId;
	String gender;
	String physicianId;
	Date admitteddt;
	Date dschrgedt;
	int billAmnt;
	
	
	public void calc() {
		int billAnmt =5;
		System.out.println(billAnmt);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the mrnId
	 */
	public String getMrnId() {
		return mrnId;
	}
	/**
	 * @param mrnId the mrnId to set
	 */
	public void setMrnId(String mrnId) {
		this.mrnId = mrnId;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the physicianId
	 */
	public String getPhysicianId() {
		return physicianId;
	}
	/**
	 * @param physicianId the physicianId to set
	 */
	public void setPhysicianId(String physicianId) {
		this.physicianId = physicianId;
	}
	/**
	 * @return the admitteddt
	 */
	public Date getAdmitteddt() {
		return admitteddt;
	}
	/**
	 * @param admitteddt the admitteddt to set
	 */
	public void setAdmitteddt(Date admitteddt) {
		this.admitteddt = admitteddt;
	}
	/**
	 * @return the dschrgedt
	 */
	public Date getDschrgedt() {
		return dschrgedt;
	}
	/**
	 * @param dschrgedt the dschrgedt to set
	 */
	public void setDschrgedt(Date dschrgedt) {
		this.dschrgedt = dschrgedt;
	}
	/**
	 * @return the billAmnt
	 */
	public int getBillAmnt() {
		return billAmnt;
	}
	/**
	 * @param billAmnt the billAmnt to set
	 */
	public void setBillAmnt(int billAmnt) {
		this.billAmnt = billAmnt;
	}
	
	
}
