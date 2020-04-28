package org.advanced.streams;

public class Sedans {
	
	int id;
	String brand;
	int cubicCapacity;
	String model;
	/**
	 * @param brand
	 * @param cubicCapacity
	 * @param model
	 */
	public Sedans(int id,String brand, int cubicCapacity, String model) {
		super();
		this.id = id;
		this.brand = brand;
		this.cubicCapacity = cubicCapacity;
		this.model = model;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Sedans [id=" + id + ", brand=" + brand + ", cubicCapacity=" + cubicCapacity + ", model=" + model + "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the cubicCapacity
	 */
	public int getCubicCapacity() {
		return cubicCapacity;
	}
	/**
	 * @param cubicCapacity the cubicCapacity to set
	 */
	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
