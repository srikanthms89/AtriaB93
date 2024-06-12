package com.tnsif.day8.overloading;
//Constructor overloading
public class Point {
	
	
	private float x;
	private float y;
	private float z;
	
	
	public Point() {
		super();
	}

	public Point(float x) {
		this.x = x;
		
	}

	public Point(float x, float y) {
		
		this.x = x;
		this.y = y;
		
	}
	public Point(float x, float y, float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
	
	

}
