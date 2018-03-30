package com.pradeep.shapes;

import com.pradeep.GenericShape.Shape;

public class Rectangle extends Shape{
	
	private float length;
	private float width;
	private String name;
		
		public Rectangle(String name, float length, float width){
			this.name = name;
			this.length = length;
			this.width = width;
		}

	@Override
	public float getArea() {
	
		return length*width;
	}

	@Override
	public String toString() {
		
		return name;
	}

}
