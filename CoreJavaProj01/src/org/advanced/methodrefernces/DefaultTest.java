package org.advanced.methodrefernces;

public interface DefaultTest {

	public void showdetail();

	default public int getNumMax() {
		return Integer.MAX_VALUE;
	}

	default public int getNumMin() {
		return Integer.MIN_VALUE;
	}

}
