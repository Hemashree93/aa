package com.xworkz.Resort.app;

public class ResortImpl implements Resort{
	private int noofitems;
	private String type;
	
	public ResortImpl(int noofitems, String type) {
		System.out.println("created \t" + this.getClass().getSimpleName());
		System.out.println(noofitems);
		System.out.println(type);
	}
		
	
	public void shopping() {
		System.out.println("invoked shopping");
		
	}
	

}
