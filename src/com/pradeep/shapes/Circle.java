package com.pradeep.shapes;

import com.pradeep.GenericShape.Shape;

public class Circle extends Shape{
	
	private String name;
	private float radius;
	
	
	public Circle(String name, float radius){
		this.name = name;
		this.radius = radius;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return (float) (3.14*radius*radius);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}
