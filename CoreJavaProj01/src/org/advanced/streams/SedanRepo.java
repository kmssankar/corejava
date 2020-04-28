package org.advanced.streams;

import java.util.HashMap;
import java.util.Map;

public class SedanRepo {
	
	Map<Integer,Sedans> sedanMap = new HashMap<>();
	
	SedanRepo(){
		this.sedanMap.put(1, new Sedans(1,"VW",2000,"Jetta"));
		this.sedanMap.put(2, new Sedans(2,"Audi",2000,"A3"));
		this.sedanMap.put(3, new Sedans(3,"Audi",3500,"A6"));
		this.sedanMap.put(4, new Sedans(4,"BMW",1998,"520D"));
		this.sedanMap.put(5, new Sedans(5,"BMW",1998,"520D"));
		this.sedanMap.put(6, new Sedans(6,"BMW",2450,"M6"));
	}
	
	public Sedans getSedan(int  id) {
		return sedanMap.get(id);
	}
	

}
