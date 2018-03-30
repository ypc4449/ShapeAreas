package com.pradeep.shapes;

import com.pradeep.GenericShape.Shape;

public class Square extends Shape {
	
	private String name;
	private float side;
	
	public Square(String name, float side){
		this.name = name;
		this.side = side;
	}


	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}
