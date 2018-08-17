package org.advanced.generics;

public class InferenceMain {

	public static void main(String[] args) {

		Container<Integer> IntContainer =new Container<>();
		IntContainer.setT(12);
		System.out.println(IntContainer.getT());
		
		Container<Float> FloatContainer =new Container<>();
		FloatContainer.setT(12.0f);
		System.out.println(FloatContainer.getT());

	}

}

class Container<T>
{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}


/*OUTPUT
12
12.0*/